-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 22, 2024 at 09:16 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_child_register_form`
--

-- --------------------------------------------------------

--
-- Table structure for table `registered_child`
--

DROP TABLE IF EXISTS `registered_child`;
CREATE TABLE IF NOT EXISTS `registered_child` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lastName` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Age` int NOT NULL,
  `Gender` text NOT NULL,
  `Immunizations` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `registered_child`
--

INSERT INTO `registered_child` (`id`, `firstName`, `lastName`, `Age`, `Gender`, `Immunizations`) VALUES
(1, 'Kaizen', 'Chongo', 12, 'male', 'BCG'),
(2, 'Edna', 'Mutale', 7, 'female', 'MMR'),
(3, 'Mutinta ', 'Julia ', 8, 'Female', 'RV'),
(4, 'Kimberly ', 'Lishebo', 4, 'Female', 'DTaP');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
