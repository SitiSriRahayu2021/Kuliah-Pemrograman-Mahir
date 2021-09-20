import java.util.Scanner;

public class BubleSorting {

    static void BubbleSort(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length-1; j++) {
                if(angka[j] > angka[j+1]) {
                    int temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah Data : ");
        int jlh_data = scan.nextInt();
        int[] angka = new int[jlh_data];
        System.out.println();
        for(int a = 0; a < jlh_data; a++) {
            System.out.print("Nilai Data ke-" + (a + 1) + " : ");
            angka[a] = scan.nextInt();
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println(" ");
        BubbleSort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
