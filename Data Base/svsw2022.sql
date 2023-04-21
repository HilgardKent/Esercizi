-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Creato il: Gen 12, 2023 alle 10:58
-- Versione del server: 10.4.21-MariaDB
-- Versione PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `svsw2022`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `paesi`
--

CREATE TABLE `paesi` (
  `cap` int(10) UNSIGNED NOT NULL,
  `nomep` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `paesi`
--

INSERT INTO `paesi` (`cap`, `nomep`) VALUES
(10019, 'Dubai'),
(10021, 'Venezia');

-- --------------------------------------------------------

--
-- Struttura della tabella `persone`
--

CREATE TABLE `persone` (
  `id` tinyint(3) UNSIGNED NOT NULL,
  `nome` varchar(20) NOT NULL,
  `datanascita` date DEFAULT NULL,
  `cappersona` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `persone`
--

INSERT INTO `persone` (`id`, `nome`, `datanascita`, `cappersona`) VALUES
(1, 'Sara', NULL, 10019),
(4, 'Viola', '1939-10-08', 10021),
(5, 'john1', NULL, 10021);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `paesi`
--
ALTER TABLE `paesi`
  ADD PRIMARY KEY (`cap`);

--
-- Indici per le tabelle `persone`
--
ALTER TABLE `persone`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cappersona` (`cappersona`);

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `persone`
--
ALTER TABLE `persone`
  ADD CONSTRAINT `persone_ibfk_1` FOREIGN KEY (`cappersona`) REFERENCES `paesi` (`cap`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
