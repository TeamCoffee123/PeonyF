package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterArges extends Monster {
    public MiddleMonsterArges()
    {
        super("아르게스",17); //외눈박이 벼락의 신(티탄)
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",19);
        skills.put("",21);
        skills.put("",23);
        skills.put("",25);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
