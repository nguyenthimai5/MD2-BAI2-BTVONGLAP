import java.util.Scanner;

public class BT2_inrahaisonguyentodau {
    public static void main(String[] args) {
        System.out.println("TÌM SỐ NGUYÊN TỐ");
        System.out.println("In ra số lượng số nguyên tố");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int  N= 2;
        int count = 0;
                boolean check;
                while (count<num){
                    check = false;
                    for (int i = 2; i < N; i++) {
                        if(N%i==0){
                            check = true;
                            break;
                        }
                    }
                    if(!check){
                        System.out.printf("%d,",N);
                        count++;
                    }
                    N++;
                }
            }
        }


