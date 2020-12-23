import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int middle;

        if(num1 > num2){
            if(num2 > num3)
                middle = num2;
            else{
                if(num3 < num1)
                    middle = num3;
                else
                    middle = num1;
            }
        }
        else{
            if(num1 > num3)
                middle = num1;
            else{
                if(num3 < num2)
                    middle = num3;
                else
                    middle = num2;
            }
        }
        System.out.println("중간 값은 " + middle);
    }
}
