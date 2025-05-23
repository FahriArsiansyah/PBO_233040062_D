package Tugas2_PBO_233040062;

public class RefObjek3 {
        public static void main(String[] args) {
            Lingkaran l1 = new Lingkaran(5);
            Lingkaran l2 = l1;
            Lingkaran l3 = new Lingkaran(7);
    
            System.out.println(l1.getJari2()); // Output: 5
            System.out.println(l2.getJari2()); // Output: 5
            System.out.println(l3.getJari2()); // Output: 7
    
            l2 = l3; // l2 sekarang mereferensi objek baru
    
            System.out.println(l1.getJari2()); // Output: 5
            System.out.println(l2.getJari2()); // Output: 7
            System.out.println(l3.getJari2()); // Output: 7
        }
    }
    

