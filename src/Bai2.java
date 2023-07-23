import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Thêm phần tử vào mảng
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = {10, 4, 6, 7, 8};
        System.out.println("Mảng cũ là: " + Arrays.toString(arrInt));
        System.out.print("hãy thêm 1 số: ");
        int elementAdd = Integer.parseInt(scanner.nextLine());
        int index = 2;
        int[] arrInt_new = new int[arrInt.length + 1];
        for (int i = 0; i < arrInt.length; i++) {
            if (i < index) {
                arrInt_new[i] = arrInt[i];
            } else if (i > index) {
                arrInt_new[i+1] = arrInt[i];
            } else {
                arrInt_new[index] = elementAdd;
                arrInt_new[index+1] = arrInt[i];
            }
        }
        arrInt = arrInt_new;
        System.out.println("Mảng mới là: " + Arrays.toString(arrInt));

    }
}
