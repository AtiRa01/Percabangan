import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args) {
        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.print(" == MENENTUKAN BILANGAN GANJIL ATAU GENAP == \n");
        System.out.print("\n Masukkan sebuah nilai =github ");
        nilai = scan.nextInt();

        if (nilai % 2 == 0) {
            System.out.print(nilai + " adalah bilangan GENAP.\n");
        } else {
            System.out.print(nilai + " adalah bilangan GANJIL.\n");
        }
    }
}
