package com.workintech.developers;

public class MidDeveloper extends HRManager{
    private double salary = 30000;
    public MidDeveloper(long id, String name, double salary){
        super(id, name, salary);

    }
    @Override
    public void work() {
        System.out.println(getMidDeveloper());
        setSalary(salary);
    }
}
