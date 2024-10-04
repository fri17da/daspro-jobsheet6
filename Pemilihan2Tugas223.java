import java.util.Scanner;

public class Pemilihan2Tugas223 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon = 0.0;

        System.out.print("Masukkan Jenis Buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();
        System.out.println("Masukkan Jumlah Buku: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equals("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
                if (jumlahBuku <= 3) {
                    diskon += 1;
                }
            } 
        } else {
               if (jumlahBuku > 3) {
                diskon = 5;
            }  
        }
        System.out.println("Diskon yang didapatkan: Rp " + diskon + "%");
      
    }
}