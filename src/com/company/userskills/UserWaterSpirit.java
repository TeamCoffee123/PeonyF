package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWaterSpirit extends UserSkills {
    final ConcurrentMap<String, Integer> userSkills = new ConcurrentHashMap<>();

    public UserWaterSpirit() {
        super("water", 0);

        userSkills.put("워터 스매시", 2);
        userSkills.put("워터 캐논", 4); //물대포
        userSkills.put("토네이도", 6);
        userSkills.put("워터 스피릿", 8); //물의 정령으로 못움직이게 함
        setUserSkills(userSkills);
    }


}
