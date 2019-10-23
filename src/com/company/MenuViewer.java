package com.company;

import java.util.Scanner;

public class MenuViewer {

    public static Scanner keyboard = new Scanner(System.in);
    public static void showMenu()
    {
        System.out.println("원하는 메뉴를 선택하세요..");
        System.out.println("1.마을 상태");
        System.out.println("2.얼어붙은 마을의 위치");
        System.out.println("3.정령의 나무 확인하기 ");
        System.out.println("4.산책");
        System.out.println("5.정령마을 상점가기");
        //일정 레벨 이상이면 인간과의 조우가 나옴
        System.out.println("6.인간과 만남");

    }
}
