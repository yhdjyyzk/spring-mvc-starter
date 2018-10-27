-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: demo
-- ------------------------------------------------------
-- Server version	5.7.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `plan`
--

DROP TABLE IF EXISTS `plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plan` (
  `date` text,
  `plan` longtext,
  `id` int(11) NOT NULL,
  `checked` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plan`
--

LOCK TABLES `plan` WRITE;
/*!40000 ALTER TABLE `plan` DISABLE KEYS */;
INSERT INTO `plan` VALUES ('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',6,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',13,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',14,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',15,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',16,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',18,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',19,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',20,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',21,0),('2018-10-03;2018-11-15','哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦',22,0);
/*!40000 ALTER TABLE `plan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-27 17:01:15
