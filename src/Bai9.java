import java.util.Arrays;

public class Bai9 {
    public static void main(String[] args) {
        //Tìm phần tử lớn thứ 2 trong Mảng
        int[] arrInt = {1, 6, 2, -8, 17, 3};
        int max = arrInt[0];
        int max2 = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (max < arrInt[i]) {
                max2 = max;
                max = arrInt[i];
            } else if (arrInt[i] > max2 && max > arrInt[i]) {
                max2 = arrInt[i];
            }
        }
        System.out.println("max: " + max + " max2: " + max2);
    }
}
