package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterBrontes extends Monster {
    //외눈박이 천둥의 신(티탄)
    public MiddleMonsterBrontes()
    {
        super("브론테스",5);
        final ConcurrentMap<String ,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",7);
        skills.put("",9);
        skills.put("",11);
        skills.put("",13);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
