package com.company;

public class SpiritMonsterLevel1  extends Monster{
    //skill
    /*
    arraylist를 쓰려니 skill명과 power를 같이 표현할 방법이 없어서 pass
    hashmap을 사용하려 했으나 나중에 몬스터와의 싸움을 멀티쓰레드를 사용하고 싶어 pass
    배열을 사용하여 표현하기로 결정
     */


    public void SpiritMonsterLevel1(String name, int level, int hp, int power, int stone) {
        super.Monster(monsterName,monsterLevel,monsterHp,power,stoneOfSpirit);
    }

    public void SpiritM1Call()
    {
        String spiritMonsterLevel1Name[] = {"나가","고블린"};
        int spiritMonsterLevel1Stat[][] =
                {
                {1, 1, 50, 10, 1},//나가
                {2, 2, 60, 10, 1},//고블린
                };
        for(int i = 0;i<spiritMonsterLevel1Name.length;i++)
            if(random==i)
            {
                SpiritMonsterLevel1(spiritMonsterLevel1Name[i-1],spiritMonsterLevel1Stat[i-1][0],spiritMonsterLevel1Stat[i-1][1],spiritMonsterLevel1Stat[i-1][2],spiritMonsterLevel1Stat[i-1][3]);
            }
    }
}
