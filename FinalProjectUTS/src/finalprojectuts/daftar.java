/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectuts;

/**
 *
 * @author Pak Pin
 */
public class daftar {
    private barang[] daftarBarang;
    
    // Constructor
    public daftar(){
        this.daftarBarang = new barang[10];
    }
    
    //Getter dan Setter
    public void setDaftarBarang(barang[] daftarBarang) {
        this.daftarBarang = daftarBarang;
    }
    
    public barang[] getDaftarBarang() {
        return daftarBarang;
    }
}
