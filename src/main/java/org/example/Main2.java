package org.example;

import java.util.Scanner;

//2번 문제
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(i));
            for (int j = n-i; j >= 1; j--) {
                sb.append(String.format("%d ", j));
            }
            sb.setLength(sb.length()-1);
            sb.append("\n");
        }

        System.out.printf(sb.toString());
        sc.close();
    }
}
