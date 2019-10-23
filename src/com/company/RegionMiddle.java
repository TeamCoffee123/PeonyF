package com.company;

import java.util.Random;

public class RegionMiddle {
     /*
    중간지역의 레벨범위의 경우 랜덤함수를 받아 몬스터 랜덤 등장하도록 설정
     */
     Random rd = new Random();
    int maxMiddleMonsterLevel=9; // 중간계최대레벨 10
    int randMiddleMonsterLevel;

    Monster monster = new Monster();
    MiddleMonsterLevel1 mLevel1 = new MiddleMonsterLevel1();
    MiddleMonsterLevel2 mLevel2 = new MiddleMonsterLevel2();
    MiddleMonsterLevel3 mLevel3 = new MiddleMonsterLevel3();
    MiddleMonsterLevel4 mLevel4 = new MiddleMonsterLevel4();
    MiddleMonsterLevel5 mLevel5 = new MiddleMonsterLevel5();

    public void SetMiddle()
    {
        //monsterLevel.monsterLevel=rd.nextInt(maxMiddleMonsterLevel);
        randMiddleMonsterLevel=rd.nextInt(maxMiddleMonsterLevel)+11; //랜덤함수 +10하여 11~20 레벨 몬스터 출력 및 몬스터 level로 전달
        monster.monsterLevel=randMiddleMonsterLevel;

        if(randMiddleMonsterLevel==11 || randMiddleMonsterLevel ==12)
        {
            mLevel1.setMiddle1Name(randMiddleMonsterLevel);
        }

        else if(randMiddleMonsterLevel==13 || randMiddleMonsterLevel ==14)
        {
            mLevel2.setMiddle2Name(randMiddleMonsterLevel);
        }

        else if(randMiddleMonsterLevel==15 || randMiddleMonsterLevel ==16)
        {
            mLevel3.setMiddle3Name(randMiddleMonsterLevel);
        }

        else if(randMiddleMonsterLevel==17 || randMiddleMonsterLevel ==18)
        {
            mLevel4.setMiddle4Name(randMiddleMonsterLevel);
        }

        else if(randMiddleMonsterLevel==19 || randMiddleMonsterLevel ==20)
        {
            mLevel5.setMiddle5Name(randMiddleMonsterLevel);
        }

        else
        {
            System.out.println("MiddleMonsterLevel Error");
        }

        monster.serMonsterReward(randMiddleMonsterLevel);
        monster.setMonsterHp(randMiddleMonsterLevel);
        this.MiddleFight();

    }//SetMiddleLevel 끝


    public void MiddleFight()
    {

    }


}
