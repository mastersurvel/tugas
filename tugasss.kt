class Produk(var nama: String, var harga: Double, var stok: Int) {

    fun tampilkanInformasiProduk() {
        println("Nama Produk: $nama")
        println("Harga: Rp$harga")
        println("Stok Tersedia: $stok")
    }
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("Anda telah membeli $jumlah $nama.")
            println("Sisa stok: $stok")
        } else {
            println("Stok tidak mencukupi. Hanya tersedia $stok $nama.")
        }
    }
}
fun main() {
    
    val produk1 = Produk("Laptop", 15000000.0, 10)
    produk1.tampilkanInformasiProduk()
    produk1.beliProduk(3) // Membeli 3 unit
}

