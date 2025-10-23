import java.util.Scanner;

public class MHR23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;
        double HR, MHR, instensitas;

        System.out.print("Input usia: ");
        usia = sc.nextInt();
        
        if (usia >= 10 && usia <= 100) {
            System.out.println("HR Positif");
            System.out.print("Input HR: ");
            HR = sc.nextDouble();
            MHR = 220 - usia;
            instensitas = (HR / MHR * 100);
            double HMRPercent = (int)(HR / MHR * 100);

            System.out.println("Intensitas: " + HMRPercent + "%");
            System.out.println("MHR: " + MHR);
            if (instensitas < 50) {
                System.out.println("Intensitas Sangat Ringan, Pemanasan, manfaat minimal");
            } else if (instensitas >= 50 && instensitas <= 59) {
                System.out.println("Intensitas Ringan, Peningkatan dasar kebugaran");
            } else if (instensitas >= 60 && instensitas <= 69) {
                System.out.println("Intensitas sedang, Zona aerobik nyaman");
            } else if (instensitas >= 70 && instensitas <= 80) {
                System.out.println("Kuat, meningkatkan kapasitas kardiorespirasi");
            } else if (instensitas > 85) {
                System.out.println("Sangat berat, Berisiko bagi pemula");
            } else {
                System.out.println("Diluar Batas Intensitas");
            }
        } else if (usia < 10 || usia > 100) {
            System.out.println("HR Negatif");
        } else {
            System.out.println("Invalid");
        }
    }

}
