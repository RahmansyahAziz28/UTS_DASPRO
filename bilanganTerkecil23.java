import java.util.Scanner;

public class bilanganTerkecil23 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama\t: ");
        int pertama = sc.nextInt();
        System.out.print("Masukkan angka kedua\t: ");
        int kedua = sc.nextInt();
        System.out.print("Masukkan angka ketiga\t: ");
        int ketiga = sc.nextInt();

        int terkecil = pertama;

        if (kedua < terkecil) {
            terkecil = kedua;
        }
        if (ketiga < terkecil) {
            terkecil = ketiga;
        }

        int nilaiSama = 0;

        String angkaTerbesar = "";

        if (terkecil == pertama) {
            nilaiSama++;
            angkaTerbesar += pertama + "  ";
        }
        if (terkecil == kedua) {
            nilaiSama++;
            angkaTerbesar += kedua + " ";
        }
        if (terkecil == ketiga) {
            nilaiSama++;
            angkaTerbesar += ketiga + " ";
        }

        if (nilaiSama > 1) {
            System.out.println("Ada angka terkecil yang sama dengan nilai\t: " + terkecil);
            System.out.println("Angka tersebut adalah\t\t\t\t: " + angkaTerbesar);
        } else {
            System.out.println("Bilangan terkecil adalah\t\t\t\t: " + terkecil);
        }
    }
}
