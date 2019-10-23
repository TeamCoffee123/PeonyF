package com.company;

import java.util.Random;

public class RegionSpirit {
    /*
    정령지역의 레벨범위의 경우 랜덤함수를 받아 몬스터 랜덤 등장하도록 설정
     */
    Random rd = new Random();
    int maxSpiritMonsterLevel=9; // 랜덤함수를 사용하기 위해 정령계 몬스터 최대레벨 설정
    int randSpiritMonsterLevel;

    Monster monster = new Monster();
    SpiritMonsterLevel1 sLevel1 = new SpiritMonsterLevel1();
    SpiritMonsterLevel2 sLevel2 = new SpiritMonsterLevel2();
    SpiritMonsterLevel3 sLevel3 = new SpiritMonsterLevel3();
    SpiritMonsterLevel4 sLevel4 = new SpiritMonsterLevel4();
    SpiritMonsterLevel5 sLevel5 = new SpiritMonsterLevel5();

    public void SetSpirit()
    {
        //monsterLevel.monsterLevel=rd.nextInt(maxSpiritMonsterLevel); //몬스터랜덤레벨을 몬스터 level로 전달
        randSpiritMonsterLevel=rd.nextInt(maxSpiritMonsterLevel)+1;
        monster.monsterLevel=randSpiritMonsterLevel;

        //System.out.println("출력확인"+randSpiritMonsterLevel);

        if(randSpiritMonsterLevel==1 || randSpiritMonsterLevel ==2)
        {
           // System.out.println("1,2");
            sLevel1.setSpirit1Name(randSpiritMonsterLevel);
            /*
            랜덤으로 레벨을 받아,
            자식클래스인 SpiritMonsterLevel1 으로 이동하여 몬스터 이름과 몬스터 스킬(미구현)을 가져오고 (이름이랑 스킬 세트로 어떻게 가져오죠...)
            하단에 부모클래스인 Monster에서 Power와 HP를 가져와서(61,62줄) 전투(미구현)하려고 하는데 이렇게 해도 되는지 잘 모르겠습니다.

             */
        }

        else if(randSpiritMonsterLevel==3 || randSpiritMonsterLevel ==4)
        {
           // System.out.println("3,4");
            sLevel2.setSpirit2Name(randSpiritMonsterLevel);
        }

        else if(randSpiritMonsterLevel==5 || randSpiritMonsterLevel ==6)
        {
            //System.out.println("5,6");
            sLevel3.setSpirit3Name(randSpiritMonsterLevel);
        }

        else if(randSpiritMonsterLevel==7 || randSpiritMonsterLevel ==8)
        {
            //System.out.println("7,8");
            sLevel4.setSpirit4Name(randSpiritMonsterLevel);
        }

        else if(randSpiritMonsterLevel==9 || randSpiritMonsterLevel ==10)
        {
            //System.out.println("9,10");
            sLevel5.setSpirit5Name(randSpiritMonsterLevel);
        }

        else
        {
            System.out.println("SpiritMonsterLevel Error");
        }


        monster.serMonsterReward(randSpiritMonsterLevel);
        monster.setMonsterHp(randSpiritMonsterLevel);
        this.SpiritFight();

    }//SetSpiritLevel 끝


    public void SpiritFight()
    {

    }

}

