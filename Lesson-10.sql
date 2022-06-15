-- 
SELECT * FROM phones

SELECT manufacturer AS производитель, model, price, price * quantity AS total, price * 0.87 FROM phones

-- SORTING
SELECT * FROM phones
ORDER BY model
DESC

SELECT * FROM phones
ORDER BY price
DESC
LIMIT 5

--FILTERING
SELECT * FROM phones WHERE price >= 50000 AND quantity > 10 AND manufacturer = 'Apple'

SELECT * FROM phones WHERE price >= 50000 AND price <= 100000
SELECT * FROM phones WHERE price BETWEEN 50000 AND 100000

-- Вывести все телефоны, произведенные не Apple
SELECT * FROM phones WHERE manufacturer != 'Apple'

-- Вывести все телефоны, произведенные LG, Motorola & Samsung
SELECT * FROM phones WHERE manufacturer = 'LG' OR manufacturer = 'Motorola' OR manufacturer = 'Samsung'
SELECT * FROM phones WHERE manufacturer IN ('LG', 'Motorola', 'Samsung')

-- Вывести все телефоны, произведенные не LG, Motorola & Samsung
SELECT * FROM phones WHERE manufacturer NOT IN ('LG', 'Motorola', 'Samsung')

SELECT * FROM phones WHERE price >= 50000 AND quantity > 10 AND manufacturer = 'Apple'
ORDER BY price
DESC
LIMIT 3

