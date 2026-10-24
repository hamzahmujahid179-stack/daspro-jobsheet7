import java.util.Scanner;

public class TugasParkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double jenisKendaraan, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (ketik 0 untuk keluar): ");
            jenisKendaraan = sc.nextDouble();

            if (jenisKendaraan == 0) {
                System.out.println("Terima kasih telah menggunakan layanan kami.");
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextDouble();

            if (durasi < 0) {
                System.out.println("Durasi parkir tidak valid. Masukkan durasi yang valid!");
                continue;
            }

            if (jenisKendaraan == 1) { // Mobil
                total += durasi * 3000;
            } else if (jenisKendaraan == 2) { // Motor
                total += durasi * 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid. Masukkan jenis kendaraan yang valid!");
                continue;
            }

        } while (true);

        System.out.println("Total biaya parkir: Rp " + total);
        sc.close();
    }
}
