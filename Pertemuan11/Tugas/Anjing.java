package Pertemuan11.Tugas;

// Kelas Anjing merupakan turunan (subclass) dari kelas abstrak Hewan
public class Anjing extends Hewan {

  // Constructor Anjing memanggil constructor dari superclass (Hewan)
  public Anjing(String nama) {
    super(nama); // Mengisi atribut 'nama' yang ada di kelas Hewan
  }

  // Override method 'suara' dari kelas Hewan atau juga memberi tahu compiler
  // bahwa method ini mengganti versi abstract dari Hewan.
  @Override
  public void suara() {
    // Menampilkan suara kucing
    System.out.println(nama + ": nyamnyam!!");
  }
}