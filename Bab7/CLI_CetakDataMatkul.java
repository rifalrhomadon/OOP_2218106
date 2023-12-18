/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab7;

import ProjectPraktikum.Bab2.*;

/**
 *
 * @author ASUS
 */
public class CLI_CetakDataMatkul {
    public static void main (String[]args){
        Data_Matkul mk = new Data_Matkul();
        System.out.println("Kode Mata Kuliah = "+mk.kode_mk);
        System.out.println("Nama Mata Kuliah = "+mk.nama_mk);
        System.out.println("Dosen Pengajar = "+mk.dosen_pengampu);
        System.out.println("Jumlah Sks = "+mk.jml_sks);
    }
}
