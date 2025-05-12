package com.workintech.developers;

public class SeniorDeveloper extends HRManager{
    private double salary = 50000;
    public SeniorDeveloper(long id, String name, double salary){
        super(id, name, salary);

    }
    @Override
    public void work() {
        System.out.println(getSeniorDeveloper());
        setSalary(salary);
    }
}
