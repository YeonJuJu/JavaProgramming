import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 몇개? : ");
        int num = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<num;i++){
            int a = (int) (Math.random()*100 + 1);
            if(arr.contains(a)) {
                i--;
                continue;
            }
            arr.add(a);
        }

        for(int i=0;i<num;i++){
            System.out.print(arr.get(i) + " ");
            if((i+1)%10 == 0)
                System.out.println();
        }
    }
}
