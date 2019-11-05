package com.company;

import com.company.region.MonsterRegionViewer;
import com.company.shop.MarketViewer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // coffeee
        // write my code here
        final Scanner sc = new Scanner(System.in);
        final MarketViewer marketViewer = new MarketViewer(); //상점 이동
        final MonsterRegionViewer regionViewer = new MonsterRegionViewer(); //던전 이동

         final User user = new User();

        final JobViewer jobViewer = new JobViewer();
        jobViewer.showMenu();


        final int element = sc.nextInt();

        final ElementType elementType = ElementType.findByNum(element);
        jobViewer.initializeJob(user, elementType);

        while (true) {

            MenuViewer.showMenu();
            final int choice = MenuViewer.keyboard.nextInt();
            MenuViewer.keyboard.nextLine();

            switch (choice) {
                case 1: //마을 상태
                    break;
                case 2: //얼어붙은 마을의 위치
                    break;
                case 3: //정령의 나무 확인하기
                    break;
                case 4: //사냥
                    regionViewer.RegionIn(user);
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
