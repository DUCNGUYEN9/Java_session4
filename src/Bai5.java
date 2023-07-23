import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Tìm giá trị nhỏ nhất trong mảng
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = new int[5];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("nhập giá trị thứ: " + (i + 1));
            arrInt[i] = scanner.nextInt();
        }
            int min = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            if (min > arrInt[i]) {
                min = arrInt[i];
            }
        }
                System.out.println("giá trị nhỏ nhất trong mảng Là: " + min);
    }
}
