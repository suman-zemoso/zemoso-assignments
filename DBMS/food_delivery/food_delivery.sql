
CREATE SCHEMA IF NOT EXISTS `food_delivery2` ;
USE `food_delivery2` ;

CREATE TABLE IF NOT EXISTS `food_delivery2`.`customer` (
  `customer-id` INT NOT NULL,
  `first-name` VARCHAR(20) NOT NULL,
  `last-name` VARCHAR(20) NULL,
  `age` INT NOT NULL,
  `gender` ENUM('male', 'female') NULL,
  `address` VARCHAR(150) NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`));


CREATE TABLE IF NOT EXISTS `food_delivery2`.`delivery_person` (
  `delivery_person-id` INT NOT NULL,
  `first-name` VARCHAR(20) NOT NULL,
  `last-name` VARCHAR(20) NULL,
  `age` INT NOT NULL,
  `gender` ENUM('male', 'female') NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`delivery_person-id`));


CREATE TABLE IF NOT EXISTS `food_delivery2`.`restaurant` (
  `restaurant-id` INT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `cousine` VARCHAR(45) NULL,
  `address` VARCHAR(150) NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`restaurant-id`));


CREATE TABLE IF NOT EXISTS `food_delivery2`.`food-order` (
  `order-id` INT NOT NULL,
  `customer-id` INT NOT NULL,
  `restaurant-id` INT NOT NULL,
  `delivery_person-id` INT NOT NULL,
  `items` VARCHAR(45) NULL,
  `date-of-booking` DATE NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`order-id`),
  UNIQUE (`customer-id`, `date-of-booking`),
  CONSTRAINT `fk_order_1`
    FOREIGN KEY (`customer-id`)
    REFERENCES `food_delivery2`.`customer` (`customer-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_order_2`
    FOREIGN KEY (`restaurant-id`)
    REFERENCES `food_delivery2`.`restaurant` (`restaurant-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_order_3`
    FOREIGN KEY (`delivery_person-id`)
    REFERENCES `food_delivery2`.`delivery_person` (`delivery_person-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);



