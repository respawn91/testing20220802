-- Вывести всю информацию
SELECT * FROM products
	JOIN manufacturers ON manufacturers.id = products.manufacturer_id
	JOIN prices ON prices.product_id = products.id
	
	
-- Вывести всю информацию
SELECT pr.name, mn.name, mn.location, pc.value, pc.discount FROM products pr
	JOIN manufacturers mn ON mn.id = pr.manufacturer_id
	JOIN prices pc ON pc.product_id = pr.id
	
-- RIGHT/LEFT JOIN
SELECT pr.name, mn.name, mn.location FROM manufacturers mn LEFT JOIN products pr ON mn.id = pr.manufacturer_id
	
SELECT pr.name, mn.name, mn.location FROM products pr RIGHT JOIN manufacturers mn ON mn.id = pr.manufacturer_id

SELECT pr.name, pc.value, pc.discount FROM products pr LEFT JOIN prices pc ON pc.product_id = pr.id

-- Вывести все неполные данные
SELECT pr.name, mn.name, mn.location, pc.value, pc.discount FROM products pr
	RIGHT JOIN manufacturers mn ON mn.id = pr.manufacturer_id
	LEFT JOIN prices pc ON pc.product_id = pr.id
WHERE pr.name IS null OR pc.value IS null

-- Вывести все товары из Москвы с ценой больше 4000
SELECT pr.name, mn.name, mn.location, pc.value, pc.discount FROM products pr
	JOIN manufacturers mn ON mn.id = pr.manufacturer_id
	JOIN prices pc ON pc.product_id = pr.id
WHERE mn.location = 'Moscow' AND pc.value > 4000

-- Вывести все товары из Москвы с ценой больше 4000
SELECT pr.name, mn.name, mn.location, pc.value, pc.discount FROM products pr
	JOIN manufacturers mn ON mn.id = pr.manufacturer_id AND mn.location = 'Moscow'
	JOIN prices pc ON pc.product_id = pr.id AND pc.value > 4000
	
-- Вывести производителя и среднюю цену на его товары (средняя цена > 8000)
SELECT mn.name, ROUND(AVG(pc.value), 0) FROM products pr
	JOIN manufacturers mn ON mn.id = pr.manufacturer_id
	JOIN prices pc ON pc.product_id = pr.id
GROUP BY mn.name
HAVING AVG(pc.value) > 8000
ORDER BY AVG(pc.value)
DESC


-- Вывести информацию о самом дорогом товаре
SELECT pr.name, mn.name, mn.location, pc.value, pc.discount FROM products pr
	JOIN manufacturers mn ON mn.id = pr.manufacturer_id
	JOIN prices pc ON pc.product_id = pr.id
WHERE pc.value = (SELECT MAX(prc.value) FROM prices prc)

