import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Tìm phần tử lớn nhất trong mảng hai chiều
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số dòng: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập vào số cột: ");
        int m = Integer.parseInt(scanner.nextLine());
        float[][] arrFloat = new float[n][m];
        float max = 0;
        int indexRow_max = 0;
        int indexCol_max = 0;
        System.out.println("nhập giá trị cho ma trận");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("arrInt[%d][%d]= ", i, j);
                arrFloat[i][j]=Float.parseFloat(scanner.nextLine());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arrFloat[i][j]){
                    max = arrFloat[i][j];
                    indexRow_max = i;
                    indexCol_max = j;
                }
            }
        }
        System.out.println("phần tử lớn nhất là: " + max);
        System.out.printf("nằm ở vị trí: [%d][%d]", indexRow_max, indexCol_max);
    }
}
