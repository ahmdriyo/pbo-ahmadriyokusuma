/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel;

/**
 *
 * @author ahmad
 */
public class gaji_pegawai {
    int gaji_id,gaji_pokok,tunjangan;
    public gaji_pegawai() {}
    
    public gaji_pegawai(int gaji_id,int gaji_pokok,int tunjangan) {
        this.gaji_id = gaji_id;
        this.gaji_pokok = gaji_pokok;
        this.tunjangan = tunjangan;
    }
    
    public void inputGaji_id(int gaji_id) {
        this.gaji_id = gaji_id;
    }

    public int ambiGaji_id() {
        return this.gaji_id;
    }
    
    public void inputGaji_pokok(int gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }
    public int ambilGaji_pokok(){
        this.gaji_pokok = 4000000;

        return this.gaji_pokok;
        
    }
    public void inputTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    public int ambilTunjangan(){
        this.tunjangan = 2000000;

        return this.tunjangan;
        
    }
    public int gajiTotal() {
        return ambilGaji_pokok() + ambilTunjangan();
    }
}
