import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a = ");
        float a = sc.nextFloat();

        System.out.print("Nhập vào số b = ");
        float b = sc.nextFloat();

        if (a != 0){
            if (b != 0){
                float x = -b / a;
                System.out.println("Phương trình có nghiệm x = " + x);
            } else{
                System.out.println("Phương trình có nghiệm x = 0");
            }
        } else{
            if (b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            } else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}