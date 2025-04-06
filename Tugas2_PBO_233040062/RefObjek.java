package Tugas2_PBO_233040062;

public class RefObjek {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;  // l2 mereferensi objek yang sama dengan l1

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 5

        l2.setJari2(10);

        System.out.println(l1.getJari2()); // Output: 10
        System.out.println(l2.getJari2()); // Output: 10
    }
}
