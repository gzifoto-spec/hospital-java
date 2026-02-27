package com.hospital;

public abstract class Doctor extends Character implements Workable {

    private String employeeCode;

    public Doctor(String name, int age, String idNumber, String employeeCode) {
        super(name, age, idNumber);
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
}
