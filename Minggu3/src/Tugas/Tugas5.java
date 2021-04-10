package Tugas;

import java.util.Scanner;

public class Tugas5 {

    public static void main(String[] args) {

        System.out.print("         CAFE CERIA\n" +
                                "\t\tANEKA MINUMAN\n" +
                         "--------------------------------\n" +
                                "\t\tSPECIAL MENU\n" +
                                "\t1. Soft drinks\n" +
                                "\t2. Mix juice\n" +
                                "\t3. Nescafe\n" +
                                "\t4. Soda milk\n" +
                                "\t5. Tea\n" +
                         "--------------------------------\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nama pembeli : ");
        String pembeli = scan.nextLine();
        System.out.println("");

        System.out.print("Silahkan masukkan pilihan anda : ");
        int menu = scan.nextInt();

        switch (menu){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Nomor yang anda masukkan salah!");
        }

        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria");

    }
}
