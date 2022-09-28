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
        do {
            switch (nhap){
                case 1:
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
                    break;
                case 2:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("nhập chiều dài của hình tam giác ");
                    int c = sc.nextInt();
                    for (int i = 1; i < c; i++) {
                        System.out.print("*\t");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*\t");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Vẽ hình tam giác vuông ở góc trên bên trái");
                    System.out.println("nhập chiều dài của hình tam giác ");
                    int d = sc.nextInt();
                    for (int i = d; i >= 1; i--) {
                        System.out.print("*\t");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*\t");
                        }
                        System.out.print("\n");
                    }break;
                case 4:
                    System.out.println("Vẽ hình tam giác vuông ở góc trên bên phải");
                    System.out.println("nhập chiều dài của hình tam giác");
                    int f = sc.nextInt();
                    for (int i = 0; i < f; i++) {
                        for (int k = 0; k <= i; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < (f - i); j++) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }break;
                case 5:
                    System.out.println("Vẽ hình tam giác vuông ở góc dưới bên phải");
                    System.out.println("nhập chiều dài của hình tam giác ");
                    int h = sc.nextInt();
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < ( h-i); j++) {
                            System.out.print(" ");
                        }  for (int k = i; k >0; k--) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }break;
                case 6:
                    System.out.println("Vẽ hình tam giác cân");
                    System.out.println("nhập chiều dài của hình tam giác ");
                    int g = sc.nextInt();
                    for (int i = 0; i < g; i++) {
                        for (int j = 0; j < (g - i - 1); j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }break;
                case 7:
                    System.exit(0);
            }

        } while (true);
    }
}
