/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan49.biayaemas;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi menghitung harga emas saat ini dan 
 *                      total yang hrus dibayar.
 */
public class PBO210117048Latihan49BiayaEmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas(15.7);
        System.out.println("Hitung Mahar Nikah");  
        System.out.println("Harga Emas Saat ini Rp. "+emas.getHarga()
                            +" per gramnya");
        System.out.println("Emas yang ingin dibeli Hendi : "+emas.getBerat()
                            +" gram");
        System.out.println("Total biaya yang harus dikeluarkan Rp. "
                       +emas.hitungHargaEmas(emas.getBerat(), emas.getHarga()));
    }
    
}
