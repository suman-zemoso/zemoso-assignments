
CREATE SCHEMA IF NOT EXISTS `cab_rental` ;
USE `cab_rental` ;

CREATE TABLE IF NOT EXISTS `driver` (
  `driver-id` INT NOT NULL,
  `first-name` VARCHAR(45) NOT NULL,
  `last-name` VARCHAR(45) NULL,
  `age` INT NOT NULL,
  `gender` ENUM('male', 'female') NOT NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`driver-id`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `customer` (
  `customer-id` INT NOT NULL,
  `first-name` VARCHAR(20) NOT NULL,
  `last-name` VARCHAR(20) NULL,
  `age` INT NOT NULL,
  `gender` ENUM('male', 'female') NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`));


CREATE TABLE IF NOT EXISTS `cab` (
  `cab-id` INT NOT NULL,
  `car model` VARCHAR(30) NOT NULL,
  `number-plate` VARCHAR(45) NOT NULL,
  `pasenger-capacity` INT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`cab-id`));


CREATE TABLE IF NOT EXISTS `driver_cab` (
  `driver-id` INT NOT NULL,
  `cab-id` INT NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`driver-id`, `cab-id`),
  CONSTRAINT `fk_driving_1`
    FOREIGN KEY (`driver-id`)
    REFERENCES `driver` (`driver-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_driving_2`
    FOREIGN KEY (`cab-id`)
    REFERENCES `cab` (`cab-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);

CREATE TABLE IF NOT EXISTS `customer_cab` (
  `customer-id` INT NOT NULL,
  `cab-id` INT NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`, `cab-id`),
  CONSTRAINT `fk_riding_1`
    FOREIGN KEY (`customer-id`)
    REFERENCES `customer` (`customer-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_riding_2`
    FOREIGN KEY (`cab-id`)
    REFERENCES `cab` (`cab-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


