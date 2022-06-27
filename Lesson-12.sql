CREATE TABLE `stc2210`.`cars` (
  `idCars` INT NOT NULL,
  `manufacturer` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `price` INT NOT NULL DEFAULT 0,
  `quantity` INT NOT NULL DEFAULT 0,
  `year` INT NOT NULL DEFAULT 2022,
  `color` VARCHAR(45) NOT NULL DEFAULT 'white',
  `country` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCars`));


INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('1', 'Lada', 'Granta Classic', '700', '5', '2021', 'white', 'RUS');
INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('2', 'Kia', 'Rio', '1100', '2', '2022', 'green', 'SKO');
INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('3', 'Lada', 'Vesta', '1000', '3', '2020', 'blue', 'RUS');
INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('4', 'Skoda', 'Rapid', '1300', '6', '2021', 'white', 'CZ');
INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('5', 'Renault', 'Kaptur', '1500', '1', '2022', 'red', 'FR');
INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('6', 'Kia', 'Rio X', '1200', '2', '2020', 'orange', 'SKO');
INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('7', 'Lada', 'Granta', '650', '3', '2021', 'green', 'RUS');
INSERT INTO `stc2210`.`cars` (`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`) VALUES ('8', 'Renault', 'Logan', '900', '0', '2019', 'blue', 'FR');


CREATE DEFINER=`root`@`localhost` PROCEDURE `find_most_expensive_car`()
BEGIN
	SELECT * FROM stc2210.cars
	WHERE price = (SELECT MAX(price) FROM stc2210.cars);
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `find_cars_in_range`(IN first_price INT, IN second_price INT)
BEGIN
	IF first_price > second_price
    THEN
		SELECT * FROM stc2210.cars WHERE price BETWEEN second_price AND first_price;
	ELSE
		SELECT * FROM stc2210.cars WHERE price BETWEEN first_price AND second_price;
	END IF;
END


CREATE DEFINER=`root`@`localhost` FUNCTION `find_max_idCars`() RETURNS int
    DETERMINISTIC
BEGIN
	DECLARE idx INT;
    SELECT MAX(idCars) INTO idx FROM stc2210.cars;
	RETURN idx;
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `add_car_without_idCars`(IN manufacturer VARCHAR(45), IN model VARCHAR(45), IN price INT, IN quantity INT, IN year INT, IN color VARCHAR(45), IN country VARCHAR(45))
BEGIN
	DECLARE id INT;
    SET id = stc2210.find_max_idCars() + 1;

	INSERT INTO `stc2210`.`cars`
	(`idCars`, `manufacturer`, `model`, `price`, `quantity`, `year`, `color`, `country`)
	VALUES
	(id, manufacturer, model, price, quantity, year, color, country);
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `update_old_cars`(IN discount INT)
BEGIN
	UPDATE stc2210.cars
    SET price = price * (100 - discount) / 100
    WHERE year <= 2020 AND quantity > 0;
END

