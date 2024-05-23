/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiket;
import travel.*;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class Tiket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Detail Tiket Perjalanan:");
        System.out.print("Kode Tiket: ");
        int code_tiket = input.nextInt();
        System.out.print("Harga: ");
        int harga = input.nextInt();
        System.out.print("Tanggal Berangkat: ");
        String tgl_berangkat = input.next();
        System.out.print("Dari: ");
        String dari = input.next();
        System.out.print("Kota Tujuan: ");
        String kota_tujuan = input.next();
        System.out.print("Jam: ");
        String jam = input.next();


        travel_tiket tiket = new travel_tiket(code_tiket, harga, tgl_berangkat, dari, kota_tujuan, jam);


        System.out.println("\n===== Detail Tiket Perjalanan =====");
        System.out.println("Kode Tiket: " + tiket.ambilCodeTiket());
        System.out.println("Harga: " + tiket.ambilHarga());
        System.out.println("Tanggal Berangkat: " + tiket.ambilTglBerangkat());
        System.out.println("Dari: " + tiket.ambilDari());
        System.out.println("Kota Tujuan: " + tiket.ambilKotaTujuan());
        System.out.println("Jam: " + tiket.ambilJam());
        System.out.println("History ID: " + tiket.ambilHistoryId());
        System.out.println("Tanggal Pemesanan: " + tiket.ambilTglPemesanan());
    }
    
}
