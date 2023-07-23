import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        //Tính tổng các số ở một cột xác định
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số dòng: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột: ");
        int m = Integer.parseInt(scanner.nextLine());
        float[][] arrFloat = new float[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("arrFloat[%d][%d]= ", i, j);
                arrFloat[i][j] = Float.parseFloat(scanner.nextLine());

            }
        }
        for (int i = 0; i < arrFloat.length; i++) {
                System.out.printf("Dòng:%d-->\t",i);
            for (int j = 0; j < arrFloat[i].length; j++) {
                System.out.printf("%f\t ",arrFloat[i][j]);
            }
            System.out.println();
        }
        float sum = 0f;
        System.out.println("hãy nhập số CỘT (bắt đầu từ 0) bạn muốn tính tổng: ");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat[i].length; j++) {
                if (choice == j) {
                    sum += arrFloat[i][j];
                }
            }
        }
        System.out.printf("tổng của dòng %d  : %f",choice,sum);
    }
}
