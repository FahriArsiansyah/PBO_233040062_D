package Tugas_Inheritance;

public class Manajer extends Pegawai {
    private String departemen;

    public Manajer(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Departemen: " + departemen);
    }
}