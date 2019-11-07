package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterTethys extends Monster {
    public MiddleMonsterTethys()
    {
        super("테티스",13);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",15);
        skills.put("",17);
        skills.put("",19);
        skills.put("",21);
        setSkills(skills);

    }

    @Override
    public String scriptMonster() {
        String script=" ";
        return super.scriptMonster();
    }
}
