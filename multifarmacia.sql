-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 03-06-2022 a las 10:34:21
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `multifarmacia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `cedula` int(10) UNSIGNED NOT NULL,
  `password` varchar(40) NOT NULL,
  `nombre1` varchar(40) NOT NULL,
  `nombre2` varchar(40) DEFAULT NULL,
  `apellido1` varchar(40) NOT NULL,
  `apellido2` varchar(40) DEFAULT NULL,
  `edad` tinyint(3) UNSIGNED NOT NULL,
  `sexo` char(1) NOT NULL,
  `provincia` varchar(70) NOT NULL,
  `ciudad` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`cedula`, `password`, `nombre1`, `nombre2`, `apellido1`, `apellido2`, `edad`, `sexo`, `provincia`, `ciudad`) VALUES
(27158735, '123', 'Elias', 'José', 'Peñalver', 'Butto', 23, 'M', 'WE', 'WE');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`cedula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
