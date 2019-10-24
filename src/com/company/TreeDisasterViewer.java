package com.company;

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




    public void getTreeDisasterNum(int num)
    {
        this.disasterNum=num;

        if(num==1)
        {

        }

    }

}
