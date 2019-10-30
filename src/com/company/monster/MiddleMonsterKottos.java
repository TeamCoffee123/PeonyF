package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterKottos extends Monster {
    public MiddleMonsterKottos()
    {
        super("코토스",18);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",20);
        skills.put("",22);
        skills.put("",24);
        skills.put("",26);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
