import java.util.Scanner;

public class DINER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = 300;
        int[] arr = new int[7];
        for(int i=0;i<d;i++){
            int index = sc.nextInt();
            arr[index]++;
        }
        int wages = d * x;
        int[] dec_percent = new int[7];
        int dec = 0;
        for(int i=1;i<7;i++){
            dec_percent[i] = dec;
            dec += 2;
        }
        int[] tips = new int[7];
        for(int i=1;i<7;i++){
            if (i == 1){
                tips[i] = y * arr[i];
            }
            else {
                tips[i] = y * arr[i] * (1 - dec_percent[i]/100);
            }
        }
        int total_tip = 0;
        for(int i=1;i<7;i++){
            total_tip += tips[i];
        }
        if(wages + total_tip >= z){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
