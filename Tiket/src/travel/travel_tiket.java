/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author ahmad
 */
public class travel_tiket extends history_tiket{
    int code_tiket,harga;
    String tgl_berangkat,dari,kota_tujuan,jam;
    public travel_tiket(){}
    public travel_tiket(int code_tiket, int harga, String tgl_berangkat, String dari, String kota_tujuan, String jam) {
        this.code_tiket = code_tiket;
        this.harga = harga;
        this.tgl_berangkat = tgl_berangkat;
        this.dari = dari;
        this.kota_tujuan = kota_tujuan;
        this.jam = jam;
    }

   public void inputCodeTiket(int code_tiket) {
        this.code_tiket = code_tiket;
    }

    public void inputHarga(int harga) {
        this.harga = harga;
    }

    public void inputTglBerangkat(String tgl_berangkat) {
        this.tgl_berangkat = tgl_berangkat;
    }

    public void inputDari(String dari) {
        this.dari = dari;
    }

    public void inputKotaTujuan(String kota_tujuan) {
        this.kota_tujuan = kota_tujuan;
    }

    public void inputJam(String jam) {
        this.jam = jam;
    }

    // Metode ambil untuk setiap atribut
    public int ambilCodeTiket() {
        return code_tiket;
    }

    public int ambilHarga() {
        return harga;
    }

    public String ambilTglBerangkat() {
        return tgl_berangkat;
    }

    public String ambilDari() {
        return dari;
    }

    public String ambilKotaTujuan() {
        return kota_tujuan;
    }

    public String ambilJam() {
        return jam;
    }
}
