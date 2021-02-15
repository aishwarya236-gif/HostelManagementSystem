-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 02, 2021 at 07:58 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hostelmanagementsystem`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAllHostel` ()  BEGIN 
 SELECT * FROM hosteldatabase;
 END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAllStudent` ()  BEGIN 
 SELECT * FROM studentdatabase;
 END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `feesdatabase`
--

CREATE TABLE `feesdatabase` (
  `fees_month` varchar(20) DEFAULT NULL,
  `fees_status` varchar(10) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `student_name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feesdatabase`
--

INSERT INTO `feesdatabase` (`fees_month`, `fees_status`, `student_id`, `student_name`) VALUES
('23-7-2018', 'not paid', 101, 'aishwarya'),
('25-7-2018', ' paid', 103, 'ravi'),
('28-7-2018', 'not paid', 102, 'antora');

-- --------------------------------------------------------

--
-- Table structure for table `hosteldatabase`
--

CREATE TABLE `hosteldatabase` (
  `hostel_id` int(11) NOT NULL,
  `no_of_students` int(11) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `annual_fees` int(11) DEFAULT NULL,
  `no_of_rooms` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hosteldatabase`
--

INSERT INTO `hosteldatabase` (`hostel_id`, `no_of_students`, `location`, `annual_fees`, `no_of_rooms`) VALUES
(1001, 20, 'murgeshpaly', 450000, 10),
(1002, 50, 'white field', 60000, 26),
(1003, 60, 'gottigere', 50000, 30);

--
-- Triggers `hosteldatabase`
--
DELIMITER $$
CREATE TRIGGER `insertAuto` AFTER UPDATE ON `hosteldatabase` FOR EACH ROW BEGIN
   INSERT INTO trigdatabase values (new.hostel_id, 'UPDATED'); 
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `messdatabase`
--

