/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab1;

/**
 *
 * @author ASUS
 */
public class CLI_CetakKTM {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.dataNIM("2218106");
        mhs.dataNama("Rifal Rifqi Rhomadon");
        mhs.dataJenisKelamin("Laki-laki");
        mhs.dataProdi("Teknik Informatika");
        mhs.dataAngkatan("2022");
        mhs.dataAlamat("Situbondo");
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("--------------------------------");
        System.out.println("NIM          :"+ mhs.cetakNIM());
        System.out.println("Nama         :"+ mhs.cetakNama());
        System.out.println("Jenis Kelamin : " +mhs.cetakJenisKelamin());
        System.out.println("Prodi        : "+ mhs.cetakProdi());
        System.out.println("Angkatan     : "+ mhs.cetakAngkatan());
        System.out.println("Alamat       : "+ mhs.cetakAlamat());
    }
    
}
