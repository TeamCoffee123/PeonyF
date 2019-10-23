package com.company;

public class SpiritMonsterLevel3  extends Monster{

    public String setSpirit3Name(int level) //레벨에 따른 이름과 내용 출력
    {
        if(level  ==5)
        {
            monsterName="베히모스";
            System.out.println("[레벨 5 : 베히모스] 타락한 상위 정령 베히모스가 등장했다. 쿵쿵쿵 그가 걷는 자리에 땅이 갈라지기 시작한다..");
            System.out.println();
        }

        else if(level  ==6)
        {
            monsterName="아칸";
            System.out.println("[레벨 6 : 아칸] 모든 마을을 얼음의 마을로 바꾸겠어! 얼음의 정령들! 어서 다 얼려버리자고!");
            System.out.println();
        }
        return monsterName;
    } //setSpirit3Name 끝
}
