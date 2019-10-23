package com.company;

public class SpiritMonsterLevel2  extends Monster{

    public String setSpirit2Name(int level) //레벨에 따른 이름과 내용 출력
    {
        if(level  ==3)
        {
            monsterName="다크정령";
            System.out.println("[레벨 3 : 다크 정령]나도 한때 너와 같은 정령이였어.. 나도.. 정령이었다고!!");
            System.out.println();
        }

        else if(level  ==4)
        {
            monsterName="브로";
            System.out.println("[레벨 4 : 브로]양의 머리를 한 악마가 말없이 나에게 다가온다.. 최면에 걸릴 것 같다.");
            System.out.println();
        }
        return monsterName;
    } //setSpirit2Name 끝
}
