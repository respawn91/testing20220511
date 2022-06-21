-- ROUND
SELECT ROUND(AVG(price), 2) FROM phones

-- Aggregate
SELECT MAX(price), MIN(price), AVG(price), SUM(price), COUNT(price) FROM phones

-- Вывести значение максимальной цены
SELECT MAX(price) FROM phones

SELECT price FROM phones
ORDER BY price
DESC
LIMIT 1


-- Вывести информацию о телефоне с наибольшей ценой
SELECT * FROM phones
ORDER BY price
DESC
LIMIT 1

SELECT * FROM phones
WHERE price = (SELECT MAX(price) FROM phones)

-- Вывести информацию о телефонах с ценой выше среднего
SELECT * FROM phones
WHERE price > (SELECT AVG(price) FROM phones)

-- Вывести "настоящую" среднюю цену товаров
SELECT SUM(price * quantity)/SUM(quantity) FROM phones

-- Вывести список производителей
SELECT DISTINCT(manufacturer) FROM phones

-- Вывести количество производителей
SELECT COUNT(DISTINCT(manufacturer)) FROM phones

-- Кот Коту Нация!
SELECT CONCAT(manufacturer, ' ', model) FROM phones

-- Вывести среднюю цену по производителям
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones
GROUP BY manufacturer

SELECT manufacturer, MAX(price), MIN(model), AVG(quantity), SUM(price), COUNT(model) FROM phones
GROUP BY manufacturer

SELECT price, COUNT(model) FROM phones
GROUP BY price

-- Вывести среднюю цену по производителям со средней ценой выше 50000
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones
GROUP BY manufacturer
HAVING AVG(price) > 50000
ORDER BY AVG(price)
DESC

-- JOIN
SELECT * FROM products
	JOIN manufacturers ON manufacturers.id = products.manufacturer_id
	JOIN prices ON prices.product_id = products.id
	
SELECT * FROM products pd
	JOIN manufacturers m ON m.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
	
SELECT pd.name, m.name, m.location, pc.value, pc.discount FROM products pd
	JOIN manufacturers m ON m.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
	
SELECT * FROM products pd LEFT JOIN prices pc ON pc.product_id = pd.id

SELECT * FROM prices pc RIGHT JOIN products pd ON pc.product_id = pd.id

SELECT * FROM products 
	RIGHT JOIN manufacturers ON manufacturers.id = products.manufacturer_id
	LEFT JOIN prices ON prices.product_id = products.id
	
-- Вывести товары без цен
SELECT * FROM products pd
	LEFT JOIN prices pc ON pc.product_id = pd.id
WHERE pc.value IS null

-- Вывести товары из Москвы с ценой больше 9000
SELECT pd.name, m.name, m.location, pc.value, pc.discount FROM products pd
	JOIN manufacturers m ON m.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
WHERE m.location = 'Moscow' AND pc.value > 9000

SELECT pd.name, m.name, m.location, pc.value, pc.discount FROM products pd
	JOIN manufacturers m ON m.id = pd.manufacturer_id AND m.location = 'Moscow'
	JOIN prices pc ON pc.product_id = pd.id AND pc.value > 9000

-- Вывести производителей и их средние цены, которые больше 9000
SELECT m.name, AVG(pc.value) FROM products pd
	JOIN manufacturers m ON m.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
GROUP BY m.name
HAVING AVG(pc.value) > 9000