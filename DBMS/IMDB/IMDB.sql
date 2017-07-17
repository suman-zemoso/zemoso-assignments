
CREATE SCHEMA IF NOT EXISTS `IMDB` ;
USE `IMDB` ;

CREATE TABLE IF NOT EXISTS `IMDB`.`actor` (
  `actor-id` INT NOT NULL,
  `first-name` VARCHAR(20) NOT NULL,
  `last-name` VARCHAR(20) NULL,
  `age` INT NOT NULL,
  `gender` ENUM('male', 'female') NULL,
  `experience` INT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`actor-id`));


CREATE TABLE IF NOT EXISTS `IMDB`.`movie` (
  `movie-id` INT NOT NULL,
  `actor-id` INT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `rating` INT NULL,
  `genre` VARCHAR(45) NOT NULL,
  `budget` INT NULL,
  `release-year` INT NOT NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`movie-id`),
  UNIQUE (`actor-id`),
  CONSTRAINT `fk_movie_1`
    FOREIGN KEY (`actor-id`)
    REFERENCES `IMDB`.`actor` (`actor-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


CREATE TABLE IF NOT EXISTS `IMDB`.`tv_series` (
  `tv_series-id` INT NOT NULL,
  `actor-id` INT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `genre` VARCHAR(45) NULL,
  `status` ENUM('running', 'stopped') NULL,
  `created-by` VARCHAR(40) NOT NULL,
  `created-at` DATETIME NOT NULL,
  `modified-by` VARCHAR(40) NOT NULL,
  `modified-at` DATETIME NOT NULL,
  PRIMARY KEY (`tv_series-id`),
  UNIQUE (`actor-id`),
  CONSTRAINT `fk_tv_series_1`
    FOREIGN KEY (`actor-id`)
    REFERENCES `IMDB`.`actor` (`actor-id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


