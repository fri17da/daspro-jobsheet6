import java.util.Scanner;

public class Pemilihan2Tugas123 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int bil1 = 28, bil2 = 54, bil3 = 15;
        int max;

        if (bil1 >= bil2) {
            max = bil1;
        } else {
            max = bil2;
        if (bil2 >= bil3){
            max = bil2;
        } else {
            max = bil3;
        }
        System.out.println("Bilangan terbesar: " + max);
        }         
}
}   
 