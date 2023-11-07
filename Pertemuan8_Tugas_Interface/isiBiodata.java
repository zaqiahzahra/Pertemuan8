/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan8_Tugas_Interface;

/**
 *
 * @author zaqiah ahmad
 */
public class isiBiodata implements Biodata {
    @Override
    public void nama(){
        System.out.println("nama saya siti zaqiah azahra");
    }

    @Override
    public void tanggalLahir() {
        System.out.println("tanggal lahir 1 febreruari 2002");
    }

    @Override
    public void alamat() {
        System.out.println("alamat Tulungagung");
    }
}
