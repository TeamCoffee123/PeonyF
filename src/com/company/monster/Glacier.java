package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Glacier extends Monster {
    public Glacier()
    {
        super("글랜셔",9);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",2);
        skills.put(" ",4);
        skills.put(" ",6);
        skills.put(" ",8);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="[레벨 9 : 글랜셔] 얼음의 상위 정령 글랜셔가 다가오고있습니다.........";
        return super.toString();
    }
}
