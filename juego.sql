-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: juego
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `correct` bit(1) DEFAULT NULL,
  `text` varchar(255) NOT NULL,
  `question_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3erw1a3t0r78st8ty27x6v3g1` (`question_id`),
  CONSTRAINT `FK3erw1a3t0r78st8ty27x6v3g1` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
INSERT INTO `answers` VALUES (1,_binary '','El deporte favorito de Harry Potter',1),(2,_binary '\0','La lengua en clave de los de Gryffindor',1),(3,_binary '\0','El arte de hacer las mejores varitas màgicas',1),(4,_binary '\0','Un postre tìpico de Hogwarts',1),(5,_binary '\0','Apaga todas las luces',2),(6,_binary '','La punta de su varita se ilumina',2),(7,_binary '\0','Enciende todas las bombillas en un radio de 4 metros',2),(8,_binary '\0','Detecta la presencia de un hombre lobo',2),(9,_binary '\0','Se levanta un huracán',3),(10,_binary '\0','Se paraliza a la persona o cosa',3),(11,_binary '','Se levantan objetos en el aire',3),(12,_binary '\0','Crecen raíces-cepo de cualquier suelo',3),(13,_binary '','Un ciervo',4),(14,_binary '\0','Un gato negro',4),(15,_binary '','Una serpiente',4),(16,_binary '\0','Un unicornio',4),(17,_binary '\0','Nunca sueñes con dragones',5),(18,_binary '','Nunca hagas cosquillas a un dragón dormido',5),(19,_binary '\0','Nunca duermas si hay un dragón cerca',5),(20,_binary '\0','Si sueñas con dragones escupirás fuego',5),(21,_binary '','Dumbledore',6),(22,_binary '\0','Sirius',6),(23,_binary '\0','Hagrid',6),(24,_binary '\0','Luppin',6),(25,_binary '\0','Hermione y Ginny Weasley',7),(26,_binary '\0','Pansky Parkinson y Lavender Brown',7),(27,_binary '\0','Hermione y Cho Chang',7),(28,_binary '','Hermione y Penélope Cleanwater',7),(29,_binary '\0','Avada Kedavra',8),(30,_binary '\0','Serpensortia',8),(31,_binary '','Sectumsempra',8),(32,_binary '\0','Tarantallegrra',8),(33,_binary '\0','Dolores Umbridge',9),(34,_binary '\0','Luna Lovegood',9),(35,_binary '','Rita Skeeter',9),(36,_binary '\0','Bellatrix Lestrange',9),(37,_binary '\0','De la sección prohibida de la biblioteca',10),(38,_binary '','Del Profesor Slughorn',10),(39,_binary '\0','De Dumbledore',10),(40,_binary '\0','De la Profesora McGonagall',10),(41,_binary '','Nutria',11),(42,_binary '\0','Caballo',11),(43,_binary '\0','Águila',11),(44,_binary '\0','Gato',11),(45,_binary '','Tobby',12),(46,_binary '\0','Fluffy',12),(47,_binary '\0','Cerbero',12),(48,_binary '\0','Sultán',12),(49,_binary '\0','Escama de dragón',13),(50,_binary '\0','Ojo de tritón',13),(51,_binary '\0','Pelo de unicornio',13),(52,_binary '','Pluma de cola de fénix',13),(53,_binary '\0','Galés verde',14),(54,_binary '\0','Bola de fuego chino',14),(55,_binary '\0','Hocicorto sueco',14),(56,_binary '','Colacuerno húngaro',14),(57,_binary '\0','La profesora de Herbología de Hogwarts',15),(58,_binary '\0','La hermana de Dolores Umbridge',15),(59,_binary '','La profesora de vuelo de Hogwarts',15),(60,_binary '\0','La dueña del Caldero Chorreante',15),(61,_binary '\0','La varita de sauco',16),(62,_binary '','La piedra filosofal',16),(63,_binary '\0','La capa de invisibilidad',16),(64,_binary '\0','La piedra de resurrección',16),(65,_binary '\0','Lechuza',17),(66,_binary '','Perro',17),(67,_binary '\0','León',17),(68,_binary '\0','Rata',17),(69,_binary '\0','Banco Popular',18),(70,_binary '\0','Banco del Callejón Diagon',18),(71,_binary '\0','Borgins y Burkes',18),(72,_binary '','Banco Mágico Gringotts',18),(73,_binary '\0','El 31 de julio de 1981',19),(74,_binary '\0','El 30 de julio de 1980',19),(75,_binary '','El 31 de julio de 1980',19),(76,_binary '\0','No llegó a nacer, Lilly se casó con Severus Snape',19),(77,_binary '\0','Nigina',20),(78,_binary '\0','Nagina',20),(79,_binary '','Nagini',20),(80,_binary '\0','Nigena',20);
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1),(1),(1),(1),(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partidas`
--

DROP TABLE IF EXISTS `partidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partidas` (
  `id` int(11) NOT NULL,
  `fecha` datetime(6) NOT NULL,
  `puntos` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partidas`
--

LOCK TABLES `partidas` WRITE;
/*!40000 ALTER TABLE `partidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `partidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preguntas` (
  `id` int(11) NOT NULL,
  `pregunta` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntas`
--

LOCK TABLES `preguntas` WRITE;
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'El \'quidditch\' es...'),(2,'¿Qué pasa si un mago lanza el conjuro \'Lumos\'?'),(3,'¿Qué sucede si se conjura el hechizo \'Wingardium Leviosa\'?'),(4,'¿Qué forma adquiere el \'Expecto Patronum\' de Harry Potter?'),(5,'  ¿Qué significa el lema de Hogwarts, \'Draco Dormiens Nunquam Titillandus\'?'),(6,' ¿Quién le entregó a Harry la capa de invisibilidad?'),(7,'¿Quiénes sufrieron el ataque del basilisco en \'La cámara secreta\'?'),(8,'¿Cuál de los siguientes hechizos es obra de Snape?'),(9,'Además de Sirius Black, ¿Qué otra maga era animaga ilegalmente?'),(10,'¿Dónde obtuvo Voldemort la información necesaria para crear los Horrocruxes?'),(11,'¿Cuál es el patronus de Hermione Granger?'),(12,'¿Cómo se llamaba el perro de tres cabezas de Hagrid?'),(13,'La varita de Harry Potter está hecha de acebo y ...'),(14,'  ¿Con qué tipo de dragón debe enfrentarse Harry en el \'Torneo de los tres magos\'?'),(15,'¿Quién es Madame Hooch?'),(16,'¿Cuál de las siguientes no es una Reliquia de la Muerte?'),(17,'¿Cuál es el patronus de Ron?'),(18,'¿Cómo se llama el banco de la imagen?'),(19,'¿Cuándo nació Harry Potter?'),(20,'¿Cómo se llama la serpiente de Lord Voldemort?');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `respuestas`
--

DROP TABLE IF EXISTS `respuestas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `respuestas` (
  `id` int(11) NOT NULL,
  `respuesta1` varchar(255) NOT NULL,
  `respuesta2` varchar(255) NOT NULL,
  `respuesta3` varchar(255) NOT NULL,
  `respuesta4` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuestas`
--

LOCK TABLES `respuestas` WRITE;
/*!40000 ALTER TABLE `respuestas` DISABLE KEYS */;
/*!40000 ALTER TABLE `respuestas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temas`
--

DROP TABLE IF EXISTS `temas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `temas` (
  `id` int(11) NOT NULL,
  `clasificacion` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temas`
--

LOCK TABLES `temas` WRITE;
/*!40000 ALTER TABLE `temas` DISABLE KEYS */;
/*!40000 ALTER TABLE `temas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `confirmar_contraseña` varchar(255) NOT NULL,
  `contraseña` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `paises` varchar(255) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_5171l57faosmj8myawaucatdw` (`email`),
  UNIQUE KEY `UK_i02kr8ui5pqddyd7pkm3v4jbt` (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-26 21:02:16
