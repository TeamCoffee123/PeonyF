package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Kronos extends Monster {
    public Kronos()
    {
        super("크로노스",2); //땅의 신(티탄)
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",2);
        skills.put("",4);
        skills.put("",6);
        skills.put("",8);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="";
        return super.toString();
    }
}
