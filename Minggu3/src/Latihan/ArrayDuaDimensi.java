package Latihan;

public class ArrayDuaDimensi {

    public static void main(String[] args) {

        int[] [] angka = {{2,4,3,6,5},{1,5,6,4,2},{0,8,9,6,7}};

        for (int baris = 0; baris < 3; baris++){
            for (int kolom = 0; kolom < 5; kolom++){
                System.out.print(angka[baris][kolom] + "\t");
            }
            System.out.println("");
        }
    }
}
