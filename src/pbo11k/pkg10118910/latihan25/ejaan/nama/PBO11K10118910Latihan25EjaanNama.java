/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan25.ejaan.nama;
import java.util.*;
/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh 
 * Kelas:IF11K 
 * NIM  :10118910
 *
 * Description : Program Mengeja Nama
 */
public class PBO11K10118910Latihan25EjaanNama {
   
    public static void main(String[] args) {
        String nama;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scan.next();
        System.out.println("\nEjaan Untuk \""+nama+"\" adalah : ");
        char[] strArr = nama.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("Huruf ker-"+(i+1)+" : "+ strArr[i]);
        }
    }
    
}
