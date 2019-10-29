package com.company.treedisaster;

import com.company.treedisaster.*;

import java.util.Random;

public class TreeDisasterViewer {

    int disasterNum; //재해 숫자
    int maxSpiritTreeDisaster=8; // 나무의 키가 60미만일때 정령계 재해만 발생, 최대 8개
   // int randSpiritTreeDisaster; //정령계재해 랜덤
    boolean checkSpiritTree = false; //정령계 확인값

    int maxMiddleTreeDisaster=12;//나무의 키가 60이상~90미만일때 정령계+중간계 재해만 발생, 최대 12개
    //int randMiddleTreeDisaster; //정령계재해+중간계재해 랜덤
    boolean checkMiddleTree = false; //중간계 확인값

    int maxHeavenTreeDisaster=16;//나무의 키가 90이상일때 정령계+중간계+천상계 재해 발생, 최대 16개
    //int randHeavenTreeDisaster; //정령계재해+중간계+천상계 재해 랜덤
    boolean checkHeavenTree = false; //천상계 확인값


    Random rd = new Random();

    //이게 아닌것 같은데..
    TreeSpiritDisaster1 spiritD1 = new TreeSpiritDisaster1();
    TreeSpiritDisaster2 spiritD2 = new TreeSpiritDisaster2();
    TreeSpiritDisaster3 spiritD3 = new TreeSpiritDisaster3();
    TreeSpiritDisaster4 spiritD4 = new TreeSpiritDisaster4();
    TreeSpiritDisaster5 spiritD5 = new TreeSpiritDisaster5();
    TreeSpiritDisaster6 spiritD6 = new TreeSpiritDisaster6();
    TreeSpiritDisaster7 spiritD7 = new TreeSpiritDisaster7();
    TreeSpiritDisaster8 spiritD8 = new TreeSpiritDisaster8();

    TreeMiddleDisaster1 middleD1 = new TreeMiddleDisaster1();
    TreeMiddleDisaster2 middleD2 = new TreeMiddleDisaster2();
    TreeMiddleDisaster3 middleD3 = new TreeMiddleDisaster3();
    TreeMiddleDisaster4 middleD4 = new TreeMiddleDisaster4();

    TreeHeavenDisaster1 heavenD1 = new TreeHeavenDisaster1();
    TreeHeavenDisaster2 heavenD2 = new TreeHeavenDisaster2();
    TreeHeavenDisaster3 heavenD3 = new TreeHeavenDisaster3();
    TreeHeavenDisaster4 heavenD4 = new TreeHeavenDisaster4();


    //randSpiritTreeDisaster=rd.nextInt(maxSpiritTreeDisaster)+1;

    public void separateTreeRegion()
    {
        if(checkSpiritTree=true)
        {
            disasterNum=rd.nextInt(maxSpiritTreeDisaster)+1; //정령계 8개 재해 랜덤 발생
            getTreeDisasterNum(disasterNum);
        }

        else if(checkMiddleTree=true)
        {
            disasterNum=rd.nextInt(maxMiddleTreeDisaster)+1; //중간계 12개 재해(정령계+중간계) 랜덤 발생
            getTreeDisasterNum(disasterNum);
        }

        else if(checkHeavenTree=true)
        {
            disasterNum=rd.nextInt(maxHeavenTreeDisaster)+1; //천상계 16개 재해(정령계+중간계+천상계) 랜덤 발생
            getTreeDisasterNum(disasterNum);
        }
    }

    /*
    아이템 획득시 발생하는것 조건문 넣기
    TreeSpiritDisaster2,TreeSpiritDisaster5,
    TreeMiddleDisaster1,TreeMiddleDisaster4,
    TreeHeavenDisaster4
     */


    public void getTreeDisasterNum(int num)
    {
        this.disasterNum=num;

        if(num==1)
        {
            spiritD1.PrintSymptom();
        }

        else if(num==2)
        {
            spiritD2.PrintSymptom();
        }

        else if(num==3)
        {
            spiritD3.PrintSymptom();
        }

        else if(num==4)
        {
            spiritD4.PrintSymptom();
        }

        else if(num==5)
        {
            spiritD5.PrintSymptom();
        }

        else if(num==6)
        {
            spiritD6.PrintSymptom();
        }

        else if(num==7)
        {
            spiritD7.PrintSymptom();
        }

        else if(num==8)
        {
            spiritD8.PrintSymptom();
        }

        else if(num==9)
        {
            middleD1.PrintSymptom();
        }

        //이렇게 하는게 맞는가...

    }

}
