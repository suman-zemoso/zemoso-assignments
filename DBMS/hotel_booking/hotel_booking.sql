CREATE SCHEMA IF NOT EXISTS `hotel_booking` ;
USE `hotel_booking` ;

CREATE TABLE IF NOT EXISTS `hotel_booking`.`customer` (
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


CREATE TABLE IF NOT EXISTS `hotel_booking`.`hotel` (
  `hotel-id` INT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `rating` INT NULL,
  `type` VARCHAR(45) NULL,
  `address` VARCHAR(150) NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`hotel-id`));


CREATE TABLE IF NOT EXISTS `hotel_booking`.`customer_hotel` (
  `booking-id` INT NOT NULL,
  `customer-id` INT NOT NULL,
  `hotel-id` INT NOT NULL,
  `duration_in_days` INT NULL,
  `type_of_customer` ENUM('first-time', 'loyal') NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`booking-id`),
  UNIQUE (`customer-id`, `created-at`),
  CONSTRAINT `fk_bookings_1`
    FOREIGN KEY (`customer-id`)
    REFERENCES `hotel_booking`.`customer` (`customer-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_bookings_2`
    FOREIGN KEY (`hotel-id`)
    REFERENCES `hotel_booking`.`hotel` (`hotel-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);



