-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 06, 2022 at 02:42 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `league_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `leage_table`
--

CREATE TABLE `leage_table` (
  `id` int(23) NOT NULL,
  `name` varchar(23) NOT NULL,
  `P` int(23) NOT NULL,
  `W` int(34) NOT NULL,
  `DR` int(43) NOT NULL,
  `L` int(34) NOT NULL,
  `F` int(34) NOT NULL,
  `A` int(34) NOT NULL,
  `D` int(34) NOT NULL,
  `PTS` int(34) NOT NULL,
  `POS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `leage_table`
--

INSERT INTO `leage_table` (`id`, `name`, `P`, `W`, `DR`, `L`, `F`, `A`, `D`, `PTS`, `POS`) VALUES
(1, 'FC PLATNUM', 29, 19, 7, 3, 44, 11, 33, 64, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
