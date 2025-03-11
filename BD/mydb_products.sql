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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `product_id` bigint NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `stock` bigint NOT NULL,
  `fk_category_id` bigint NOT NULL,
  `description` varchar(1000) NOT NULL,
  `benefits` varchar(1000) NOT NULL,
  `fk_detalles_id` bigint NOT NULL,
  PRIMARY KEY (`product_id`,`fk_category_id`,`fk_detalles_id`),
  KEY `fk_Products_Categories_idx` (`fk_category_id`),
  KEY `fk_Products_Details1_idx` (`fk_detalles_id`),
  CONSTRAINT `fk_Products_Categories` FOREIGN KEY (`fk_category_id`) REFERENCES `categories` (`category_id`),
  CONSTRAINT `fk_Products_Details1` FOREIGN KEY (`fk_detalles_id`) REFERENCES `details` (`detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (4,'Manzana Gala',50.00,200,1,'Cosechada localmente por \'Manzanas, La Conchita\'. Fuente de fibra, vitamina C y E. Contiene antioxidantes y polifenoles. Una manzana equivale a 2/3 de la porción mínima diaria recomendada de fruta.','La manzana es una fruta rica en nutrientes. Fuente de fibra, vitamina C, E, K, potasio, cobre, además contiene antioxidantes y polifenoles.\n      Nuestra Manzana Gala está producida localmente por Manzanas, La Conchita, una productora familiar que cosecha sin agroquímicos, con técnicas sostenibles.\n      Comprando apoyas a la economía local, la reducción de la contaminación y cuidas tu salud.',1),(5,'Plátano Dominico',25.00,100,1,'Plátano orgánico producido por \'Bananas Karla\' en el Estado de México. Fuente de fibra, potasio y pectina. Contiene probióticos. Un plátano proporciona 1/4 de la cantidad diaria recomendada de Vitamina B6','El plátano es una baya rica en nutrientes. Buena fuente de fibra, potasio, pectina y vitamina B6, además contiene probióticos, que mejoran la digestión y proporcionan energía.\nNuestro Plátano Dominico está producido por \'Bananas Karla\', una productora del Estado de Mexico que cosecha sin agroquímicos, con técnicas sostenibles',2),(6,'Naranja Valencia',31.00,200,1,'Cosechada por la coperativa \'Naranjas Dulces\' en Hidalgo. Fuente de fibra, potasio y diversos antioxidantes, entre ellos la vitamina C, de la cual provee el 100% de la dosis diaria recomendada','La naranja es una fruta rica en nutrientes. Fuente de distintas vitaminas y antioxidantes, como el ácido fólico, la vitamina C y los flavonoides que el cuerpo utiliza para su función inmunológica.  \n	Nuestra naranja está producida por \'Naranjas Dulces\', una coperativa de Hidalgo que cosecha sin agroquímicos, con técnicas sostenibles.\n	Comprando estimulas la economía local y consumes responsablemente',3),(7,'Zanahoria',14.90,300,1,'Cosechada localmente por \'Grupo Frucat\'. Fuente de vitaminas. Contiene antioxidantes y betacarotenos. Una zanahoria equivale a 1/4 de la porción mínima diaria recomendada de vitamina A','La zanahoria es una hortaliza rica en nutrientes. Buena fuente de vitamina A, C, K, potasio, y antioxidantes como el betacaroteno. Es excelente para la salud ocular, fortalece el sistema inmunológico y promueve la salud de la piel. \n	Nuestra Zanahoria está producida localmente por \'Grupo Frucat\', una productora familiar que cosecha sin agroquímicos, utilizando técnicas sostenibles. \n  Al comprar, apoyas a la economía local, reduces la contaminación y mejoras tu bienestar.',4),(9,'Tomate verde',28.00,200,1,'Tomate orgánico producido por \'ASCENZA\' en el Estado de San Luis Potosí. Fuente de vitamina C, A, potasio y antioxidantes. Ayuda a fortalecer el sistema inmunológico y mejora la digestión.','El tomate es un alimento nutritivo que aporta vitaminas (especialmente vitamina C y A ), minerales, fibra y antioxidantes que ayudan a combatir el envejecimiento celular. Nuestro Tomate Orgánico está producido por \'ASCENZA\', una productora local en San Luis Potosí que cosecha sin agroquímicos y utiliza prácticas agrícolas sostenibles.  Comprando, apoyas la economía local, fomentas la agricultura sostenible y cuidas tu salud',4);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-10 22:26:56
