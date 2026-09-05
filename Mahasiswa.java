package Praktikum1Tugas;

public class Mahasiswa {
    String nim;
    String nama;
    String programStudi;
    double ipk;

    // Constructor 1: Default constructor (tanpa parameter)
    public Mahasiswa() {
        this.nim = "Belum terdaftar";
        this.nama = "Belum terdaftar";
        this.programStudi = "Belum terdaftar";
        this.ipk = 0.0;
    }

    // Constructor 2: Parameterized constructor (3 parameter)
    // Menerima nim, nama, programStudi, sementara ipk otomatis di-set ke 0.0
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = 0.0;
    }

    // Constructor 3: Parameterized constructor (4 parameter lengkap)
    // Menerima seluruh parameter: nim, nama, programStudi, ipk
    public Mahasiswa(String nim, String nama, String programStudi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }

    // Method untuk mencetak seluruh informasi mahasiswa
    public void cetakKHS() {
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("IPK           : " + ipk);
        System.out.println("==========================================");
    }
}