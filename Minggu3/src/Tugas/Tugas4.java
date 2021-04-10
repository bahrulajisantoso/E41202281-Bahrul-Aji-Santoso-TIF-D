package Tugas;

import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        System.out.println("    Kharisma Agung Plaza <KAP>  ");
        System.out.println("     Promo Belanja Berhadiah    ");
        System.out.println("  Khusus Pembelian 5 Barang Pertama"    );
        System.out.println(" Dengan Harga minimun Rp.10000,00");
        System.out.println("---------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nama Pembeli : ");
        String pembeli = scan.nextLine();
        System.out.println("");

        int jumlahHarga = 0;
        int harga       = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Masukan harga barang ke-" + i + " = ");
            harga = scan.nextInt();
            jumlahHarga += harga;
        }
        System.out.print("Total harga pembelian atas nama " + pembeli);
        System.out.println(" adalah Rp." + jumlahHarga);

        if (harga >= 10000 && harga >= 10000){
            System.out.println("\nSelamat ...");
            System.out.println("Anda mendapatkan hadiah satu 1 buah mug cantik");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("                  Terimakasih                   ");
        System.out.println("Anda sudah berbelanja di Kharisma Agusng Plaza");

    }
}
