import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.print(number + "Khong Phai La So Nguyen To");
        } else {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number % i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.print(number + " la so nguyen to");
            }else {
                System.out.print(number + " khong phai la so nguyen to");
            }
        }

    }
}
