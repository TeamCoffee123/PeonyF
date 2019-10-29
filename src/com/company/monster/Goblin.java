package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Goblin extends Monster {
    public Goblin() {
        super("고블린",2);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("몸통박치기",2);
        skills.put("머리 내려치기",4);
        skills.put("무기뺐기",6);
        skills.put("단체공격",8);
        setSkills(skills);
    }

    public String toString() //질문하기
    {
        String str = "[레벨 2 : 고블린] 정령....발견....죽인다......";
        //return str;
        return super.toString();
    }
}
