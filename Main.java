package com.ohgiraffers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료하시려면 end!를 입력해주세요.");
        while(true) {
            try {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();
                if("end!".equals(name)) {
                    System.out.println("프로그램이 종료됩니다.");
                    break;
                }

                System.out.print("나이를 입력하세요: ");
                int age = Integer.parseInt(scanner.nextLine());
                if (!(0 < age && age < 150)) {
                    throw new NumberFormatException();
                }
                System.out.println("이름: " + name + ", 나이: " + age + "세");
                break;
            } catch (Exception e) {
                System.out.println("입력값이 잘못되었습니다.");
                continue;
            }
        }
        scanner.close();
    }
}

