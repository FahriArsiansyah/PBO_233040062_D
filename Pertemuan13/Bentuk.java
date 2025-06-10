package Pertemuan13;

abstract class Bentuk {
    abstract void gambar();
}

class Lingkaran extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Ini adalah gambar lingkaran.");
    }
}

class Tabung extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Ini adalah gambar tabung.");
    }
}
