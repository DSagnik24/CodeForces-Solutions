package A_Problems;

import java.util.Scanner;

public class Team_231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a+b+c >=2){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
