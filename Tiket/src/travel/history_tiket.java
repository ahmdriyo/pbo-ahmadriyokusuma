/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author ahmad
 */
public class history_tiket {
    int history_id;
    String tgl_pemesanan;
    
    public history_tiket(){}
    public history_tiket(int history_id, String tgl_pemesanan) {
        this.history_id = history_id;
        this.tgl_pemesanan = tgl_pemesanan;
    }

    // Metode input untuk setiap atribut
    public void inputHistoryId(int history_id) {
        this.history_id = history_id;
    }

    public void inputTglPemesanan(String tgl_pemesanan) {
        this.tgl_pemesanan = tgl_pemesanan;
    }

    public int ambilHistoryId() {
        this.history_id = 213;
        return history_id;
    }

    public String ambilTglPemesanan() {
        this.tgl_pemesanan = "22 juli 2023";
        return tgl_pemesanan;
    }
}
