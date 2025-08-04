import java.util.Scanner;

public class Waytoolongwords {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        for(int i=0;i<t;i++) {
            String x = in.nextLine();

            if (x.length() > 10) {
                System.out.println(x.charAt(0) + "" + (x.length() - 2) + x.charAt(x.length() - 1));
            } else {
                System.out.println(x);
            }
        }
    }
}
