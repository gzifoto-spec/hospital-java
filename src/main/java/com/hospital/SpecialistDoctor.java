package com.hospital;

public class SpecialistDoctor extends Doctor{

    private String specialty;

    public SpecialistDoctor(String name, int age, String idNumber, String employeeCode, String specialty) {
        super(name, age, idNumber, employeeCode);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public  void weeklyWorkHours() {
        System.out.println("Dr/a " + getName() + " trabaja 40 horas semanales");
    }

    @Override
    public void eat() {
        System.out.println("Dr/a " + getName() + " está tomando su almuerzo");
    }

    public void vacation() {
        System.out.println("Dr/a " + getName() + " está de vacaciones");
    }

}
