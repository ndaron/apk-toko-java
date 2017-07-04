-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17 Mei 2016 pada 10.44
-- Versi Server: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `toko`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
  `idmember` varchar(30) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `hp` varchar(20) NOT NULL,
  `bb` varchar(10) NOT NULL,
  `email` int(11) NOT NULL,
  `foto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `atm`
--

CREATE TABLE IF NOT EXISTS `atm` (
  `idatm` varchar(3) NOT NULL,
  `bank` varchar(10) NOT NULL,
  `no_rekening` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `atm`
--

INSERT INTO `atm` (`idatm`, `bank`, `no_rekening`) VALUES
('1', 'BRI', '1234567890');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
  `id_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `pakaian` varchar(10) NOT NULL,
  `ukuran` varchar(5) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `warna` varchar(25) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `jumlah` varchar(10000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `pakaian`, `ukuran`, `brand`, `kategori`, `warna`, `harga`, `jumlah`) VALUES
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '485'),
('1', 'coba1', 'baju', 'M', 'abc', 'cba', 'merah', '100000', '574'),
('2', 'coba1', '', 'S', 'abc', 'cba', 'merah', '100000', '-1'),
('6', 'coba1', '', '30', 'abc', 'cba', 'merah', '100000', '5'),
('7', 'coba1', '', 'S', 'adf', 'cba', 'merah', '100000', '7'),
('8', 'coba1', 'Celana', '30', 'S', 'adf', 'cba', 'merah', '100000'),
('10', 'coba111', 'Celana', '30', 'qweee', 'coba', 'S', 'adf', 'cba'),
('11', 'coba111', 'Baju', 'S', 'qweee', 'coba', 'S', 'adf', 'cba'),
('3', 'coba2', 'Baju', 'S', 'jenis', 'merahaaaaa', 'yyy', '1000', '10'),
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '485'),
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '485'),
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '485'),
('090120742', 'scanner', 'baju', 'S', 'inter', 'cobbba', 'grey', '90000', '10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `brgkeluar`
--

CREATE TABLE IF NOT EXISTS `brgkeluar` (
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

-- --------------------------------------------------------

--
-- Struktur dari tabel `brgmsk`
--

CREATE TABLE IF NOT EXISTS `brgmsk` (
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

--
-- Dumping data untuk tabel `brgmsk`
--

INSERT INTO `brgmsk` (`id_barang`, `nama_barang`, `pakaian`, `ukuran`, `brand`, `kategori`, `warna`, `jumlah`, `tgl_masuk`, `toko`) VALUES
('1', 'coba1', 'baju', 'M', 'abc', 'cba', 'merah', '50', '2016-05-05', 'a'),
('1', 'coba1', 'baju', 'M', 'abc', 'cba', 'merah', '10', '2016-05-09', 'b');

-- --------------------------------------------------------

--
-- Struktur dari tabel `diskon`
--

CREATE TABLE IF NOT EXISTS `diskon` (
  `id_diskon` varchar(3) NOT NULL,
  `potongan` varchar(100) NOT NULL,
  `jmlptg` varchar(100) NOT NULL,
  `tingkatan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `diskon`
--

INSERT INTO `diskon` (`id_diskon`, `potongan`, `jmlptg`, `tingkatan`) VALUES
('1', '20000', '3', 'AGEN'),
('3', '30000', '20', 'DISTRIBUTOR'),
('2', '25000', '7', 'GROSIR'),
('4', '30000', '25', 'SUPPLIER');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jenispakaian`
--

CREATE TABLE IF NOT EXISTS `jenispakaian` (
  `idpakaian` int(10) NOT NULL,
  `pakaian` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jenispakaian`
--

INSERT INTO `jenispakaian` (`idpakaian`, `pakaian`) VALUES
(2, 'baju'),
(1, 'celana');

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE IF NOT EXISTS `member` (
  `idmember` varchar(30) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `hp` varchar(15) NOT NULL,
  `bb` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `tingkatan` varchar(15) NOT NULL,
  `foto` varchar(50) NOT NULL,
  `tgl` date DEFAULT NULL,
  `toko` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`idmember`, `nama`, `alamat`, `hp`, `bb`, `email`, `tingkatan`, `foto`, `tgl`, `toko`) VALUES
('a', 'a', 'a', 'a', 'a', 'a', 'AGEN', 'Desert.jpg', '2016-05-04', 'toko1'),
('b', 'b', 'b', 'b', 'b', 'b', 'DISTRIBUTOR', 'Tulips.jpg', '2016-05-04', 'cv'),
('c', 'c', 'c', 'c', 'c', 'c', 'GROSIR', 'Chrysanthemum.jpg', '2016-05-04', ''),
('d', 'd', 'd', 'd', 'd', 'd', 'SUPPLIER', 'Koala.jpg', '2016-05-04', 'vc'),
('a', 'a', 'a', 'a', 'a', 'a', 'AGEN', '-', '0000-00-00', 'toko1'),
('eceragen', 'eceragaen', 'malang', '012', 'dd', 'as@email.com', 'GROSIR', 'Penguins.jpg', '0000-00-00', 'toko');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
  `no_transaksi` varchar(100) NOT NULL,
  `tgl` date NOT NULL,
  `idmember` varchar(30) NOT NULL,
  `id_barang` varchar(50) NOT NULL,
  `harga` varchar(100) NOT NULL,
  `jumlah` varchar(1000) NOT NULL,
  `total_harga` varchar(10) NOT NULL,
  `tujuan_kirim` varchar(30) NOT NULL,
  `rek_toko` varchar(30) NOT NULL,
  `rek_pembeli` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`no_transaksi`, `tgl`, `idmember`, `id_barang`, `harga`, `jumlah`, `total_harga`, `tujuan_kirim`, `rek_toko`, `rek_pembeli`) VALUES
('LCTOL002', '2016-05-12', 'b', '1', '100000', '3', '  300000', 'asd', '1234567890', ''),
('TJ.2016-05-13.1', '2016-05-13', 'a', '1', '100000', '3', '  300000', '', '', ''),
('TJ.2016-05-13.3', '2016-05-13', 'c', '1', '100000', '11', '1100000', '', '', ''),
('LCTOL.2016-05-13.4', '2016-05-13', 'a', '1', '100000', '5', '  500000', '', '1234567890', ''),
('TJ.2016-05-14.2', '2016-05-14', 'g', '1', '100000', '3', '  300000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-14.4', '2016-05-14', 'd', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-14.1', '2016-05-14', 'a', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong'),
('LCTOL.2016-05-14.1', '2016-05-14', 'a', '1', '100000', '10', '  1000000', '', '1234567890', ''),
('TJ.2016-05-14.3', '2016-05-14', 'c', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong'),
('LCTOL.2016-05-16.1', '2016-05-16', 'a', '1', '100000', '10', '  1000000', 'malang', '1234567890', '123132'),
('LCTOL.2016-05-16.1', '2016-05-16', 'a', '5', '100000', '10', '  1000000', 'malang', '1234567890', '123132'),
('TJ.2016-05-17.1', '2016-05-17', 'c', '1', '100000', '20', '2000000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.1', '2016-05-17', 'c', '5', '100000', '5', '  500000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.1', '2016-05-17', 'c', '6', '100000', '4', '370000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.1', '2016-05-17', 'c', '7', '90000', '1', '  100000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.1', '2016-05-17', 'c', '9', '90000', '1', '  100000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.1', '2016-05-17', 'c', '12', '90000', '1', '  90000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.1', '2016-05-17', 'c', '2', '90000', '4', '  360000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.2', '2016-05-17', 'a', '1', '100000', '20', '2000000', 'kosong', 'kosong', 'kosong'),
('TJ.2016-05-17.4', '2016-05-17', 'd', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong');

-- --------------------------------------------------------

--
-- Struktur dari tabel `retur`
--

CREATE TABLE IF NOT EXISTS `retur` (
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

--
-- Dumping data untuk tabel `retur`
--

INSERT INTO `retur` (`id_retur`, `no_faktur`, `tglfaktur`, `tgl_retur`, `id_barang`, `ket_retur_brg`, `jenis_retur`, `kode_barang_ganti`, `warna`, `ukuran`, `ongkir`) VALUES
('1', '2', '2016-05-01', '2016-05-03', '3', 'coba', 'warna', '3', 'merah', 'L', '10000'),
('12', '13', '2016-05-01', '2016-05-03', '1221', 'asdadas', 'weqew', '1221', 'qweqwe', 'aqq', 'adad');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tingkatan`
--

CREATE TABLE IF NOT EXISTS `tingkatan` (
  `id_tingkatan` varchar(10) NOT NULL,
  `tingkatan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tingkatan`
--

INSERT INTO `tingkatan` (`id_tingkatan`, `tingkatan`) VALUES
('2', 'AGEN'),
('3', 'DISTRIBUTOR'),
('1', 'GROSIR'),
('4', 'SUPPLIER');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tukuran`
--

CREATE TABLE IF NOT EXISTS `tukuran` (
  `ukuran` varchar(5) NOT NULL,
  `pakaian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tukuran`
--

INSERT INTO `tukuran` (`ukuran`, `pakaian`) VALUES
('S', 'baju'),
('M', 'baju'),
('30', 'celana'),
('31', 'celana');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `level` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`, `level`) VALUES
('admin', 'admin', 'admin'),
('user1', 'user1', 'user1'),
('user2', 'user5', 'kasironline'),
('kasironline', 'kasironline', 'kasironline'),
('a', 'a', 'kasiroffline');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenispakaian`
--
ALTER TABLE `jenispakaian`
  ADD PRIMARY KEY (`idpakaian`), ADD KEY `pakaian` (`pakaian`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD KEY `tingkatan` (`tingkatan`);

--
-- Indexes for table `tingkatan`
--
ALTER TABLE `tingkatan`
  ADD PRIMARY KEY (`tingkatan`);

--
-- Indexes for table `tukuran`
--
ALTER TABLE `tukuran`
  ADD KEY `pakaian` (`pakaian`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jenispakaian`
--
ALTER TABLE `jenispakaian`
  MODIFY `idpakaian` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tukuran`
--
ALTER TABLE `tukuran`
ADD CONSTRAINT `tukuran_ibfk_1` FOREIGN KEY (`pakaian`) REFERENCES `jenispakaian` (`pakaian`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
