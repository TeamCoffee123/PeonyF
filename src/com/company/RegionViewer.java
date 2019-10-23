package com.company;

import java.util.Scanner;

public class RegionViewer {
    TreeHeight level = new TreeHeight();
    Scanner sc = new Scanner(System.in);

    public void RegionIn(){

        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println(" 레벨에 따른 던전으로 이동해 드리겠습니다. 현재레벨: "+level.treeHeight+"입니다.");
        System.out.println("1. 정령계 마을 외곽지역 ( 레벨 0 이상 입장가능 ) ");
        System.out.println("2. 중간계 외곽지역 ( 레벨 60 이상 입장가능 ) ");
        System.out.println("3. 천상계 외곽지역 ( 레벨 90 이상 입장가능 ) ");
        System.out.println("4. 나가기");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println();
        System.out.println("원하시는 지역을 선택해주세요 >>>>>>>\t");
        int dungeonChoice  = sc.nextInt();
        switch(dungeonChoice)
        {

            case 1 :

                break;
            case 2 :
                if(level.treeHeight >=60)
                {
                    //던전입장 가능
                }
                else
                {
                    System.out.println("중간로 이동하기엔 레벨이 낮습니다.");
                }
                break;
            case 3 :
                if(level.treeHeight >= 90)
                {
                    //던전입장 가능
                }
                else
                {
                    System.out.println("천상계로 이동하기엔 레벨이 낮습니다.");
                }
                break;
            case 4 :
                break;
        }
    }
}
