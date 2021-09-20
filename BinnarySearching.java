import java.util.Scanner;

public class BinnarySearching {
    static void BubbleSort(int[] angka) {
        for (int i = 0; i <angka.length; i++) {
            for(int j = 0; j < angka.length-1; j++) {
                if(angka[j] > angka[j+1]) {
                    int temp = angka[j];
                    angka[j] = angka [j+1];
                    angka[j+1] = temp;
                }
            }
        }
    }

    static int binarySearch(int[] angka, int cari, int i, int j) {
        int tengah;
        while (i<=j) {
            tengah =(i+j)/2;
            if(cari== angka[tengah]) return tengah;
            else if(cari < angka[tengah]) j = tengah-1;
            else i = tengah +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah Data : ");
        int jlh_data = scan.nextInt();
        int[] angka = new int[jlh_data];
        System.out.println();
        for(int a = 0; a < jlh_data; a++) {
            System.out.print("Nilai Data ke-"+(a+1)+" : ");
            angka[a] = scan.nextInt();
        }


        BubbleSort(angka);

        for(int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        // Input nilai yang dicari
        System.out.print("\n\nMasukkan nilai yang dicari : ");
        int cari = scan.nextInt();

        int hasil = binarySearch(angka,cari, 0, angka.length-1);

        if(hasil>=0) System.out.println("\nAngka " + cari + " terdapat pada index ke-" + hasil);
        else System.out.println("\nAngka " + cari + " tidak terdapat pada array");

    }

}
