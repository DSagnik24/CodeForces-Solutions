package A_Problems;

import java.util.Scanner;

public class Watermelon_4A {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if( x>2 && x%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        in.close();
    }
}
