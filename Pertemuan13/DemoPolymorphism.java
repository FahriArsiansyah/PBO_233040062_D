package Pertemuan13;

public class DemoPolymorphism {
    public static void main(String[] args) {
        // Tipe referensi adalah Bentuk, tapi objek yang dibuat bisa Lingkaran atau Tabung
        Bentuk b1 = new Lingkaran();
        Bentuk b2 = new Tabung();

        // Pemanggilan method akan mengacu pada implementasi subclass (runtime polymorphism)
        b1.gambar(); // Output: Ini adalah gambar lingkaran.
        b2.gambar(); // Output: Ini adalah gambar tabung.
    }
}

