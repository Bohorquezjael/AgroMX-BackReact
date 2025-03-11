-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `producers_has_tecniques`
--

DROP TABLE IF EXISTS `producers_has_tecniques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producers_has_tecniques` (
  `producer_has_technique_id` bigint NOT NULL AUTO_INCREMENT,
  `fk_producer_id` bigint NOT NULL,
  `fk_tecnique_id` bigint NOT NULL,
  PRIMARY KEY (`producer_has_technique_id`,`fk_producer_id`,`fk_tecnique_id`),
  KEY `fk_Producers_has_Tecniques_Producers1_idx` (`fk_producer_id`),
  KEY `fk_Producers_has_Tecniques_Tecniques1_idx` (`fk_tecnique_id`),
  CONSTRAINT `fk_Producers_has_Tecniques_Producers1` FOREIGN KEY (`fk_producer_id`) REFERENCES `producers` (`producer_id`),
  CONSTRAINT `fk_Producers_has_Tecniques_Tecniques1` FOREIGN KEY (`fk_tecnique_id`) REFERENCES `tecniques` (`tecnique_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producers_has_tecniques`
--

LOCK TABLES `producers_has_tecniques` WRITE;
/*!40000 ALTER TABLE `producers_has_tecniques` DISABLE KEYS */;
INSERT INTO `producers_has_tecniques` VALUES (1,1,1),(2,1,2),(3,2,3),(4,2,4),(5,3,2),(6,3,4),(7,4,3),(8,4,5),(9,5,1),(10,5,5);
/*!40000 ALTER TABLE `producers_has_tecniques` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-10 22:26:54
