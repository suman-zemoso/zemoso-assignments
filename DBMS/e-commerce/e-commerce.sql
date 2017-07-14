CREATE SCHEMA IF NOT EXISTS `e-commerce` ;
USE `e-commerce` ;

CREATE TABLE IF NOT EXISTS `supplier` (
  `supplier-id` INT NOT NULL,
  `first-name` VARCHAR(45) NOT NULL,
  `last-name` VARCHAR(45) NULL,
  `buisness-type` VARCHAR(45) NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`supplier-id`));

CREATE TABLE IF NOT EXISTS `customer` (
  `customer-id` INT NOT NULL,
  `first-name` VARCHAR(45) NOT NULL,
  `last-name` VARCHAR(45) NULL,
  `age` INT NOT NULL,
  `gender` ENUM('male', 'female') NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`));


CREATE TABLE IF NOT EXISTS `order` (
  `order-id` INT NOT NULL,
  `bill` INT NOT NULL,
  `payment-mode` ENUM('credit card', 'net banking', 'cod') NOT NULL,
  `status` ENUM('dispatched', 'shipped', 'delivered', 'cancelled') NOT NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NULL,
  PRIMARY KEY (`order-id`));


CREATE TABLE IF NOT EXISTS `ordered` (
  `order-id` INT NOT NULL,
  `customer-id` INT NOT NULL,
  `date-of-order` DATETIME NOT NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`order-id`, `customer-id`),
  CONSTRAINT `fk_ordered_1`
    FOREIGN KEY (`customer-id`)
    REFERENCES `customer` (`customer-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_ordered_2`
    FOREIGN KEY (`order-id`)
    REFERENCES `order` (`order-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


CREATE TABLE IF NOT EXISTS `items` (
  `supplier-id` INT NOT NULL,
  `items-id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `brand` VARCHAR(45) NULL,
  `cost` INT NOT NULL,
  `manufactured-date` DATE NULL,
  `made-in` VARCHAR(45) NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`supplier-id`, `items-id`),
  CONSTRAINT `fk_items_1`
    FOREIGN KEY (`supplier-id`)
    REFERENCES `supplier` (`supplier-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


CREATE TABLE IF NOT EXISTS `include` (
  `order-id` INT NOT NULL,
  `items-id` INT NOT NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`order-id`, `items-id`),
  CONSTRAINT `fk_include_1`
    FOREIGN KEY (`items-id`)
    REFERENCES `items` (`supplier-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_include_2`
    FOREIGN KEY (`order-id`)
    REFERENCES `order` (`order-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


