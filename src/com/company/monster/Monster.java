package com.company.monster;

import java.util.concurrent.ConcurrentMap;

public class Monster {

    private final String monsterName;
    private  final int monsterLevel;
    private  final int iceMonsterLevel ;
    private int monsterHp;
    private ConcurrentMap<String,Integer> skills;


   public Monster(String monsterName,
                  int monsterLevel)
   {
       this.monsterName = monsterName;
       this.monsterLevel = monsterLevel;
       iceMonsterLevel= monsterLevel*2;
       monsterHp = monsterLevel*50;
   }

   public String getMonsterName()
   {
       return monsterName;
   }

   public  int getMonsterLevel()
   {
       return monsterLevel;
   }

    public int getIceMonsterLevel() { return iceMonsterLevel; }

    public int getMonsterHp()
   {
       return monsterHp;
   }

   public  int attacked(int damage)
   {
       monsterHp =- damage;
       return monsterHp;
   }

   public ConcurrentMap<String, Integer> getSkills()
   {
       return skills;
   }

   protected void setSkills(ConcurrentMap<String,Integer> skills)
   {
       this.skills = skills;
   }

   public String toString()
   {
       String str = "몬스터 등장";
       return str;
   }
}
