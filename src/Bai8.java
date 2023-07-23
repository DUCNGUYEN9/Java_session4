import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        //Đếm số lần xuất hiện của ký tự trong chuỗi
        Scanner scanner = new Scanner(System.in);
        String str ="Life is not about waiting for the storm to pass, it's about learning to dance in the rain.";
        System.out.println(str);
        System.out.print("--Hãy nhập vào 1 ký tự: ");
        char ky_tu= scanner.nextLine().charAt(0);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ky_tu){
                count++;
            }
        }

        System.out.println("ký tự bạn vừa nhập được lặp lại: "+count);
    }
}
