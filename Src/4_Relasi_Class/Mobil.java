/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author FARIZ
 */
public class Mobil {
   private String merk;
   private int biaya;
   
   public Mobil(String merk,int biaya){
       this.merk=merk;
       this.biaya=biaya;
   }
   public Mobil(){
       this.merk=merk;
       this.biaya=biaya;
   }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getMerk() {
        return merk;
    }

    public int getBiaya() {
        return biaya;
    }
   public int hitungBiayaMobil(int hari){
       return biaya*hari;  
   }
}
