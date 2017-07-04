-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 27 Mei 2016 pada 10.41
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
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

CREATE TABLE `atm` (
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

CREATE TABLE `barang` (
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
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '487'),
('1', 'coba1', 'baju', 'M', 'abc', 'cba', 'merah', '100000', '570'),
('2', 'coba1', '', 'S', 'abc', 'cba', 'merah', '100000', '3'),
('6', 'coba1', '', '30', 'abc', 'cba', 'merah', '100000', '9'),
('7', 'coba1', '', 'S', 'adf', 'cba', 'merah', '100000', '8'),
('8', 'coba1', 'Celana', '30', 'S', 'adf', 'cba', 'merah', '100000'),
('10', 'coba111', 'Celana', '30', 'qweee', 'coba', 'S', 'adf', 'cba'),
('11', 'coba111', 'Baju', 'S', 'qweee', 'coba', 'S', 'adf', 'cba'),
('3', 'coba2', 'Baju', 'S', 'jenis', 'merahaaaaa', 'yyy', '1000', '10'),
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '487'),
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '487'),
('5', 'abcdefghijklmnopqrstu', 'pilih', 'pilih', 'abc', 'cba', 'merah', '100000', '487'),
('090120742', 'scanner', 'baju', 'S', 'inter', 'cobbba', 'grey', '90000', '10'),
('lct 76', 'lct 76', 'baju', 'M', 'el siete', 'gamis', 'merah', '95000', '21');

-- --------------------------------------------------------

--
-- Struktur dari tabel `biayapengeluaran`
--

