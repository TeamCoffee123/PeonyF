package com.company;

public class SpiritMonsterLevel5  extends Monster{

    public String setSpirit5Name(int level) //레벨에 따른 이름과 내용 출력
    {
        if(level == 9)
        {
            monsterName="글랜셔";
            System.out.println("[레벨 9 : 글랜셔] 얼음의 상위 정령 글랜셔가 다가오고있습니다.........");
            System.out.println();
        }

        else if(level  ==10)
        {
            monsterName="프린셔";
            System.out.println("[레벨 10 : 프린셔] 내가 바로 얼음의 왕 프린셔, 네가 감히 나와 싸우려고 하다니 겁도 없구나");
            System.out.println();
        }
        return monsterName;
    } //setSpiri51Name 끝
}
