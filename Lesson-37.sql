-- Вывести максимальное значение цены
SELECT price FROM phones
ORDER BY price
DESC
LIMIT 1

SELECT MAX(price) FROM phones

-- Агрегатные функции 
SELECT MAX(price) FROM phones
SELECT MIN(price) FROM phones
SELECT AVG(price) FROM phones
SELECT SUM(price) FROM phones
SELECT COUNT(price) FROM phones

SELECT MIN(manufacturer) FROM phones

SELECT MIN(price), MAX(price), AVG(price), SUM(price), COUNT(price) FROM phones

-- Найти "истинное" среднее значение цены
SELECT SUM(price * quantity)/SUM(quantity) FROM phones

-- Вывести информацию о самом дорогом телефоне
SELECT * FROM phones 
ORDER BY price
DESC
LIMIT 1

-- Вывести информацию о самом дорогом телефоне
SELECT * FROM phones WHERE price = (SELECT MAX(price) FROM phones)

-- Вывести информацию о телефонах с ценой, выше среденей
SELECT * FROM phones WHERE price > (SELECT SUM(price * quantity) / SUM(quantity) FROM phones)

-- Вывести информацию о телефонах с ценой, выше среденей, и с количеством меньше среднего
SELECT * FROM phones 
WHERE 
price > (SELECT SUM(price * quantity) / SUM(quantity) FROM phones)
AND 
quantity < (SELECT AVG(quantity) FROM phones)

-- Вывести количество уникальных производителей
SELECT COUNT(DISTINCT(manufacturer)) FROM phones 

-- Вывести производителей и среднюю цену за их продукцию
SELECT manufacturer, AVG(price) FROM phones
GROUP BY manufacturer

-- 
SELECT manufacturer, model, AVG(price), MIN(price), SUM(quantity) FROM phones
GROUP BY manufacturer, model

-- когда нужно вывести телефоны с одинаковой ценой
SELECT price, COUNT(model) FROM phones
GROUP BY price
HAVING COUNT(price) > 1

-- Вывести производителей и среднюю цену за их продукцию, которая больше 50000
SELECT manufacturer, ROUND(AVG(price), 0) FROM phones
GROUP BY manufacturer
HAVING AVG(price) > 50000

-- Вывести производителей и среднюю цену за их продукцию, которая больше 50000
SELECT manufacturer, ROUND(SUM(price * quantity) / SUM(quantity), 0) FROM phones WHERE quantity > 0
GROUP BY manufacturer
HAVING (SUM(price * quantity) / SUM(quantity))> 50000