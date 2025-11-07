import java.util.Scanner;

public class siakadFor16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;
        int jumlahTidakLulus=0, jumlahLulus=0;

        //If nilai < 60 = tidak lulus

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai < 60) {
                jumlahTidakLulus++;
            } else {
                jumlahLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    }
}
