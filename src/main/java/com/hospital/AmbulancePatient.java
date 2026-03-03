package com.hospital;

public class AmbulancePatient extends Patient{

    public AmbulancePatient(String name, int age, String idNumber, String diagnosis) {
        super(name, age, idNumber, diagnosis);
    }

    @Override
    public void admission() {
        System.out.println(getName() + " ha sido admitido/a vía ambulancia");
    }

    @Override
    public void assignRoom() {
        System.out.println("A "+ getName() + " se le ha asignado una habitación");
    }

    @Override
    public  void treatment() {
        System.out.println(getName() + " está recibiendo tratamiento por " + getDiagnosis());
    }

    @Override
    public void discharge() {
        System.out.println(getName() + " ha sido dado/a de alta");
    }

    public void rehabilitation() {
        System.out.println(getName() + " está en rehabilitación") ;
    }

    public void  operation() {
        System.out.println(getName() + " está en la sala de operaciones");
    }

}
