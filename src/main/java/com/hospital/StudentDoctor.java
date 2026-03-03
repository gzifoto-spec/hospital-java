package com.hospital;

public class StudentDoctor extends Doctor{

    private String currentCourse;

    public StudentDoctor(String name, int age, String idNumber, String employeeCode, String currentCourse) {
        super(name, age, idNumber, employeeCode);
        this.currentCourse = currentCourse;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    @Override
    public void weeklyWorkHours() {
        System.out.println("El/la estudiante " + getName() + " trabaja 20 horas semanales");
    }

    @Override
    public void eat(){
        System.out.println("El/la estudiante " + getName() + " está tomando su almuerzo");
    }

    public void weeklyStudyHours() {
        System.out.println("El/la estudiante " + getName() + " estudia 20 horas semanales");
    }

}
