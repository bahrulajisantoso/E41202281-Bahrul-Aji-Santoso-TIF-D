package Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan batas awal bilangan = ");
        int x = scan.nextInt();
        System.out.print("Masukan batas akhir bilangan = ");
        int y = scan.nextInt();


        for (int i = x; i <= y; i++){
            if (i % 2 == 0 && i != 0){
                int hasil = i;
                System.out.print(hasil + " ");
            }
        }
    }
}
