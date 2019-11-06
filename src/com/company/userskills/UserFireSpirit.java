package com.company.userskills;


import javafx.util.Pair;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class UserFireSpirit extends UserSkills {
    public UserFireSpirit() {
        super("fire", 0);


        final ConcurrentMap<Integer, Pair<String, Integer>> userSkills = new ConcurrentHashMap<>();
        userSkills.put(1,new Pair<>("파이어 볼", 2));
        userSkills.put(2,new Pair<>("파이어 애로우", 4));
        userSkills.put(3,new Pair<>("파이어 회오리", 6));
        userSkills.put(4,new Pair<>("파이어 스피릿", 8)); //화염 방사기
        setUserSkills(userSkills);
    }


}
