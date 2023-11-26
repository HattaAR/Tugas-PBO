class BarangBayangan extends Barang implements Payment {
    private String noFaktur;
    private String namaPelanggan;

    public BarangBayangan(String noFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
    }

public double calculateTotal() {
        return hargaBarang * jumlahBarang;
    }

    public void display() {
        System.out.println("No. Faktur: " + noFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        super.display();
        System.out.println("Total Bayar: " + calculateTotal());
    }
}