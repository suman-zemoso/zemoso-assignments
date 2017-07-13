-- Project and Employee Schema

-- Constraints

-- One employee will report to only one person. One person can be reported by many people.

-- One employee will be part of only one project. One project may have multiple employees.

-- Each project must have an employee. There cannot be a project with no employees.

-- Entities : employee, project.

-- Weak Entity : project

-- employee primary key : employee-id

-- project primary key : project-id



CREATE SCHEMA IF NOT EXISTS `mydb`;
USE `mydb` ;

CREATE TABLE IF NOT EXISTS `employee` (
  `employee-id` INT NOT NULL,
  `name` VARCHAR(20) NOT NULL,
  `gender` ENUM('male', 'female') NULL,
  `age` INT NULL,
  `experience` INT NULL,
  `job-title` VARCHAR(20) NULL,
  `created-by` VARCHAR(20) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(20) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`employee-id`));


CREATE TABLE IF NOT EXISTS `report_to` (
  `manager-id` INT NOT NULL,
  `employee-id` INT NOT NULL,
  `created-by` VARCHAR(20) NOT NULL,
  `created-at` DATETIME NULL,
  `modified-by` VARCHAR(20) NOT NULL,
  `modified-at` DATETIME NULL,
  PRIMARY KEY (`manager-id`, `employee-id`),
  CONSTRAINT `fk_report_to_1`
    FOREIGN KEY (`manager-id`)
    REFERENCES `employee` (`employee-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_report_to_2`
    FOREIGN KEY (`employee-id`)
    REFERENCES `employee` (`employee-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


CREATE TABLE IF NOT EXISTS `project` (
  `project-id` INT NOT NULL,
  `project-name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(60) NULL,
  `status` ENUM('completed', 'not completed') NOT NULL,
  `budget` INT NULL,
  `deadline` DATETIME NOT NULL,
  `created-by` VARCHAR(45) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(45) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`project-id`));


CREATE TABLE IF NOT EXISTS `part_of` (
  `employee-id` INT NOT NULL,
  `project-id` INT NOT NULL,
  `created-by` VARCHAR(20) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(20) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`employee-id`, `project-id`),
  CONSTRAINT `fk_part_of_1`
    FOREIGN KEY (`employee-id`)
    REFERENCES `employee` (`employee-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_part_of_2`
    FOREIGN KEY (`project-id`)
    REFERENCES `project` (`project-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


