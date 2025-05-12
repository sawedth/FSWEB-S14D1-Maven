package com.workintech.developers;

public class HRManager extends Employee{

    private String JuniorDeveloper = "Junioree";
    private String MidDeveloper = "Middo";
    private String SeniorDeveloper = "Senioree";
    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }

    public String getJuniorDeveloper() {
        return JuniorDeveloper;
    }

    public String getMidDeveloper() {
        return MidDeveloper;
    }

    public String getSeniorDeveloper() {
        return SeniorDeveloper;
    }
}
