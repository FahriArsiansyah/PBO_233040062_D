package Pertemuan13;

interface Bentuk {
    void gambar();
}

class Lingkaran implements Bentuk {
    public void gambar() {
        System.out.println("Ini adalah gambar lingkaran.");
    }
}

class Tabung implements Bentuk {
    public void gambar() {
        System.out.println("Ini adalah gambar tabung.");
    }
}

