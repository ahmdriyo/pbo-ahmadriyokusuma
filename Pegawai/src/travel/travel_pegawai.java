/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author ahmad
 */
public class travel_pegawai extends gaji_pegawai {
    int nik,id;
    String nama,jenis_kelamin,tgl_lahir,alamat,kontak,jabatan;
    
    public travel_pegawai(){}
    public travel_pegawai(String nama, String jenis_kelamin,String tgl_lahir,String alamat, String kontak, String jabatan, int id,int nik) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.kontak = kontak;
        this.id = id;
        this.nik = nik;
    }
     public void inputNIK(int nik) {
        this.nik = nik;
    }

    public int ambilNIK() {
        return this.nik;
    }

    public void inputID(int id) {
        this.id = id;
    }

    public int ambilID() {
        return this.id;
    }

    public void inputNama(String nama) {
        this.nama = nama;
    }

    public String ambilNama() {
        return this.nama;
    }

    public void inputJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String ambilJenisKelamin() {
        return this.jenis_kelamin;
    }

    public void inputTanggalLahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String ambilTanggalLahir() {
        return this.tgl_lahir;
    }

    public void inputAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String ambilAlamat() {
        return this.alamat;
    }

    public void inputKontak(String kontak) {
        this.kontak = kontak;
    }

    public String ambilKontak() {
        return this.kontak;
    }

    public void inputJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String ambilJabatan() {
        return this.jabatan;
    }
    
}
