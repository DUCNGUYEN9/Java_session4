import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        //Mảng hai chiều - tính tổng các số ở đường
        //chéo chính của ma trận vuông
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập số dòng và cột bằng nhau");
        System.out.println("nhập vào số dòng: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột: ");
        int m = Integer.parseInt(scanner.nextLine());
        float[][] arrFloat = new float[n][m];
        if (n==m) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("arrFloat[%d][%d]= ", i, j);
                    arrFloat[i][j] = Float.parseFloat(scanner.nextLine());

                }
            }
            for (int i = 0; i < arrFloat.length; i++) {
                for (int j = 0; j < arrFloat[i].length; j++) {
                    System.out.printf("%f\t ",arrFloat[i][j]);
                }
                System.out.println();
            }
            float sumX=0f;
            for (int i = 0; i < arrFloat.length; i++) {
                for (int j = 0; j < arrFloat[i].length; j++) {
                    if(i==j){
                        sumX += arrFloat[i][j];
                    }
                }
            }
            System.out.println("tổng của đường chéo chính là: "+sumX);
        }else {
            System.err.println("Vui lòng nhập lại cột và dòng bằng nhau");
        }
    }
}
