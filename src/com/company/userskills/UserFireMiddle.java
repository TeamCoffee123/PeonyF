package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserFireMiddle extends UserSkills {
    final ConcurrentMap userSkills = new ConcurrentHashMap<>();

    public UserFireMiddle(String job, int uerLevel) {
        super("fire", 60);
        userSkills.put("파이어 볼",12);
        userSkills.put("파이어 애로우",14);
        userSkills.put("파이어 회오리",16);
        userSkills.put("파이어 스피릿",18); //화염 방사기
        setUserSkills(userSkills);
    }
}
