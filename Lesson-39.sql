SELECT mn.name, m.name, m.inStock, q.count, p.value, p.max_discount FROM models m
	JOIN sellers s ON s.id = m.seller_id
	JOIN offices o ON o.id = s.office_id
	JOIN quantity q ON q.model_id = m.id
	JOIN prices p ON p.id = m.price_id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
	JOIN countries c ON c.id = mn.country_id
	JOIN regions r ON r.id = c.region_id
	
	
-- Найти страну с максимальной капитализацией всех её производителей
SELECT c.name, SUM(mn.capitalization) FROM manufacturers mn
	JOIN countries c ON c.id = mn.country_id
GROUP BY c.name
ORDER BY SUM(mn.capitalization)
DESC
LIMIT 1


-- Найти страну с максимальной капитализацией всех её производителей
SELECT c.name, SUM(mn.capitalization) FROM manufacturers mn
	JOIN countries c ON c.id = mn.country_id
GROUP BY c.name
HAVING SUM(mn.capitalization) = 
(SELECT SUM(manufacturers.capitalization) FROM manufacturers
	JOIN countries ON countries.id = manufacturers.country_id
GROUP BY countries.name
ORDER BY SUM(manufacturers.capitalization)
DESC
LIMIT 1)


-- Вывести всю доступную информацию о моделе: имя производителя, имя модели, цена, остаток, страна производства
SELECT mn.name, m.name, p.value, q.count, c.name FROM models m
	JOIN quantity q ON q.model_id = m.id
	JOIN prices p ON p.id = m.price_id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
	JOIN countries c ON c.id = mn.country_id
	
	
-- Вывести все автомобили и их продавцов, которыми занимаются сотрудники офиса ‘Laconia’ 
SELECT m.name, s.first_name, s.last_name, o.name FROM models m
	JOIN sellers s ON s.id = m.seller_id
	JOIN offices o ON o.id = s.office_id
WHERE o.id = (SELECT id FROM offices WHERE name = 'Laconia')


-- Найти марку с наибольшим количеством автомобилей в системе

SELECT mn.name, SUM(q.count) FROM models m
	JOIN quantity q ON q.model_id = m.id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
GROUP BY mn.name
HAVING SUM(q.count) = 
(SELECT SUM(quantity.count) FROM models
	JOIN quantity ON quantity.model_id = models.id
	JOIN manufacturers ON manufacturers.id = models.manufacturer_id
GROUP BY manufacturers.name
ORDER BY SUM(quantity.count)
DESC
LIMIT 1)


-- Найти все модели, что может купить потребитель

SELECT mn.name, m.name, m.inStock, q.count FROM models m
	JOIN quantity q ON q.model_id = m.id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
WHERE m.inStock = true AND q.count > 0


-- Вывести среднее значение цены всех доступных к продаже автомобилей

SELECT AVG(p.value) FROM models m
	JOIN quantity q ON q.model_id = m.id
	JOIN prices p ON p.id = m.price_id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
WHERE m.inStock = true AND q.count > 0


-- Вывести среднее значение цены всех доступных к продаже автомобилей

SELECT SUM(p.value * q.count) / SUM(q.count) FROM models m
	JOIN quantity q ON q.model_id = m.id
	JOIN prices p ON p.id = m.price_id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
WHERE m.inStock = true AND q.count > 0


-- Вывести общую стоимость всех автомобилей марки ‘Horch’

SELECT SUM(q.count * p.value) FROM models m
	JOIN quantity q ON q.model_id = m.id
	JOIN prices p ON p.id = m.price_id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
WHERE mn.name = 'Horch' AND q.count > 0


-- Вывести все модели, которые продает самый востребованный продавец

SELECT mn.name, m.name FROM models m
	JOIN sellers s ON s.id = m.seller_id
	JOIN quantity q ON q.model_id = m.id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
WHERE s.id = 
(SELECT s.id FROM models m
	JOIN sellers s ON s.id = m.seller_id
	JOIN quantity q ON q.model_id = m.id
	JOIN manufacturers mn ON mn.id = m.manufacturer_id
GROUP BY s.id
ORDER BY SUM(q.count)
DESC 
LIMIT 1)

