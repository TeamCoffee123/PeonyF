package com.company.region;

import com.company.TreeHeight;
import com.company.User;
import com.company.monster.Monster;

import java.util.Scanner;

public class MonsterRegionViewer {
    TreeHeight level = new TreeHeight();

    MonsterRegion spirit = new MonsterRegionSpirit();
    MonsterRegion middle = new MonsterRegionMiddle();
    MonsterRegion heaven = new MonsterRegionHeaven();

    private User user;


    Scanner sc = new Scanner(System.in);

    public void RegionIn(User user){
        this.user =user;

        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println(" 레벨에 따른 던전으로 이동해 드리겠습니다. 현재레벨: "+level.treeHeight+"입니다.");
        System.out.println("1. 정령계 마을 외곽지역 ( 레벨 0 이상 입장가능 ) ");
        System.out.println("2. 중간계 외곽지역 ( 레벨 60 이상 입장가능 ) ");
        System.out.println("3. 천상계 외곽지역 ( 레벨 90 이상 입장가능 ) ");
        System.out.println("4. 나가기");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println();
        System.out.println("원하시는 지역을 선택해주세요 >>>>>>>\t");
       final int dungeonChoice  = sc.nextInt();
        switch(dungeonChoice)
        {

            case 1 :
                final Monster monster = spirit.makeMonster();
                while(true) //싸우는 부분 구현
                {
                    final int a = sc.nextInt();
                   // monster.attacked(user.getSkills().);
                    break;
                }


            case 2 :
                if(level.treeHeight >=60) {
                    middle.makeMonster();
                    //던전입장 가능

                }  else   {
                    System.out.println("중간로 이동하기엔 레벨이 낮습니다.");

                }
                break;
            case 3 :
                if(level.treeHeight >= 90) {
                    heaven.makeMonster();
                    //던전입장 가능
                }else{
                    System.out.println("천상계로 이동하기엔 레벨이 낮습니다.");

                }
                break;
            case 4 :
                break;
        }
    }
}
