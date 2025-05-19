package Pertemuan11.Tugas;

// Kelas utama untuk menjalankan program
public class Main {
  public static void main(String[] args) {
    // Membuat objek dari kelas KucingSaya dengan nama "Snoowy"
    AnjingSaya Anjing = new AnjingSaya("Snoowy");

    // Memanggil method 'suara()' dari class Kucing (warisan dari Hewan)
    Anjing.suara(); // Output: Snoowy: nyamnyam!!

    // Memanggil method 'makan()' dari interface Makan yang diimplementasikan di
    // KucingSaya
    Anjing.makan(); // Output: Snoowy Lagi makan daging.
  }
}