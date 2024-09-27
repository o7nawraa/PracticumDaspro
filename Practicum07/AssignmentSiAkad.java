/**
 * AssignmentSiAkad
 */
import java.util.Scanner;
public class AssignmentSiAkad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("Masukkan nama: "); 
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") "+ "Kelas " + kelas
         + " Nomor Absen " + absen);
        
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        
        if (80 < nilaiAkhir & nilaiAkhir <= 100){
            System.out.println("Nilai akhir huruf: A ");
            System.out.println("Kualifikasi: sangat baik");
        } else if (73 < nilaiAkhir & nilaiAkhir <= 80) {
            System.out.println("Nilai akhir huruf: B+ ");
            System.out.println("Kualifikasi: lebih dari baik");
        }else if (65 < nilaiAkhir & nilaiAkhir <= 73) {
            System.out.println("Nilai akhir huruf: B ");
            System.out.println("Kualifikasi: baik");
        }else if (60 < nilaiAkhir & nilaiAkhir <= 65) {
            System.out.println("Nilai akhir huruf: C+ ");
            System.out.println("Kualifikasi: lebih dari cukup");
        }else if (50 < nilaiAkhir & nilaiAkhir <= 60) {
            System.out.println("Nilai akhir huruf: C ");
            System.out.println("Kualifikasi: cukup");
        }else if (39 < nilaiAkhir & nilaiAkhir <= 50) {
            System.out.println("Nilai akhir huruf: D ");
            System.out.println("Kualifikasi: kurang");
        }else if (nilaiAkhir <= 39) {
            System.out.println("Nilai akhir huruf: E ");
            System.out.println("Kualifikasi: gagal");
        }



    }
}
