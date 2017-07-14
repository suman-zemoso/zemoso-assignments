
CREATE SCHEMA IF NOT EXISTS `paytm` ;
USE `paytm` ;

CREATE TABLE IF NOT EXISTS `paytm`.`customer` (
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


CREATE TABLE IF NOT EXISTS `paytm`.`account` (
  `account-id` INT NOT NULL,
  `type` ENUM('savings', 'current') NOT NULL,
  `balance` INT NULL,
  `opened-on` DATETIME NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`account-id`));


CREATE TABLE IF NOT EXISTS `paytm`.`branch` (
  `branch-id` INT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `address` VARCHAR(150) NOT NULL,
  `IFSC` VARCHAR(10) NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`branch-id`));


CREATE TABLE IF NOT EXISTS `paytm`.`customer_account_branch` (
  `customer-id` INT NOT NULL,
  `branch-id` INT NOT NULL,
  `account-id` INT NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`customer-id`, `branch-id`),
  CONSTRAINT `fk_customer_account_branch_1`
    FOREIGN KEY (`customer-id`)
    REFERENCES `paytm`.`customer` (`customer-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_customer_account_branch_2`
    FOREIGN KEY (`branch-id`)
    REFERENCES `paytm`.`branch` (`branch-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_customer_account_branch_3`
    FOREIGN KEY (`account-id`)
    REFERENCES `paytm`.`account` (`account-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


CREATE TABLE IF NOT EXISTS `paytm`.`account_branch` (
  `account-id` INT NOT NULL,
  `branch-id` INT NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`account-id`, `branch-id`),
  CONSTRAINT `fk_account_branch_1`
    FOREIGN KEY (`account-id`)
    REFERENCES `paytm`.`account` (`account-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_account_branch_2`
    FOREIGN KEY (`branch-id`)
    REFERENCES `paytm`.`branch` (`branch-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);



