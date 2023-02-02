import java.util.Scanner;

public class HienThiCachLoaiHinh {
    public static void main(String[] args) {
        int choice;
        int a, b;
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Menu");
        System.out.println("1. Ban muon in hinh vuong");
        System.out.println("2. Ban muon In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. Ban muon In hình tam giác vuông, có cạnh góc vuông ở top-left  ");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Vui long nhap chieu rong : ");
                a = input.nextInt();
                System.out.print("Vui long nhap chieu dai : ");
                b = input.nextInt();
                for (int i = a; i >= 1; i--) {
                    for (int j = b; j > 1; j--) {
                        System.out.print("*  ");
                    }
                    System.out.println("*");
                }
                break;
            case 2:
                System.out.print("Vui long nhap chieu dai canh: ");
                a = input.nextInt();
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("*");
                }
                break;
            case 3:
                System.out.print("Vui long nhap chieu dai canh: ");
                a = input.nextInt();
                for (int i = a; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("*");
                }
                break;
//            case 0:
//                System.exit(0);
            default:
                System.out.println("No choice!");

        }}while (choice != 0);

    }
}
