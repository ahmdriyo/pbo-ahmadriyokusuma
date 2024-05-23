/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pegawai;
import travel.*;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class Pegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        travel_pegawai pegawai = new travel_pegawai();

        System.out.print("Nama: ");
        pegawai.inputNama(input.nextLine());
        System.out.print("Jenis Kelamin: ");
        pegawai.inputJenisKelamin(input.nextLine());
        System.out.print("Tanggal Lahir: ");
        pegawai.inputTanggalLahir(input.nextLine());
        System.out.print("Alamat: ");
        pegawai.inputAlamat(input.nextLine());
        System.out.print("Kontak: ");
        pegawai.inputKontak(input.nextLine());
        System.out.print("Jabatan: ");
        pegawai.inputJabatan(input.nextLine());
        System.out.print("ID: ");
        pegawai.inputID(input.nextInt());
        System.out.print("NIK: ");
        pegawai.inputNIK(input.nextInt());
        System.out.print("Gaji Id: ");
        pegawai.inputGaji_id(input.nextInt());

        
        
        System.out.println("\n Data Pegawai dan Gaji");
        System.out.println("Nama          : " + pegawai.ambilNama());
        System.out.println("Jenis Kelamin : " + pegawai.ambilJenisKelamin());
        System.out.println("Tanggal Lahir : " + pegawai.ambilTanggalLahir());
        System.out.println("Alamat        : " + pegawai.ambilAlamat());
        System.out.println("Kontak        : " + pegawai.ambilKontak());
        System.out.println("Jabatan       : " + pegawai.ambilJabatan());
        System.out.println("ID            : " + pegawai.ambilID());
        System.out.println("NIK           : " + pegawai.ambilNIK());
        System.out.println("Gaji Pokok   : " + pegawai.ambilGaji_pokok());
        System.out.println("Tunjangan    : " + pegawai.ambilTunjangan());
        System.out.println("Total Gaji   : " + pegawai.gajiTotal());
        
        
    }
    
}
