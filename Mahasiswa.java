package Praktikum1Tugas;

public class Mahasiswa {
    String nim;
    String nama;
    String programStudi;
    double ipk;
    
    //1. Default Constructor (Tanpa Parameter)
    public Mahasiswa() {
        this.nim = "Belum terdaftar";
        this.nama = "Belum terdaftar";
        this.programStudi = "Belum terdaftar";
        this.ipk = 0.0;
    }
    
    //2. Parameterizied Constructor
    public Mahasiswa (String nim, String nama, String programStudi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = 0.0;
    }
    
     public Mahasiswa (String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = 0.0;
     }
    
    public void cetakKHS(){
        System.out.println("NIM :" + nim);
        System.out.println("Nama :" + nama);
        System.out.println("Program Studi :" + programStudi);
        System.out.println("IPK :" + ipk);
        System.out.println("=================================");
      
    }
    
}

