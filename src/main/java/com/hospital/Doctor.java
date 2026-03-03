package com.hospital;

public abstract class Doctor extends Character implements Workable {

    private String employeeCode;
    private int weeklyHours;

    public Doctor(String name, int age, String idNumber, String employeeCode, int weeklyHours) {
        super(name, age, idNumber);
        this.employeeCode = employeeCode;
        this.weeklyHours = weeklyHours;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

}
