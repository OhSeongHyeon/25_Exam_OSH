package org.example;

import java.util.Arrays;

public class Main3 {

    static int n = 10;
    static int[] dp = new int[n];

    static {
        dp[0] = 0;
        dp[1] = 1;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        pib(n - 1);
        Arrays.stream(dp)
            .forEach(e -> sb.append(String.format("%d ", e)));
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }

    private static int pib(int i) {
        if(i < 1) {
            return 0;
        }else if(i < 2) {
            return 1;
        }
        if(dp[i] != 0) {
            return dp[i];
        }
        dp[i] = pib(i - 1) + pib(i - 2);
        return dp[i];
    }
}
