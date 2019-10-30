package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterBriareos extends Monster {
    public MiddleMonsterBriareos()
    {
        super("브리아레오스",19);
        final ConcurrentMap<String, Integer> skills = new ConcurrentHashMap<>();
        skills.put("",21);
        skills.put("",23);
        skills.put("",25);
        skills.put("",27);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
