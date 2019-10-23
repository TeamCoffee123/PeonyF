package com.company;

public class SpiritMonsterLevel1 extends Monster{
    //이름,skill 출력

    String[] spiritSkill1 ={"몸통박치기","물기","무기뺏기","단체공격"};
    int[] spiritPower1 ={2,4,6,8};//최대 level*10


    /*
    arraylist를 쓰려니 skill명과 power를 같이 표현할 방법이 없어서 pass
    hashmap을 사용하려 했으나 나중에 몬스터와의 싸움을 멀티쓰레드를 사용하고 싶어 pass
    배열을 사용하여 표현하기로 결정 -> 스킬명과 공격력 배열을 두개 합쳐서 사용하고 싶은데 고민하고 있습니다.
*/

/*
    public void spiritMonsterLevel1(String name, int level, int hp, int power, int stone) {
        super.Monster(monsterName,monsterLevel,monsterHp,power,stoneOfSpirit);
    }
*/
    public String setSpirit1Name(int level) //레벨에 따른 이름과 내용 출력
    {
        if(level  ==1)
        {
            monsterName="나가";
            System.out.println("[레벨 1 : 나가] 낄낄낄 너따위가 날 상대하겠다고? 쉭쉭 어디한번 싸워볼까?");
            System.out.println();
        }

        else if(level  ==2)
        {
            monsterName="고블린";
            System.out.println("[레벨 2 : 고블린] 정령....발견....죽인다......");
            System.out.println();
        }
        return monsterName;
    } //setSpirit1Name 끝








/*
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

     */






}
