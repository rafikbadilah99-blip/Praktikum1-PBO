package Praktikum1Tugas;

public class MainTugas {
    public static void main(String[] args) {
        //Inisialisasi Objek 1
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "L0325009";
        mahasiswa1.nama = "Rafik";
        mahasiswa1.programStudi = "Informatika";
        mahasiswa1.ipk = 4.00;
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "L0325010";
        mahasiswa2.nama = "Elzhard";
        mahasiswa2.programStudi = "Kedokteran";
        mahasiswa2.ipk = 3.99;
  
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "L0325011";
        mahasiswa3.nama = "Aidut";
        mahasiswa3.programStudi = "Kebidanan";
        mahasiswa3.ipk = 3.80;
        
        //Memanggil Method
        mahasiswa1.cetakKHS();
        mahasiswa2.cetakKHS();
        mahasiswa3.cetakKHS();
}
    
}