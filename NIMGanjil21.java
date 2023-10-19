//Nama: Dhiya' Ulhaq Ulayya
//NIM: 2341720021
//Kelas/Absen: TI-1F/08

import java.util.Scanner;

public class NIMGanjil21 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        double totalHarga = 0;
        int jumlahMinuman = 0;
        double ppn = 0;
        
        System.out.println("Selamat datang!");
        boolean inginBelanja = true;

        while (inginBelanja) {
            System.out.println("Masukkan jenis barang (makanan/minuman): ");
            String jenisBarang = input08.next();
            input08.nextLine();

            System.out.println("Masukkan nama barang: ");
            String namaBarang = input08.nextLine();

            System.out.println("Masukkan harga barang: ");
            double hargaBarang = input08.nextDouble();

            if (jenisBarang.equalsIgnoreCase("minuman")) {
                jumlahMinuman++;
                if (jumlahMinuman == 3) {
                    hargaBarang *= 0.95;
                    jumlahMinuman = 0;
                }
            }

            totalHarga += hargaBarang;

            System.out.print("Apakah Anda ingin membeli lagi? (y/t): ");
            String inginBeliLagi = input08.next();
            if (inginBeliLagi.equalsIgnoreCase("t")) {
                inginBelanja = false;
            }
        }

        System.out.print("Apakah Anda ingin membeli kantong plastik? (y/t): ");
        String beliKantongPlastik = input08.next();

        if (beliKantongPlastik.equalsIgnoreCase("y")) {
            totalHarga -= 200;
        }

        if (totalHarga >= 1000000) {
            ppn = totalHarga * 0.07;
        }

        double totalPembayaran = totalHarga + ppn;

        System.out.println("--------------------------------------------");
        System.out.println("|           TOTAL PEMBAYARAN ANDA          |");
        System.out.println("--------------------------------------------");
        System.out.println("    Total harga belanja: Rp." + totalHarga);
        System.out.println("    PPN (7%): Rp." + ppn);
        System.out.println("    Total pembayaran: Rp." + totalPembayaran);
        System.out.println("--------------------------------------------");

        System.out.println("Terima Kasih. Selamat Belanja Kembali");
        

    }
}
