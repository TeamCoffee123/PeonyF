package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Brontes extends Monster {
    //외눈박이 천둥의 신(티탄)
    public Brontes()
    {
        super("브론테스",5);
        final ConcurrentMap<String ,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",2);
        skills.put("",4);
        skills.put("",6);
        skills.put("",8);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
