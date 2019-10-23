package com.company;

public class Monster {
    //hp, level, reward
    String monsterName; //몬스터 이름
    int monsterLevel=1; //몬스터 레벨
    int monsterHp; //몬스터 hp
    int monsterpower; //몬스터 공격수치
    int stoneOfSpirit; // 정령의 돌.. 리워드인데 user클래스에 적어야 하는지 고민
    int random; //랜덤 몬스터 출력

    //
    // hp,힘,리워드
    //monsterlevel과 fight를 어디로 받아서 해야할지 고민

    public void Monster(String name, int level, int hp, int power, int stone)
    {
        //메소드를 클래스/필드안에서 호출할 경우 메소드의 이름 앞에 this를 붙여서 호출 가능
        monsterName = name;
        monsterLevel=level;
        monsterHp=hp;
        monsterpower=power;
        //this.power=power;
        stoneOfSpirit=stone;
    }

    public int setMonsterHp(int level) //레벨에 따른 hp
    {
        monsterHp=level*50;
        return monsterHp;
    }

    public int serMonsterReward(int level)
    {
        stoneOfSpirit=level;
        return stoneOfSpirit;
    }


}
