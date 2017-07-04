/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 100116
Source Host           : localhost:3306
Source Database       : toko

Target Server Type    : MYSQL
Target Server Version : 100116
File Encoding         : 65001

Date: 2016-12-16 09:35:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for anggota
-- ----------------------------
DROP TABLE IF EXISTS `anggota`;
CREATE TABLE `anggota` (
  `idmember` varchar(30) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `hp` varchar(20) NOT NULL,
  `bb` varchar(10) NOT NULL,
  `email` int(11) NOT NULL,
  `foto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of anggota
-- ----------------------------

-- ----------------------------
-- Table structure for atm
-- ----------------------------
DROP TABLE IF EXISTS `atm`;
CREATE TABLE `atm` (
  `idatm` varchar(3) NOT NULL,
  `bank` varchar(10) NOT NULL,
  `no_rekening` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of atm
-- ----------------------------
INSERT INTO `atm` VALUES ('1', 'BRI', '1234567890');

-- ----------------------------
-- Table structure for barang
-- ----------------------------
DROP TABLE IF EXISTS `barang`;
CREATE TABLE `barang` (
  `id_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `pakaian` varchar(10) NOT NULL,
  `ukuran` varchar(5) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `warna` varchar(25) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `jumlah` varchar(10000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of barang
-- ----------------------------
INSERT INTO `barang` VALUES ('5', 'coba1', 'pilih', 'pilih', 'abc', 'merah', '100000', '1011');
INSERT INTO `barang` VALUES ('1', 'coba1', 'baju', 'M', 'abc', 'merah', '100000', '721');
INSERT INTO `barang` VALUES ('2', 'coba1', '', 'S', 'abc', 'merah', '100000', '3');
INSERT INTO `barang` VALUES ('6', 'coba1', '', '30', 'abc', 'merah', '100000', '9');
INSERT INTO `barang` VALUES ('7', 'coba1', '', 'S', 'adf', 'merah', '100000', '8');
INSERT INTO `barang` VALUES ('8', 'coba1', 'Celana', '30', 'S', 'cba', 'merah', '100000');
INSERT INTO `barang` VALUES ('10', 'coba111', 'Celana', '30', 'qweee', 'S', 'adf', 'cba');
INSERT INTO `barang` VALUES ('11', 'coba111', 'Baju', 'S', 'qweee', 'S', 'adf', 'cba');
INSERT INTO `barang` VALUES ('3', 'coba2', 'Baju', 'S', 'jenis', 'yyy', '1000', '10');
INSERT INTO `barang` VALUES ('5', 'coba1', 'pilih', 'pilih', 'abc', 'merah', '100000', '1011');
INSERT INTO `barang` VALUES ('5', 'coba1', 'pilih', 'pilih', 'abc', 'biru', '100000', '463');
INSERT INTO `barang` VALUES ('5', 'coba1', 'pilih', 'pilih', 'abc', 'biru', '100000', '463');

-- ----------------------------
-- Table structure for brgkeluar
-- ----------------------------
DROP TABLE IF EXISTS `brgkeluar`;
CREATE TABLE `brgkeluar` (
  `id_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `pakaian` varchar(10) NOT NULL,
  `ukuran` varchar(5) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `warna` varchar(25) NOT NULL,
  `jumlah` varchar(50) NOT NULL,
  `tgl_keluar` date NOT NULL,
  `toko_tuj` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of brgkeluar
-- ----------------------------

-- ----------------------------
-- Table structure for brgmsk
-- ----------------------------
DROP TABLE IF EXISTS `brgmsk`;
CREATE TABLE `brgmsk` (
  `id_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `pakaian` varchar(10) NOT NULL,
  `ukuran` varchar(5) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `warna` varchar(25) NOT NULL,
  `jumlah` varchar(1000) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `toko` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of brgmsk
-- ----------------------------
INSERT INTO `brgmsk` VALUES ('1', 'coba1', 'baju', 'M', 'abc', 'cba', 'merah', '50', '2016-05-05', 'a');
INSERT INTO `brgmsk` VALUES ('1', 'coba1', 'baju', 'M', 'abc', 'cba', 'merah', '10', '2016-05-09', 'b');

-- ----------------------------
-- Table structure for diskon
-- ----------------------------
DROP TABLE IF EXISTS `diskon`;
CREATE TABLE `diskon` (
  `id_diskon` varchar(3) NOT NULL,
  `potongan` varchar(100) NOT NULL,
  `jmlptg` varchar(100) NOT NULL,
  `tingkatan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of diskon
-- ----------------------------
INSERT INTO `diskon` VALUES ('1', '20000', '3', 'GROSIR');
INSERT INTO `diskon` VALUES ('2', '25000', '7', 'AGEN');
INSERT INTO `diskon` VALUES ('3', '30000', '20', 'DISTRIBUTOR');

-- ----------------------------
-- Table structure for jenispakaian
-- ----------------------------
DROP TABLE IF EXISTS `jenispakaian`;
CREATE TABLE `jenispakaian` (
  `idpakaian` int(10) NOT NULL AUTO_INCREMENT,
  `pakaian` varchar(50) NOT NULL,
  PRIMARY KEY (`idpakaian`),
  KEY `pakaian` (`pakaian`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of jenispakaian
-- ----------------------------
INSERT INTO `jenispakaian` VALUES ('2', 'baju');
INSERT INTO `jenispakaian` VALUES ('1', 'celana');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `idmember` varchar(30) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `hp` varchar(15) NOT NULL,
  `bb` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `tingkatan` varchar(15) NOT NULL,
  `foto` varchar(50) NOT NULL,
  `tgl` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('a', 'a', 'a', 'a', 'a', 'a', 'Agent', 'Desert.jpg', '2016-05-04');
INSERT INTO `member` VALUES ('b', 'b', 'b', 'b', 'b', 'b', 'Agent', 'Tulips.jpg', '2016-05-04');
INSERT INTO `member` VALUES ('c', 'c', 'c', 'c', 'c', 'c', 'GROSIR', 'Chrysanthemum.jpg', '2016-05-04');
INSERT INTO `member` VALUES ('d', 'd', 'd', 'd', 'd', 'd', 'AGEN', 'Koala.jpg', '2016-05-04');

-- ----------------------------
-- Table structure for penjualan
-- ----------------------------
DROP TABLE IF EXISTS `penjualan`;
CREATE TABLE `penjualan` (
  `no_transaksi` varchar(100) NOT NULL,
  `tgl` date NOT NULL,
  `idmember` varchar(30) NOT NULL,
  `id_barang` varchar(50) NOT NULL,
  `harga` varchar(100) NOT NULL,
  `jumlah` varchar(1000) NOT NULL,
  `total_harga` varchar(10) NOT NULL,
  `tujuan_kirim` varchar(30) NOT NULL,
  `ongkir` varchar(30) NOT NULL,
  `rek_toko` varchar(30) DEFAULT NULL,
  `rek_pembeli` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of penjualan
-- ----------------------------
INSERT INTO `penjualan` VALUES ('TJ.2016-04-30.2', '2016-04-30', 'w', '1', '100000', '3', '  300000', '', '', '', '');
INSERT INTO `penjualan` VALUES ('LCTOL.2016-04-30.1', '2016-04-30', 'a', '1', '100000', '3', '  300000', 'malang', '10000', '1234567890', '1234');
INSERT INTO `penjualan` VALUES ('LCTOL.2016-05-02.3', '2016-05-02', 'as', '1', '100000', '3', '  300000', 'malng', '12000', '1234567890', '12212');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-02.3', '2016-05-02', 'qw', '1', '100000', '3', '  300000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-04.1', '2016-05-04', 'b', '1', '100000', '94', '3000000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-04.1', '2016-05-04', 'b', '11', 'adf', '3', '  300000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-04.2', '2016-05-04', 'a', '1', '100000', '5', '500000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-04.3', '2016-05-04', 'c', '1', '100000', '1', '  100000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-04.4', '2016-05-04', 'c', '1', '100000', '1', '  100000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-04.5', '2016-05-04', 'c', '1', '100000', '1', '  100000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-046', '2016-05-04', 'c', '1', '100000', '1', '  100000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-047', '2016-05-04', 'c', '1', '100000', '1', '  100000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-041', '2016-05-04', 'c', '1', '100000', '1', '  100000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-04.2', '2016-05-04', 'd', '2', '100000', '2', '  200000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('LCTOL.2016-05-09.1', '2016-05-09', 'a', '1', '100000', '6', '600000', 'qw', '10000', '1234567890', '123456');
INSERT INTO `penjualan` VALUES ('LCTOL.2016-05-09.2', '2016-05-09', 'b', '1', '100000', '9', '900000', 'qw', '10000', '1234567890', '123456');
INSERT INTO `penjualan` VALUES ('TJ.2016-05-09.1', '2016-05-09', 'a', '1', '100000', '3', '  300000', '-', '-', '-', '-');
INSERT INTO `penjualan` VALUES ('LCTOL.2016-05-09.3', '2016-05-09', 'a', '1', '100000', '3', '  300000', 'ad', '10000', '1234567890', '123');
INSERT INTO `penjualan` VALUES ('TJ.2016-12-16.1', '2016-12-16', 'c', '1', '100000', '10', '1000000', '0', '0', '0', null);

-- ----------------------------
-- Table structure for retur
-- ----------------------------
DROP TABLE IF EXISTS `retur`;
CREATE TABLE `retur` (
  `id_retur` varchar(15) NOT NULL,
  `no_faktur` varchar(20) NOT NULL,
  `tglfaktur` date NOT NULL,
  `tgl_retur` varchar(30) NOT NULL,
  `id_barang` varchar(20) NOT NULL,
  `ket_retur_brg` varchar(30) NOT NULL,
  `jenis_retur` varchar(20) NOT NULL,
  `kode_barang_ganti` varchar(50) NOT NULL,
  `warna` varchar(15) NOT NULL,
  `ukuran` varchar(10) NOT NULL,
  `ongkir` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of retur
-- ----------------------------
INSERT INTO `retur` VALUES ('1', '2', '2016-05-01', '2016-05-03', '3', 'coba', 'warna', '3', 'merah', 'L', '10000');
INSERT INTO `retur` VALUES ('12', '13', '2016-05-01', '2016-05-03', '1221', 'asdadas', 'weqew', '1221', 'qweqwe', 'aqq', 'adad');

-- ----------------------------
-- Table structure for tingkatan
-- ----------------------------
DROP TABLE IF EXISTS `tingkatan`;
CREATE TABLE `tingkatan` (
  `id_tingkatan` varchar(10) NOT NULL,
  `tingkatan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tingkatan
-- ----------------------------
INSERT INTO `tingkatan` VALUES ('1', 'GROSIR');
INSERT INTO `tingkatan` VALUES ('2', 'AGEN');
INSERT INTO `tingkatan` VALUES ('3', 'DISTRIBUTOR');

-- ----------------------------
-- Table structure for tukuran
-- ----------------------------
DROP TABLE IF EXISTS `tukuran`;
CREATE TABLE `tukuran` (
  `ukuran` varchar(5) NOT NULL,
  `pakaian` varchar(50) NOT NULL,
  KEY `pakaian` (`pakaian`),
  CONSTRAINT `tukuran_ibfk_1` FOREIGN KEY (`pakaian`) REFERENCES `jenispakaian` (`pakaian`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tukuran
-- ----------------------------
INSERT INTO `tukuran` VALUES ('S', 'baju');
INSERT INTO `tukuran` VALUES ('M', 'baju');
INSERT INTO `tukuran` VALUES ('30', 'celana');
INSERT INTO `tukuran` VALUES ('31', 'celana');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `level` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', 'admin', 'admin');
INSERT INTO `user` VALUES ('user1', 'user1', 'user1');
INSERT INTO `user` VALUES ('user2', 'user5', 'kasironline');
INSERT INTO `user` VALUES ('kasironline', 'kasironline', 'kasironline');
INSERT INTO `user` VALUES ('a', 'a', 'kasiroffline');
