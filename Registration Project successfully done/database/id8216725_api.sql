-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 04, 2019 at 08:30 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id8216725_api`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_data`
--

CREATE TABLE `employee_data` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `username` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_data`
--

INSERT INTO `employee_data` (`id`, `name`, `username`, `password`) VALUES
(1, 'rajesh', '123', '123'),
(2, 'ra', 'es', 'ds'),
(3, 'ra', 'es', 'ds');

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

CREATE TABLE `login_info` (
  `id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `user_status` varchar(255) NOT NULL,
  `user_created_at` date NOT NULL,
  `user_updated_at` varchar(255) NOT NULL,
  `user_login_count` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`id`, `user_name`, `user_password`, `user_email`, `user_status`, `user_created_at`, `user_updated_at`, `user_login_count`) VALUES
(1, 'rajesh', 'gupta123', 'rk@g.com', 'active', '2018-12-15', '', '0'),
(2, 'rajesh', 'gupta123', 'rk1@g.com', 'active', '2018-12-15', '', '0'),
(3, 'rajesh', 'gupta123', 'rkumar@gmail.com', 'active', '2018-12-22', '', '0'),
(4, 'fgh', 'chj', 'ghh', 'active', '2019-01-04', '', '0'),
(5, 'fgh', 'chj', 'cbn', 'active', '2019-01-04', '', '0'),
(6, 'gjj', 'bjjj', 'gjj', 'active', '2019-01-04', '', '0'),
(7, 'fgh', 'cvbj', 'dghh', 'active', '2019-01-04', '', '0'),
(8, 'fgggg', '123', 'fgggg', 'active', '2019-01-04', '', '0'),
(9, 'raj', '987', 'raj', 'active', '2019-01-04', '', '0'),
(10, 'ttt', '123', 'ttyt', 'active', '2019-01-04', '', '0'),
(11, 'ghj', 'fhh', 'gjk', 'active', '2019-01-04', '', '0'),
(12, 'fhh', 'vjj', 'gbnn', 'active', '2019-01-04', '', '0'),
(13, 'ggg', 'ffff', 'hhh', 'active', '2019-01-04', '', '0');

-- --------------------------------------------------------

--
-- Table structure for table `registration_info`
--

CREATE TABLE `registration_info` (
  `id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `user_status` varchar(255) NOT NULL,
  `user_nick_name` varchar(255) NOT NULL,
  `user_display_name` varchar(255) NOT NULL,
  `user_created_at` date NOT NULL,
  `user_updated_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration_info`
--

INSERT INTO `registration_info` (`id`, `user_name`, `user_password`, `user_email`, `user_status`, `user_nick_name`, `user_display_name`, `user_created_at`, `user_updated_at`) VALUES
(1, 'rajesh', 'gupta123', 'rk@g.com', 'active', 'rajesh', 'rajesh', '2018-12-15', '0000-00-00'),
(2, 'rajesh', 'gupta123', 'rk1@g.com', 'active', 'rajesh', 'rajesh', '2018-12-15', '0000-00-00'),
(3, 'rajesh', 'gupta123', 'rkumar@gmail.com', 'active', 'rajesh', 'rajesh', '2018-12-22', '0000-00-00'),
(4, 'fgh', 'chj', 'ghh', 'active', 'fgh', 'fgh', '2019-01-04', '0000-00-00'),
(5, 'fgh', 'chj', 'cbn', 'active', 'fgh', 'fgh', '2019-01-04', '0000-00-00'),
(6, 'gjj', 'bjjj', 'gjj', 'active', 'gjj', 'gjj', '2019-01-04', '0000-00-00'),
(7, 'fgh', 'cvbj', 'dghh', 'active', 'fgh', 'fgh', '2019-01-04', '0000-00-00'),
(8, 'fgggg', '123', 'fgggg', 'active', 'fgggg', 'fgggg', '2019-01-04', '0000-00-00'),
(9, 'raj', '987', 'raj', 'active', 'raj', 'raj', '2019-01-04', '0000-00-00'),
(10, 'ttt', '123', 'ttyt', 'active', 'ttt', 'ttt', '2019-01-04', '0000-00-00'),
(11, 'ghj', 'fhh', 'gjk', 'active', 'ghj', 'ghj', '2019-01-04', '0000-00-00'),
(12, 'fhh', 'vjj', 'gbnn', 'active', 'fhh', 'fhh', '2019-01-04', '0000-00-00'),
(13, 'ggg', 'ffff', 'hhh', 'active', 'ggg', 'ggg', '2019-01-04', '0000-00-00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_data`
--
ALTER TABLE `employee_data`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login_info`
--
ALTER TABLE `login_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `registration_info`
--
ALTER TABLE `registration_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee_data`
--
ALTER TABLE `employee_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `login_info`
--
ALTER TABLE `login_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `registration_info`
--
ALTER TABLE `registration_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
