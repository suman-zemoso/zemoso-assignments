
CREATE SCHEMA IF NOT EXISTS `IRCTC` ;
USE `IRCTC` ;

CREATE TABLE IF NOT EXISTS `IRCTC`.`customer` (
  `customer-id` INT NOT NULL,
  `first-name` VARCHAR(20) NOT NULL,
  `last-name` VARCHAR(20) NULL,
  `age` INT NOT NULL,
  `gender` ENUM('male', 'female') NULL,
  `type` ENUM('normal', 'senior citizen', 'vip') NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`));


CREATE TABLE IF NOT EXISTS `IRCTC`.`train` (
  `train-id` INT NOT NULL,
  `name` VARCHAR(10) NOT NULL,
  `source` VARCHAR(45) NOT NULL,
  `destination` VARCHAR(45) NOT NULL,
  `type` ENUM('local', 'express') NOT NULL,
  `number-of-stops` INT NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`train-id`));


CREATE TABLE IF NOT EXISTS `IRCTC`.`ticket` (
  `ticket-id` INT NOT NULL,
  `source` VARCHAR(45) NOT NULL,
  `destination` VARCHAR(45) NOT NULL,
  `type` ENUM('reserved', 'unreserved') NOT NULL,
  `cost` INT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`ticket-id`));


CREATE TABLE IF NOT EXISTS `IRCTC`.`reserved_ticket` (
  `ticket-id` INT NOT NULL,
  `seat-tier` ENUM('sleeper', '3a', '2a') NULL,
  `pnr` INT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`ticket-id`),
  CONSTRAINT `fk_reserved_ticket_1`
    FOREIGN KEY (`ticket-id`)
    REFERENCES `IRCTC`.`ticket` (`ticket-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);



CREATE TABLE IF NOT EXISTS `IRCTC`.`unreserved_ticket` (
  `ticket-id` INT NOT NULL,
  `pnr` INT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`ticket-id`),
  CONSTRAINT `fk_unreserved_ticket_1`
    FOREIGN KEY (`ticket-id`)
    REFERENCES `IRCTC`.`ticket` (`ticket-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


CREATE TABLE IF NOT EXISTS `IRCTC`.`customer_reserved_ticket_train` (
  `customer-id` INT NOT NULL,
  `ticket-id` INT NOT NULL,
  `train-id` INT NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`, `ticket-id`, `train-id`),
  CONSTRAINT `fk_customer_reserved_ticket_1`
    FOREIGN KEY (`customer-id`)
    REFERENCES `IRCTC`.`customer` (`customer-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_customer_reserved_ticket_2`
    FOREIGN KEY (`ticket-id`)
    REFERENCES `IRCTC`.`reserved_ticket` (`ticket-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_customer_reserved_ticket_3`
    FOREIGN KEY (`train-id`)
    REFERENCES `IRCTC`.`train` (`train-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


CREATE TABLE IF NOT EXISTS `IRCTC`.`customer_unreserved_ticket` (
  `customer-id` INT NOT NULL,
  `ticket-id` INT NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`, `ticket-id`),
  CONSTRAINT `fk_customer_unreserved_ticket_1`
    FOREIGN KEY (`customer-id`)
    REFERENCES `IRCTC`.`customer` (`customer-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_customer_unreserved_ticket_2`
    FOREIGN KEY (`ticket-id`)
    REFERENCES `IRCTC`.`unreserved_ticket` (`ticket-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);



