import java.util.Scanner;

public class Komisi23 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int omset, rating;
        double komisi;
        boolean isCertified;

        System.out.print("Masukkan omset bulanan: Rp. ");
        omset = sc.nextInt();

        if (omset <= 0) {
            System.out.println("Omset tidak valid");
            return;
        }

        System.out.print("Masukkan rating (1-100): ");
        rating = sc.nextInt();
        System.out.print("Apakah bersertifikat? (ya/tidak): ");
        String sertifikatInput = sc.next();
        isCertified = sertifikatInput.equalsIgnoreCase("ya");

        if (rating < 70){
            System.out.println("Komisi = 0(tidak memenuhi syarat)");
        } else if (rating >= 70){
            if (omset < 50_000_000){
                komisi = 0.01;
            } else if (omset >= 50_000_000 && omset <= 100_000_000){
                komisi = 0.02;
            } 

            if (rating >= 90) {
                komisi += 0.01;
            }
            
            double bonus1 = omset * komisi;
            double bonus = bonus1;
            if (isCertified && rating >= 70) {
                bonus += 500_000;
            }
            System.out.println("Persentase komisi: " + (int)(komisi * 100) + "%");
            System.out.println("Jumlah komisi: Rp " + (int)bonus1);
            System.out.println("Bonus sertifikasi: Rp" + (isCertified && rating >= 70 ? "500000" : "0"));
            System.out.println("Total bonus yang diterima: Rp " + (int)bonus);
        }
    }
}
