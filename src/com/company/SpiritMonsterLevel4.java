package com.company;

public class SpiritMonsterLevel4  extends Monster{

    public String setSpirit4Name(int level) //레벨에 따른 이름과 내용 출력
    {
        if(level  ==7)
        {
            monsterName="아뭄";
            System.out.println("[레벨 7 : 아뭄] 모든걸 다 없애겠어 깔깔깔 아무것도 존재하지 않도록.. 엇 너는 누구지?");
            System.out.println();
        }

        else if(level  ==8)
        {
            monsterName="플로우";
            System.out.println("[레벨 8 : 플로우] 아뭄이 어디갔지? 아니 여기 살아있는 정령이 아직 있잖아? 내가 없애주지");
            System.out.println();
        }
        return monsterName;
    } //setSpirit4Name 끝
}
