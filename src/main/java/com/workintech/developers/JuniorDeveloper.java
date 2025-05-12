package com.workintech.developers;

public class JuniorDeveloper extends HRManager{
    private double salary = 10000;
    public JuniorDeveloper(long id, String name, double salary){
        super(id, name, salary);

    }

    @Override
    public void work() {
        System.out.println(getJuniorDeveloper());
        setSalary(salary);
    }
}
