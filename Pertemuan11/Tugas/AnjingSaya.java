package Pertemuan11.Tugas;

// Kelas AnjingSaya adalah turunan dari Anjing dan mengimplementasikan interface 'makan'
public class AnjingSaya extends Anjing implements Makan {

  // Constructor AnjingSaya memanggil constructor dari superclass Anjing
  public AnjingSaya(String nama) {
    super(nama); // Kirim nilai nama ke kelas Anjing dan akhirnya ke Hewan
  }

  // Implementasi method 'makan' dari interface 'makan'
  @Override
  public void makan() {
    System.out.println(nama + " lagi makan daging."); // Menampilkan aksi makan
  }
}
