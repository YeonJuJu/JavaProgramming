import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();
        float ave = 0;

        System.out.print("랜덤한 정수들 : ");
        for(int i=0;i<10;i++){
            arr.add((int) (Math.random()*10 + 1));
            System.out.print(arr.get(i) + " ");
            ave +=arr.get(i);
        }
        System.out.println();

        ave /= 10f;
        System.out.println("ave : " + ave);
    }
}
