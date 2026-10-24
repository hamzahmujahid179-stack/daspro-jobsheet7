import java.util.Scanner;

public class TugasBioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double jumlahTiket, hargaTiket = 50000, totaltiket = 0, totalHarga = 0, harga, diskon = 0;

        do {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextDouble();

            if (jumlahTiket == 0) {
                System.out.println("Terima kasih telah menggunakan layanan kami.");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang valid!");
                continue;
            }

            if (jumlahTiket > 4) {
                diskon = 0.1 * hargaTiket;
            } else if (jumlahTiket > 10) {
                diskon = 0.15 * hargaTiket;
            } else {
                diskon = 0;
            }

            totaltiket += jumlahTiket;
            harga = (jumlahTiket * hargaTiket) - diskon;
            totalHarga += harga;

            System.out.println("Total harga tiket: Rp " + harga);
            System.out.println("Diskon yang diberikan: Rp " + diskon);

            sc.nextLine(); // Membersihkan newline dari buffer
        } while (true);

        System.out.println("Semua transaksi selesai.");
        System.out.println("Total tiket yang terjual dalam satu hari: " + totaltiket);
        System.out.println("Total Harga penjualan tiket dalam satu hari(Pendapatan): Rp " + totalHarga);
        sc.close();
    }
}
