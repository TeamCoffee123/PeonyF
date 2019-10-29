package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Kottos extends Monster {
    public Kottos()
    {
        super("코토스",8);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
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
