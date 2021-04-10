package Tugas;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas2Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang array : ");
        int panjangArray = scan.nextInt();

        int[] dataArray = new int[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            int angka = (int) (Math.random() * 10);
            dataArray[i] = angka;
        }

        System.out.println(Arrays.toString(dataArray));

    }
}
