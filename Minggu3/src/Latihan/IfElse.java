package Latihan;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        // membuat variabel
        int nilai;
        String grade;

        // mengambil input
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai = ");
        nilai = scan.nextInt();

        // hitung gradenya
        if(nilai >= 90){
            grade = "A";
        } else if (nilai >= 80){
            grade = "B+";
        } else if (nilai >= 70){
            grade = "B";
        } else if (nilai >= 60){
            grade = "C+";
        } else if (nilai >= 50){
            grade = "C";
        } else if (nilai >= 40){
            grade = "D";
        } else {
            grade = "E";
        }

        // cetak hasilnya
        System.out.println("Grade = " + grade);

    }
}
