import java.util.Scanner;

public class SelectionSorting {
    static void SelectionSort(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            int indexArray = i;
            for(int j = i; j < angka.length; j++) {
                if(angka[indexArray] > angka[j]) {
                    indexArray = j;
                }
            }
            int temp = angka[i];
            angka[i] = angka[indexArray];
            angka[indexArray] = temp;
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
        SelectionSort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}




