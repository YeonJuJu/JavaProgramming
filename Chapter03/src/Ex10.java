public class Ex10 {
    public static void main(String[] args){
        int arr[][] = new int[4][4];

        for(int i=0;i<10;i++){
            int x = (int) Math.abs(Math.random()*4);
            int y = (int) Math.abs(Math.random()*4);
            if(arr[x][y] != 0){
                i--;
                continue;
            }
            arr[x][y] = (int) (Math.random()*10+1);
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
