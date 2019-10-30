package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterTheia extends Monster {
    public MiddleMonsterTheia()
    {
        super("테이아",14);
        final ConcurrentMap<String ,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",16);
        skills.put("",18);
        skills.put("",20);
        skills.put("",22);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
