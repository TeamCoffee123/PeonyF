package com.company.monster;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Bro extends Monster {
    public Bro()
    {
        super("브로",4);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("뿔로 치기",2);
        skills.put("",4);
        skills.put("박치기",6);
        skills.put("최면",8);
        setSkills(skills);


    }

    @Override
    public String toString() {
        String str ="[레벨 4 : 브로]양의 머리를 한 악마가 말없이 나에게 다가온다.. 최면에 걸릴 것 같다.";
        return super.toString();
    }
}
