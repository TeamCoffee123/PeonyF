package com.company.userskills;

import java.util.concurrent.ConcurrentMap;

public class UserSkills {
    private final String job;
    private int uerLevel;

    public UserSkills(String job,int uerLevel)
    {
        this.job = job;
        this.uerLevel = uerLevel;
    }


    public String getJob() {
        return job;
    }

    public int getUerLevel() {
        return uerLevel;
    }


    private ConcurrentMap<String,Integer> userSkills;
    public void setUserSkills(ConcurrentMap<String,Integer> userSkills)
    {
        this.userSkills= userSkills;
    }
    public ConcurrentMap<String, Integer> getUserSkills() {  return userSkills;  }
}
