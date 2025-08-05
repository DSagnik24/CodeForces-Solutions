package A_Problems;

import java.util.Scanner;

public class NextRound_158A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of participants
        int k = scanner.nextInt(); // k-th place (1-based index)

        int[] scores = new int[n];

        // Reading scores
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int kthScore = scores[k - 1]; // 0-based indexing

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= kthScore && scores[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

