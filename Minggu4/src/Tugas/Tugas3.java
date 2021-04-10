package Tugas;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        int deret;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan banyaknya data nilai = ");
        deret = scan.nextInt();
        int [] angka = new int[deret];

        for (int i = 0; i < deret; i++){
            System.out.print("Masukan nilai data ke-" + (i+1) + " = ");
            angka[i] = scan.nextInt();
        }
        System.out.println("");

        int nilaiMax = angka[0];
        int nilaiMin = angka[0];
        for (int i = 0; i < deret; i++){
            if (angka[i] > nilaiMax){
                nilaiMax = angka[i];
            } else if (angka[i] < nilaiMin){
                nilaiMin = angka[i];
            }
        }
        System.out.println("Nilai minimum = " + nilaiMin);
        System.out.println("Nilai maximum = " + nilaiMax);

        int jumlah = 0;
        for (int i = 0; i < deret; i++){
            jumlah += angka[i];
        }
        float avg = jumlah / deret;
        System.out.println("Nilai rata-ratanya adalah = " + avg);
    }
}
