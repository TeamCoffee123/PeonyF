package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterGoblin extends Monster {
    public SpiritMonsterGoblin() {
        super("고블린",2);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("몸통박치기",4);
        skills.put("머리 내려치기",6);
        skills.put("무기뺐기",8);
        skills.put("단체공격",10);
        setSkills(skills);
    }

    public String scriptMonster() //질문하기
    {
        return "[레벨 2 : 고블린] 정령....발견....죽인다......";
    }
}
