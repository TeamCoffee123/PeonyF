package com.company;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserEarthSkill extends User {
    int accessLevel;
    public UserEarthSkill()
    {
        final ConcurrentMap<String,Integer> userSkills = new ConcurrentHashMap<>();

        userSkills.put("스톤 던지기",2);
        userSkills.put("스톤 애로우",4);
        userSkills.put("스톤 샤워",6);
        userSkills.put("스톤 스피릿",8); // 몬스터를 가만히 멈춰있게 함
        setUserSkills(userSkills);
    }
}
