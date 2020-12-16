import java.util.Scanner;

public class Tahun_Kabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);

        System.out.print(" == MENENTUKAN TAHUN KABISAT == \n ");
        System.out.print("\n Masukkan tahun yang ingin di cek : ");
        tahun = scan.nextInt();

        if (tahun % 4 == 0) {
            System.out.print(tahun + " merupakan Tahun Kabisat\n");
        } else if (tahun % 100 == 0) {
            System.out.print(tahun + " BUKAN Tahun Kabisat\n");
        } else if (tahun % 400 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else {
            System.out.print(tahun + " BUKAN Tahun Kabisat\n");
        }
    }
}
