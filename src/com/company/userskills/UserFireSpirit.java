package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserFireSpirit extends UserSkills {

    public UserFireSpirit() {
        super("fire", 0);
        final ConcurrentMap<String, Integer> userSkills = new ConcurrentHashMap<>();

        userSkills.put("파이어 볼", 2);
        userSkills.put("파이어 애로우", 4);
        userSkills.put("파이어 회오리", 6);
        userSkills.put("파이어 스피릿", 8); //화염 방사기
        setUserSkills(userSkills);
    }


}
