package com.hospital;

public class StudentDoctor extends Doctor{

    private int studyHours;
    private String currentCourse;

    public StudentDoctor(String name, int age, String idNumber, String employeeCode, int weeklyHours, String currentCourse, int studyHours) {
        super(name, age, idNumber, employeeCode, weeklyHours);
        this.currentCourse = currentCourse;
        this.studyHours = studyHours;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public int getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(int studyHours) {
        this.studyHours = studyHours;
    }

    @Override
    public String toString() {
        return super.toString() + " | Código: " + getEmployeeCode() + " | Cursando: " + getCurrentCourse();
    }

    @Override
    public void weeklyWorkHours() {
        System.out.println("El/la estudiante " + getName() + " trabaja " + getWeeklyHours() + " horas semanales");
    }

    @Override
    public void eat(){
        System.out.println("El/la estudiante " + getName() + " está tomando su almuerzo");
    }

    public void weeklyStudyHours() {
        System.out.println("El/la estudiante " + getName() + " estudia " +getStudyHours()+ " horas semanales");
    }

}
