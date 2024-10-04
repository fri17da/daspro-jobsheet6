import java.util.Scanner;
public class Pemilihan2Tugas323 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga = 0;

        System.out.print("Masukkan merk sepatu (Converse/Sketcher/Nike): ");
        merk = sc.nextLine();
        System.out.print("Masukkan kategori sepatu (Slip on/High top/Woman/Man/Kids/Adult): ");
        kategori = sc.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = sc.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip on") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High top") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1200000;
        } else if (merk.equalsIgnoreCase("Sketcher")) {
             if (kategori.equalsIgnoreCase("Woman") && (ukuran >= 36 && ukuran <= 41)) {
                harga = 1000000;
                
        } else if (kategori.equalsIgnoreCase("Man") && (ukuran >= 41 && ukuran <= 44)) {
                harga = 1800000;
        }
    }
               
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1500000;
            }
        }
        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Kombinasi merk, kategori, dan ukuran tidak ditemukan.");
        }
    }
}