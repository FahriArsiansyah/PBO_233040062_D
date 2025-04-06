package Tugas2_PBO_233040062;

public class RefObjekNull {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l2 = null; // l2 tidak lagi mereferensi objek apapun

        System.out.println(l1.getJari2()); // Masih bisa dijalankan
        // System.out.println(l2.getJari2()); // Akan menyebabkan error NullPointerException
    }
}
