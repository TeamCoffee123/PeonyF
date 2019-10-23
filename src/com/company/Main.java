package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        MarketViewer marketViewer = new MarketViewer();

        while (true) {

            MenuViewer.showMenu();
            int choice = MenuViewer.keyboard.nextInt();
            MenuViewer.keyboard.nextLine();

            switch (choice) {
                case 1: //마을 상태
                    break;
                case 2: //얼어붙은 마을의 위치
                    break;
                case 3: //정령의 나무 확인하기
                    break;
                case 4: //사냥
                    break;
                case 5: //정령마을 상점가기
                    marketViewer.In();
                    break;
                case 6: //인간과 만남
                    break;
            }


        } //while문 끝
    }
}//main 클래스 끝
