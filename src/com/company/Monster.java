package com.company;

public class Monster {
    //hp, level, reward
    String monsterName; //몬스터 이름
    int monsterLevel; //몬스터 레벨
    int monsterHp; //몬스터 hp
    int power; //몬스터 공격수치
    int stoneOfSpirit; // 정령의 돌.. 리워드인데 user클래스에 적어야 하는지 고민
    int random; //랜덤 몬스터 출력

    //몬스터번호,렙, hp,공격력, 방어력, 경험치, 돈
    public void Monster(String name, int level, int hp, int power, int stone)
    {
        //메소드를 클래스/필드안에서 호출할 경우 메소드의 이름 앞에 this를 붙여서 호출 가능
        monsterName = name;
        monsterLevel=level;
        monsterHp=hp;
        this.power=power;
        stoneOfSpirit=stone;
    }


}
