select penjualan.no_transaksi,barang.nama_barang,penjualan.jumlah,penjualan.total_harga from barang,penjualan where penjualan.id_barang = barang.id_barang