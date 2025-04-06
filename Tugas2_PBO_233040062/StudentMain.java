package Tugas2_PBO_233040062;

public class StudentMain {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;

        x.setNrp("01");
        y.setNrp("02");

        System.out.println("x.getNrp(): " + x.getNrp()); // Output: 02

        Student z = new Student();
        z.setNrp("03");

        x = z; // Sekarang x menunjuk ke z, bukan y

        System.out.println("x.getNrp(): " + x.getNrp()); // Output: 03
        System.out.println("y.getNrp(): " + y.getNrp()); // Output: 02
    }
}
