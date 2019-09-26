/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstatik;

/**
 * Nama     : Moch Rizki Maulana N
 * Kelas    : IF-1 2018
 * Nim      : 10118012
 * Deskripsi Program : kambing statik dan konstanta
 *
 * @author LENOVO
 */
public class KambingStatik {
    
//NAMA_KAMBING Sebagai Konstanta
    public static final String NAMA_KAMBING ="MIDUN";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing =485000;
        System.out.println(NAMA_KAMBING+" Memiliki Kambing Sebanyak "+Mamalia.jumlahKambing);
    }
    
}