CREATE TABLE `biayapengeluaran` (
  `nama` varchar(25) NOT NULL,
  `jumlah` varchar(5) NOT NULL,
  `harga` varchar(10) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `biayapengeluaran`
--

INSERT INTO `biayapengeluaran` (`nama`, `jumlah`, `harga`, `tgl`) VALUES
('sepidol', '11', '500000', '2016-05-26');

-- --------------------------------------------------------

--
-- Struktur dari tabel `brgkeluar`
--

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

-- --------------------------------------------------------

--
-- Struktur dari tabel `brgmsk`
--

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

CREATE TABLE `diskon` (
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

CREATE TABLE `jenispakaian` (
  `idpakaian` int(10) NOT NULL,
  `pakaian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jenispakaian`
--

INSERT INTO `jenispakaian` (`idpakaian`, `pakaian`) VALUES
(2, 'baju'),
(1, 'celana');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kas`
--

CREATE TABLE `kas` (
  `id_kas` int(100) NOT NULL,
  `tgl` date NOT NULL,
  `uang` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kas`
--

INSERT INTO `kas` (`id_kas`, `tgl`, `uang`, `total`) VALUES
(1, '2016-05-27', 100000, 50000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
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
('c', 'c', 'c', 'c', 'c', 'c', 'AGEN', 'Chrysanthemum.jpg', '2016-05-04', 'cv g'),
('d', 'd', 'd', 'd', 'd', 'd', 'SUPPLIER', 'Koala.jpg', '2016-05-04', 'vc'),
('a', 'a', 'a', 'a', 'a', 'a', 'AGEN', '-', '0000-00-00', 'toko1'),
('eceragen', 'eceragaen', 'malang', '012', 'dd', 'as@email.com', 'GROSIR', 'Penguins.jpg', '2016-05-27', 'toko');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE `pembayaran` (
  `no_transaksi` varchar(100) NOT NULL,
  `member` varchar(30) NOT NULL,
  `totalbeli` int(10) NOT NULL,
  `bayar` int(10) NOT NULL,
  `kembali` int(10) NOT NULL,
  `diskon` int(10) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`no_transaksi`, `member`, `totalbeli`, `bayar`, `kembali`, `diskon`, `tgl`) VALUES
('TJ.2016-05-23.1', 'a', 240000, 300000, 60000, 60000, '2016-05-23'),
('TJ.2016-05-23.1', 'a', 240000, 300000, 60000, 60000, '2016-05-23'),
('LCTOL.2016-05-23.1', 'a', 250000, 250000, 0, 60000, '2016-05-23'),
('TJ.2016-05-26.1', 'eceragen', 585000, 600000, 15000, 225000, '2016-05-26'),
('LCTOL.2016-05-26.1', 'a', 892000, 892000, 0, 220000, '2016-05-26'),
('TJ.2016-05-27.1', 'eceragen', 750000, 1000000, 250000, 250000, '2016-05-27'),
('TJ.2016-05-27.1', 'eceragen', 675000, 700000, 25000, 225000, '2016-05-27');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `no_transaksi` varchar(100) NOT NULL,
  `tgl` date NOT NULL,
  `idmember` varchar(30) NOT NULL,
  `id_barang` varchar(50) NOT NULL,
  `harga` varchar(100) NOT NULL,
  `jumlah` varchar(1000) NOT NULL,
  `total_harga` varchar(10) NOT NULL,
  `tujuan_kirim` varchar(30) NOT NULL,
  `rek_toko` varchar(30) NOT NULL,
  `rek_pembeli` varchar(30) NOT NULL,
  `nama` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`no_transaksi`, `tgl`, `idmember`, `id_barang`, `harga`, `jumlah`, `total_harga`, `tujuan_kirim`, `rek_toko`, `rek_pembeli`, `nama`) VALUES
('LCTOL002', '2016-05-12', 'b', '1', '100000', '3', '  300000', 'asd', '1234567890', '', ''),
('TJ.2016-05-13.1', '2016-05-13', 'a', '1', '100000', '3', '  300000', '', '', '', ''),
('TJ.2016-05-13.3', '2016-05-13', 'c', '1', '100000', '11', '1100000', '', '', '', ''),
('LCTOL.2016-05-13.4', '2016-05-13', 'a', '1', '100000', '5', '  500000', '', '1234567890', '', ''),
('TJ.2016-05-14.2', '2016-05-14', 'g', '1', '100000', '3', '  300000', 'kosong', 'kosong', 'kosong', ''),
('TJ.2016-05-14.4', '2016-05-14', 'd', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong', ''),
('TJ.2016-05-14.1', '2016-05-14', 'a', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong', ''),
('LCTOL.2016-05-14.1', '2016-05-14', 'a', '1', '100000', '10', '  1000000', '', '1234567890', '', ''),
('TJ.2016-05-14.3', '2016-05-14', 'c', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong', ''),
('LCTOL.2016-05-16.1', '2016-05-16', 'a', '1', '100000', '10', '  1000000', 'malang', '1234567890', '123132', ''),
('LCTOL.2016-05-16.1', '2016-05-16', 'a', '5', '100000', '10', '  1000000', 'malang', '1234567890', '123132', ''),
('TJ.2016-05-17.2', '2016-05-17', 'a', '1', '100000', '20', '2000000', 'kosong', 'kosong', 'kosong', ''),
('TJ.2016-05-17.4', '2016-05-17', 'd', '1', '100000', '10', '  1000000', 'kosong', 'kosong', 'kosong', ''),
('TJ.2016-05-23.1', '2016-05-23', 'a', '1', '100000', '3', '300000', '0', '0', '0', 'EL SIETE'),
('LCTOL.2016-05-23.1', '2016-05-23', 'a', '5', '100000', '3', '300000', 'malang', '1234567890', '', 'EL SIETE'),
('LCTOL.2016-05-26.1', '2016-05-26', 'a', '1', '100000', '11', '1100000', 'malang', '1234567890', '123456789', 'EL SIETE'),
('TJ.2016-05-26.2', '2016-05-26', 'a', '1', '100000', '1', '100000', '0', '0', '0', 'EL SIETE'),
('TJ.2016-05-27.1', '2016-05-27', 'eceragen', '1', '100000', '9', '900000', '2016-05-27 ', '2016-05-27 ', '2016-05-27 ', 'EL SIETE');

-- --------------------------------------------------------

--
-- Struktur dari tabel `retur`
--

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

--
-- Dumping data untuk tabel `retur`
--

INSERT INTO `retur` (`id_retur`, `no_faktur`, `tglfaktur`, `tgl_retur`, `id_barang`, `ket_retur_brg`, `jenis_retur`, `kode_barang_ganti`, `warna`, `ukuran`, `ongkir`) VALUES
('1', '2', '2016-05-01', '2016-05-03', '3', 'coba', 'warna', '3', 'merah', 'L', '10000'),
('12', '13', '2016-05-01', '2016-05-03', '1221', 'asdadas', 'weqew', '1221', 'qweqwe', 'aqq', 'adad'),
('3', 'TJ.2016-05-13.1', '2016-05-13', '2016-05-26', '1', '', 'cacat', '5', 'merah', 'pilih', '0'),
('3', 'TJ.2016-05-13.1', '2016-05-13', '2016-05-26', '1', '', 'cacat', '5', 'merah', 'pilih', '0'),
('3', 'TJ.2016-05-13.1', '2016-05-13', '2016-05-26', '1', 'coba', 'cacat', '5', 'merah', 'pilih', '0');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tingkatan`
--

CREATE TABLE `tingkatan` (
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
-- Struktur dari tabel `toko`
--

CREATE TABLE `toko` (
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `hp` varchar(15) NOT NULL,
  `bbm` varchar(10) NOT NULL,
  `web` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `toko`
--

INSERT INTO `toko` (`nama`, `alamat`, `hp`, `bbm`, `web`) VALUES
('EL SIETE', 'lt.4 block C1 no.6', '085748888340', 'ab123sd', 'www.coba.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tukuran`
--

CREATE TABLE `tukuran` (
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

CREATE TABLE `user` (
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
  ADD PRIMARY KEY (`idpakaian`),
  ADD KEY `pakaian` (`pakaian`);

--
-- Indexes for table `kas`
--
ALTER TABLE `kas`
  ADD PRIMARY KEY (`id_kas`);

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
  MODIFY `idpakaian` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `kas`
--
ALTER TABLE `kas`
  MODIFY `id_kas` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
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
