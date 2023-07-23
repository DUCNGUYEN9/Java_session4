import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    //Xoá phần tử khỏi mảng
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = new int[]{10, 4, 6, 7, 8, 5};
        int[] arrInt_new = new int[arrInt.length-1];
        System.out.print("Hãy nhập phần tử cần xóa: ");
        int removeX = Integer.parseInt(scanner.nextLine());
        for (int i = 0,k=0; i < arrInt.length; i++) {
            if (arrInt[i]!=removeX) {
                arrInt_new[k]=arrInt[i];
                k++;
            }

        }
        arrInt=arrInt_new;

        System.out.println("Mảng mới là: "+Arrays.toString(arrInt));

    }
}
