import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("양의 정수 10개를 입력하시오>>");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(scanner.nextInt());
        }
        System.out.println("3의 배수는 >>");
        for(int i=0;i<10;i++){
            if(arr.get(i) % 3 == 0){
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
