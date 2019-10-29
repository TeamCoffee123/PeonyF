package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Behemoth extends Monster{
    public Behemoth()
    {
        super("베히모스",5);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",2);
        skills.put("",4);
        skills.put("",6);
        skills.put("",8);
        setSkills(skills);

    }

    @Override
    public String toString() {
        String str="[레벨 5 : 베히모스] 타락한 상위 정령 베히모스가 등장했다. 쿵쿵쿵 그가 걷는 자리에 땅이 갈라지기 시작한다..";
        return super.toString();
    }
}
