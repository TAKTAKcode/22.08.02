package com.tak.notation;

import java.util.Scanner;

public interface OctHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int x = sc.nextInt();

        System.out.printf("8진수는 %o입니다.", x);
        System.out.printf("10진수는 %d입니다.\n", x);
        System.out.printf("16진수는 %x입니다.\n", x);
    }
}
