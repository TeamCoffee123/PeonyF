package com.company.userskills;

import javafx.util.Pair;

import java.util.concurrent.ConcurrentMap;

public class UserSkills {

    public UserSkills(String job, int uerLevel) {
    }


    private ConcurrentMap<String, Integer> userSkills;

    public void setUserSkills(ConcurrentMap<Integer, Pair<String, Integer>> userSkills) {
        this.userSkills = userSkills;
    }

    public ConcurrentMap<String, Integer> getUserSkills() {
        return userSkills;
    }
}
