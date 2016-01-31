CREATE DATABASE  IF NOT EXISTS `auto_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `auto_db`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: auto_db
-- ------------------------------------------------------
-- Server version	5.6.21-log

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
-- Table structure for table `advert`
--

DROP TABLE IF EXISTS `advert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advert` (
  `id` bigint(20) NOT NULL,
  `date_of_publication` datetime DEFAULT NULL,
  `id_auto` bigint(20) DEFAULT NULL,
  `id_seller` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ev0jpgpqro4apwe9oadvyx9b0` (`id_auto`),
  KEY `FK_q6b3vrjqxe557v4jl7s3xeqtc` (`id_seller`),
  CONSTRAINT `FK_ev0jpgpqro4apwe9oadvyx9b0` FOREIGN KEY (`id_auto`) REFERENCES `auto` (`id`),
  CONSTRAINT `FK_q6b3vrjqxe557v4jl7s3xeqtc` FOREIGN KEY (`id_seller`) REFERENCES `seller` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advert`
--

LOCK TABLES `advert` WRITE;
/*!40000 ALTER TABLE `advert` DISABLE KEYS */;
INSERT INTO `advert` VALUES (2,'2016-01-30 16:32:17',1,1),(3,'2016-01-30 16:32:17',2,2),(4,'2016-01-31 17:22:39',3,2),(5,'2016-01-31 17:33:31',4,3);
/*!40000 ALTER TABLE `advert` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auto`
--

DROP TABLE IF EXISTS `auto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auto` (
  `id` bigint(20) NOT NULL,
  `mileage` int(11) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `idBodyType` bigint(20) DEFAULT NULL,
  `idColor` bigint(20) DEFAULT NULL,
  `idEngineType` bigint(20) DEFAULT NULL,
  `idModel` bigint(20) DEFAULT NULL,
  `idState` bigint(20) DEFAULT NULL,
  `idTransmission` bigint(20) DEFAULT NULL,
  `idBrand` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_9mpw3nginym9gviruy4d0k4ix` (`idBodyType`),
  KEY `FK_s205mi3aaidb0r3ngjsl8w45` (`idColor`),
  KEY `FK_8rh5a75ha60haiq7wkfksq946` (`idEngineType`),
  KEY `FK_iv7up6hjqu1lxr7bosex3me1h` (`idModel`),
  KEY `FK_juexj6ddsamc8h0f1b69uxg57` (`idState`),
  KEY `FK_th38u0mes8girml9hxs31bvqm` (`idTransmission`),
  KEY `FK_rqkc8shf0wrg6ctpi95kkt0al` (`idBrand`),
  CONSTRAINT `FK_8rh5a75ha60haiq7wkfksq946` FOREIGN KEY (`idEngineType`) REFERENCES `engine_type` (`id`),
  CONSTRAINT `FK_9mpw3nginym9gviruy4d0k4ix` FOREIGN KEY (`idBodyType`) REFERENCES `body_type` (`id`),
  CONSTRAINT `FK_iv7up6hjqu1lxr7bosex3me1h` FOREIGN KEY (`idModel`) REFERENCES `model` (`id`),
  CONSTRAINT `FK_juexj6ddsamc8h0f1b69uxg57` FOREIGN KEY (`idState`) REFERENCES `state` (`id`),
  CONSTRAINT `FK_rqkc8shf0wrg6ctpi95kkt0al` FOREIGN KEY (`idBrand`) REFERENCES `brand` (`id`),
  CONSTRAINT `FK_s205mi3aaidb0r3ngjsl8w45` FOREIGN KEY (`idColor`) REFERENCES `color` (`id`),
  CONSTRAINT `FK_th38u0mes8girml9hxs31bvqm` FOREIGN KEY (`idTransmission`) REFERENCES `transmission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auto`
--

LOCK TABLES `auto` WRITE;
/*!40000 ALTER TABLE `auto` DISABLE KEYS */;
INSERT INTO `auto` VALUES (1,120000,35000,2014,1,1,1,1,1,1,1),(2,70000,40000,2015,1,1,1,1,1,1,1),(3,123000,9600,2008,1,1,1,1,1,1,1),(4,123000,9600,2008,1,3,2,5,2,2,2);
/*!40000 ALTER TABLE `auto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `body_type`
--

DROP TABLE IF EXISTS `body_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `body_type` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `body_type`
--

LOCK TABLES `body_type` WRITE;
/*!40000 ALTER TABLE `body_type` DISABLE KEYS */;
INSERT INTO `body_type` VALUES (1,'Sedan'),(2,'Station wagon'),(3,'Hatchback');
/*!40000 ALTER TABLE `body_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `brand`
--

DROP TABLE IF EXISTS `brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brand` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` VALUES (1,'Audi'),(2,'BMW'),(3,'Mercedes');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `color` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
INSERT INTO `color` VALUES (1,'Black'),(2,'White'),(3,'Blue'),(4,'Green');
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engine_type`
--

DROP TABLE IF EXISTS `engine_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engine_type` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engine_type`
--

LOCK TABLES `engine_type` WRITE;
/*!40000 ALTER TABLE `engine_type` DISABLE KEYS */;
INSERT INTO `engine_type` VALUES (1,'Diesel'),(2,'Petrol');
/*!40000 ALTER TABLE `engine_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `model`
--

DROP TABLE IF EXISTS `model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `model` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `model`
--

LOCK TABLES `model` WRITE;
/*!40000 ALTER TABLE `model` DISABLE KEYS */;
INSERT INTO `model` VALUES (1,'A6'),(2,'A4'),(3,'A8'),(4,'325'),(5,'528'),(6,'735'),(7,'E280'),(8,'S350');
/*!40000 ALTER TABLE `model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seller`
--

DROP TABLE IF EXISTS `seller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seller` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seller`
--

LOCK TABLES `seller` WRITE;
/*!40000 ALTER TABLE `seller` DISABLE KEYS */;
INSERT INTO `seller` VALUES (1,'admin1@mail.ru','Seller1','1111','+375291234567','seller1'),(2,'admin2@mail.ru','Seller2','1111','+375291234567','seller2'),(3,'admin@mail.ru','Admin','admin','+375291234567','admin');
/*!40000 ALTER TABLE `seller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `state` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'Used'),(2,'New');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transmission`
--

DROP TABLE IF EXISTS `transmission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transmission` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transmission`
--

LOCK TABLES `transmission` WRITE;
/*!40000 ALTER TABLE `transmission` DISABLE KEYS */;
INSERT INTO `transmission` VALUES (1,'Automatic'),(2,'Manual');
/*!40000 ALTER TABLE `transmission` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-01-31 23:36:47
