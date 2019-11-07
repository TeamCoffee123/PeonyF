package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterKronos extends Monster {
    public MiddleMonsterKronos()
    {
        super("크로노스",12); //땅의 신(티탄)
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",14);
        skills.put("",16);
        skills.put("",18);
        skills.put("",20);
        setSkills(skills);
    }

    @Override
    public String scriptMonster() {
        String script="";
        return super.scriptMonster();
    }
}
