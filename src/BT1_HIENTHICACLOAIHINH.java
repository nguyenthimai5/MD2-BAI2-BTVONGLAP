import java.util.Scanner;

public class BT1_HIENTHICACLOAIHINH {
    public static void main(String[] args) {
        System.out.println("-------------MENU-------------");
        System.out.println("1.Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3.Vẽ hình tam giác vuông ở góc trên bên trái");
        System.out.println("4. Vẽ hình tam giác vuông ở góc trên bên phải");
        System.out.println("5.Vẽ hình tam giác vuông ở góc dưới bên phải");
        System.out.println("6.Vẽ hình tam giác cân");
        System.out.println("7.EXIT");
        System.out.println("Bạn lựa chọn số nào:");
        Scanner sc = new Scanner(System.in);
        int nhap = sc.nextInt();
        if (nhap == 1) {
            System.out.println("Vẽ hình chữ nhật");
            System.out.println("nhập chiều dài của hình chữ nhật");
            int a = sc.nextInt();
            System.out.println("nhập chiều rộng của hình chữ nhật");
            int b = sc.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    System.out.print("*\t");
                }
                System.out.print("\n");
            }
        }
        if (nhap == 2) {
            System.out.println("Vẽ hình tam giác");
            System.out.println("nhập chiều dài của hình tam giác ");
            int a = sc.nextInt();
            for (int i = 1; i < a; i++) {
                System.out.print("*\t");
                for (int j = 1; j < i; j++) {
                    System.out.print("*\t");
                }
                System.out.print("\n");
            }
        }
        if (nhap == 3) {
            System.out.println("Vẽ hình tam giác vuông ở góc trên bên trái");
            System.out.println("nhập chiều dài của hình tam giác ");
            int a = sc.nextInt();
            for (int i = a; i >= 1; i--) {
                System.out.print("*\t");
                for (int j = 1; j < i; j++) {
                    System.out.print("*\t");
                } System.out.print("\n");
            }
        }
        if (nhap == 5) {
            System.out.println("Vẽ hình tam giác vuông ở góc trên bên phải");
            System.out.println("nhập chiều dài của hình tam giác");
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (a - i); j++) {
                    System.out.print("* ");
                }
                System.out.println("\n");
            }
        }
        if (nhap == 4) {
            System.out.println("Vẽ hình tam giác vuông ở góc dưới bên phải");
            System.out.println("nhập chiều dài của hình tam giác ");
            int a = sc.nextInt();
            for (int i = a; i >=1; i--) {
                System.out.println("\t");
                for (int j = 0; j <=i; j++) {
                    System.out.print("\t*");
                }
            }
        }if (nhap==6){
            System.out.println("Vẽ hình tam giác cân");
            System.out.println("nhập chiều dài của hình tam giác ");
            int a = sc.nextInt();
            for (int i = 0; i <a; i++) {
                for (int j = 0; j <(a-i-1);j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <=i ; k++) {
                    System.out.print("* ");
                }
                System.out.println("\n");
            }

        }
        if (nhap==7){
            System.exit(0);
        }
    }
}
