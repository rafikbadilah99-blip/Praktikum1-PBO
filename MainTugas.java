package Praktikum1Tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Objek 1: Menggunakan Constructor 1 (Default / Tanpa Parameter)
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // Objek 2: Menggunakan Constructor 2 (3 Parameter, IPK default 0.0)
        Mahasiswa mahasiswa2 = new Mahasiswa("2502030159", "Al Nur Kholivah", "Akuntansi");

        // Objek 3: Menggunakan Constructor 3 (4 Parameter Lengkap)
        Mahasiswa mahasiswa3 = new Mahasiswa("L0325009", "Rafik Badilah", "Informatika", 4.00);

        // Objek 4: Menggunakan Constructor 3 (4 Parameter Lengkap - Tambahan)
        Mahasiswa mahasiswa4 = new Mahasiswa("21010125120035", "Windiarti", "Teknik Sipil", 3.85);

        // Memanggil method cetakKHS() untuk keempat objek
        mahasiswa1.cetakKHS();
        mahasiswa2.cetakKHS();
        mahasiswa3.cetakKHS();
        mahasiswa4.cetakKHS();
    }
}