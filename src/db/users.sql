-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2025 at 12:31 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `somer_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `u_id` int(10) NOT NULL,
  `u_fname` varchar(255) NOT NULL,
  `u_lname` varchar(255) NOT NULL,
  `u_contact` varchar(50) NOT NULL,
  `u_type` varchar(255) NOT NULL,
  `u_email` varchar(255) NOT NULL,
  `u_un` varchar(50) NOT NULL,
  `u_pass` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`u_id`, `u_fname`, `u_lname`, `u_contact`, `u_type`, `u_email`, `u_un`, `u_pass`, `status`) VALUES
(1, 'jodee', 'somera', '09123123322', 'Admin', 'jods@gmail.com', 'jods123', 'jods123123', 'Pending'),
(2, 'jods', 'somer', '09123123123', 'Admin', 'jodee@gmail.com', 'jods222', 'jodee123', 'Active'),
(3, 'dwayne', 'some', '09123321211', 'User', 'somera@gmail.com', 'dwayne', 'jodee321', 'Active'),
(4, 'jd', 'som', '09123322222', 'Admin', 'jade@gmail.com', 'jd123123', 'pass123123', 'Active'),
(5, 'qweqwe', 'qweqwe', '09231123122', 'Admin', 'qwe@gmail.com', 'qweqwe', 'jd123', 'Active'),
(6, 'awqeawqe', 'aqweaqwe', '09123123121', 'Admin', 'jos@gmail.com', 'asdasd', 'somera123123', 'Pending'),
(7, 'JDsomera', 'dwayne', '09123121231', 'Admin', 'somerajd@gmail.com', 'somera123', 'somerajodee123', 'Active'),
(8, 'aweawe', 'aweawe', '09123123123', 'Admin', 'aweawe@gmail.com', 'jodeedwayne', 'jodee321321', 'Active'),
(9, 'aweaqwe', 'aweaqweaqwe', '09123123121', 'Admin', 'sdaw@gmail.com', 'jods123123', 'jodee123123', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
