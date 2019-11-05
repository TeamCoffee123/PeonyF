package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWaterHeaven extends UserSkills {

    final ConcurrentMap userSkills = new ConcurrentHashMap<>();
    public UserWaterHeaven(String job, int uerLevel) {
        super("water", 90);

        userSkills.put("워터 스매시",22);
        userSkills.put("워터 캐논",24); //물대포
        userSkills.put("토네이도",26);
        userSkills.put("워터 스피릿",28); //물의 정령으로 못움직이게 함
        setUserSkills(userSkills);
    }

}
