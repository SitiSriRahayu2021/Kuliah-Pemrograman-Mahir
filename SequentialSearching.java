import java.util.Scanner;

public class SequentialSearching {
    static int SequentialSearch(int[] angka, int cari) {
        for (int i = 0; i < angka.length; i++) {
            if(cari==angka[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int jlh_data = scan.nextInt();
        int[] angka = new int[jlh_data];
        System.out.println();
        for(int a = 0; a < jlh_data; a++) {
            System.out.print("Nilai Data ke-"+(a+1)+" : ");
            angka[a] = scan.nextInt();
        }
        // Input nilai yang dicari
        System.out.print("\n\nMasukkan nilai yang dicari : ");
        int cari = scan.nextInt();

        System.out.println("Angka " + cari + " terdapat pada index ke-" + SequentialSearch(angka,cari));
    }
}
