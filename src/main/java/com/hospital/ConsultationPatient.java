package com.hospital;

public class ConsultationPatient extends  Patient{

    public ConsultationPatient(String name, int age, String idNumber, String diagnosis) {
        super(name, age, idNumber, diagnosis);
    }

    @Override
    public void admission() {
        System.out.println(getName() + " ha sido admitido/a vía consulta");
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

    public void  nurseControl() {
        System.out.println(getName() + "está bajo control de enfermería");

    }

    public void nextAppointment() {
        System.out.println("La siguiente cita de" + getName() + "ha sido marcada en el calendario");
    }
}