CREATE TABLE `messdatabase` (
  `mess_incharge_id` int(11) NOT NULL,
  `monthly_expenses` int(11) DEFAULT NULL,
  `mess_timing` varchar(10) DEFAULT NULL,
  `hostel_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `messdatabase`
--

INSERT INTO `messdatabase` (`mess_incharge_id`, `monthly_expenses`, `mess_timing`, `hostel_id`) VALUES
(9004, 10000, '8:30am ', 1001),
(9321, 12000, '8:30am ', 1002),
(9322, 12000, '8:30am ', 1003);

-- --------------------------------------------------------

--
-- Table structure for table `messempdatabase`
--

CREATE TABLE `messempdatabase` (
  `emp_id` int(11) NOT NULL,
  `emp_name` varchar(20) DEFAULT NULL,
  `emp_address` varchar(20) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `emp_phone` int(11) DEFAULT NULL,
  `hostel_id` int(11) DEFAULT NULL,
  `emp_designation` varchar(20) DEFAULT NULL,
  `mess_incharge_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `messempdatabase`
--

INSERT INTO `messempdatabase` (`emp_id`, `emp_name`, `emp_address`, `salary`, `emp_phone`, `hostel_id`, `emp_designation`, `mess_incharge_id`) VALUES
(8001, 'ajay', 'domlur', 15000, 8272727, 1001, 'cook', 9004),
(8003, 'ramu', 'hebbal', 12000, 8728282, 1002, 'cleaner', 9321),
(8045, 'tamur', 'domlur', 18000, 92929272, 1003, 'cook', 9322);

-- --------------------------------------------------------

--
-- Table structure for table `roomdatabase`
--

CREATE TABLE `roomdatabase` (
  `room_id` int(11) NOT NULL,
  `capacity` int(11) DEFAULT NULL,
  `no_of_beds` int(11) DEFAULT NULL,
  `furniture_type` varchar(20) DEFAULT NULL,
  `hostel_id` int(11) DEFAULT NULL,
  `name_of_student` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roomdatabase`
--

INSERT INTO `roomdatabase` (`room_id`, `capacity`, `no_of_beds`, `furniture_type`, `hostel_id`, `name_of_student`) VALUES
(2001, 2, 2, 'bed, chair, table', 1001, 'aishwarya & antora'),
(2002, 2, 2, 'bed, chair, table', 1002, 'Ravi & Ram'),
(2003, 2, 2, 'bed, chair, table', 1001, 'abc & xyz');

-- --------------------------------------------------------

--
-- Table structure for table `studentdatabase`
--

CREATE TABLE `studentdatabase` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `parent_name` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `date_of_birth` varchar(20) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentdatabase`
--

INSERT INTO `studentdatabase` (`student_id`, `student_name`, `parent_name`, `department`, `address`, `phone`, `age`, `date_of_birth`, `room_id`) VALUES
(101, 'aishwarya', 'rc raut', 'cse', 'murgeshpalya', 273738272, 21, '12-4-1998', 2001),
(102, 'antora', 'anashua', 'cse', 'white field', 92772722, 20, '12-11-1999', 2001),
(103, 'ravi', 'raju', 'cse', 'domlur', 826282282, 21, '23-5-1998', 2002);

-- --------------------------------------------------------

--
-- Table structure for table `trigdatabase`
--

CREATE TABLE `trigdatabase` (
  `hostel_id` int(11) DEFAULT NULL,
  `action` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `trigdatabase`
--

INSERT INTO `trigdatabase` (`hostel_id`, `action`) VALUES
(1002, 'UPDATED'),
(1001, 'UPDATED'),
(1001, 'UPDATED');

-- --------------------------------------------------------

--
-- Table structure for table `visitordatabase`
--

CREATE TABLE `visitordatabase` (
  `visitor_id` int(11) NOT NULL,
  `student_id` int(11) DEFAULT NULL,
  `visitor_name` varchar(20) DEFAULT NULL,
  `time_in` varchar(10) DEFAULT NULL,
  `time_out` varchar(10) DEFAULT NULL,
  `date` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `visitordatabase`
--

INSERT INTO `visitordatabase` (`visitor_id`, `student_id`, `visitor_name`, `time_in`, `time_out`, `date`) VALUES
(4321, 101, 'rc raut', '9:00am', '11:00am', '28-7-2018'),
(4444, 102, 'abc', '9:00am', '11:00am', '29-7-2018'),
(5669, 103, 'acb', '9:00am', '11:00am', '29-7-2018');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `feesdatabase`
--
ALTER TABLE `feesdatabase`
  ADD KEY `stud_` (`student_id`);

--
-- Indexes for table `hosteldatabase`
--
ALTER TABLE `hosteldatabase`
  ADD PRIMARY KEY (`hostel_id`);

--
-- Indexes for table `messdatabase`
--
ALTER TABLE `messdatabase`
  ADD PRIMARY KEY (`mess_incharge_id`),
  ADD KEY `hos` (`hostel_id`) USING BTREE;

--
-- Indexes for table `messempdatabase`
--
ALTER TABLE `messempdatabase`
  ADD PRIMARY KEY (`emp_id`),
  ADD KEY `mess_hostel` (`hostel_id`),
  ADD KEY `mess_incharge` (`mess_incharge_id`);

--
-- Indexes for table `roomdatabase`
--
ALTER TABLE `roomdatabase`
  ADD PRIMARY KEY (`room_id`),
  ADD KEY `hostel` (`hostel_id`);

--
-- Indexes for table `studentdatabase`
--
ALTER TABLE `studentdatabase`
  ADD PRIMARY KEY (`student_id`),
  ADD KEY `student` (`room_id`);

--
-- Indexes for table `visitordatabase`
--
ALTER TABLE `visitordatabase`
  ADD PRIMARY KEY (`visitor_id`),
  ADD KEY `stud` (`student_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `feesdatabase`
--
ALTER TABLE `feesdatabase`
  ADD CONSTRAINT `stud_` FOREIGN KEY (`student_id`) REFERENCES `studentdatabase` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `messdatabase`
--
ALTER TABLE `messdatabase`
  ADD CONSTRAINT `hos` FOREIGN KEY (`hostel_id`) REFERENCES `hosteldatabase` (`hostel_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `messempdatabase`
--
ALTER TABLE `messempdatabase`
  ADD CONSTRAINT `mess_hostel` FOREIGN KEY (`hostel_id`) REFERENCES `hosteldatabase` (`hostel_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mess_incharge` FOREIGN KEY (`mess_incharge_id`) REFERENCES `messdatabase` (`mess_incharge_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `roomdatabase`
--
ALTER TABLE `roomdatabase`
  ADD CONSTRAINT `hostel` FOREIGN KEY (`hostel_id`) REFERENCES `hosteldatabase` (`hostel_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `studentdatabase`
--
ALTER TABLE `studentdatabase`
  ADD CONSTRAINT `student` FOREIGN KEY (`room_id`) REFERENCES `roomdatabase` (`room_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `visitordatabase`
--
ALTER TABLE `visitordatabase`
  ADD CONSTRAINT `stud` FOREIGN KEY (`student_id`) REFERENCES `studentdatabase` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
