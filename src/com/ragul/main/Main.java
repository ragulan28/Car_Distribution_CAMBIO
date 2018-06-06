package com.ragul.main;

import java.util.Scanner;

public class Main {

    static int carDistribution(int n, int[] ar) {
        int maxCount = 1, currentCount;
        int popular = ar[0];
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            temp = ar[i];
            currentCount = 0;

            for (int j = 1; j < n; j++) {
                if (temp == ar[j])
                    currentCount++;
            }

            if (currentCount > maxCount || (currentCount == maxCount && popular > temp)) {
                popular = temp;
                maxCount = currentCount;
            }
        }
        return popular;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = carDistribution(n, ar);
        System.out.println(result);
    }
}
