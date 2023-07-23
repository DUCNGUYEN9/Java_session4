import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Gộp mảng
        Scanner scanner = new Scanner(System.in);

        int[] arrInt1 = new int[5];
        System.out.println("nhập mảng phần tử cho mảng thứ nhất ");
        for (int i = 0; i < arrInt1.length; i++) {
            System.out.printf("phần tử thứ %d: ", (i + 1));
            arrInt1[i]=Integer.parseInt(scanner.nextLine());
        }
        int[] arrInt2 = new int[5];
        System.out.println("nhập mảng phần tử cho mảng thứ hai ");
        for (int i = 0; i < arrInt2.length; i++) {
            System.out.printf("phần tử thứ %d: ", (i + 1));
            arrInt2[i]=Integer.parseInt(scanner.nextLine());

        }
        int[] arrInt3 =new int[arrInt1.length+arrInt2.length];
        for (int i = 0; i < arrInt1.length; i++) {
            arrInt3[i]=arrInt1[i];
        }
        for (int i = 0; i < arrInt3.length/2; i++) {
            arrInt3[arrInt1.length +i]=arrInt2[i];
        }
        System.out.println("Mảng thứ 1 là: "+Arrays.toString(arrInt1));
        System.out.println("Mảng thứ 2 là: "+Arrays.toString(arrInt2));
        System.out.println("Mảng thứ 3 là: "+Arrays.toString(arrInt3));
    }
}
