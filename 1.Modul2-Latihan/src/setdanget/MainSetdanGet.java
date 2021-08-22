/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setdanget;

/**
 *
 * @author vicky
 */
public class MainSetdanGet {
    public static void main(String[] args) {
        int total_harga;
        
        SetdanGet brg1 = new SetdanGet();
        brg1.setNama("Bolpoint");
        brg1.setStok(10);
        brg1.setHarga_satuan(2000);
        brg1.setHarga(10, 2000);
        int a=brg1.getHarga();
        
        SetdanGet brg2 = new SetdanGet();
        brg2.setNama("Pensil");
        brg2.setStok(10);
        brg2.setHarga_satuan(1000);
        brg2.setHarga(10, 1000);
        int b=brg2.getHarga();
        
        SetdanGet brg3 = new SetdanGet();
        brg3.setNama("Penghapus");
        brg3.setStok(10);
        brg3.setHarga_satuan(500);
        brg3.setHarga(10, 500);
        int c=brg3.getHarga();
        
        System.out.println("Nama barang: " +brg1.getNama());
        System.out.println("Stok barang: " +brg1.getStok());
        System.out.println("Harga satuan barang: " +brg1.getHarga_satuan());
        System.out.println("Harga barang: " +brg1.getHarga());
        
        System.out.println("\nNama barang: " +brg2.getNama());
        System.out.println("Stok barang: " +brg2.getStok());
        System.out.println("Harga satuan barang: " +brg2.getHarga_satuan());
        System.out.println("Harga barang: " +brg2.getHarga());
        
        System.out.println("\nNama barang: " +brg3.getNama());
        System.out.println("Stok barang: " +brg3.getStok());
        System.out.println("Harga satuan barang: " +brg3.getHarga_satuan());
        System.out.println("Harga barang: " +brg3.getHarga());
        
        total_harga=a+b+c;
        System.out.println("\nTotal_harga: " +total_harga);
        
    }
    
}
