package com.hospital;

public abstract class Patient extends Character implements Hospitalizable {

    private String diagnosis;

    public  Patient(String name, int age, String  idNumber, String diagnosis){
        super(name, age, idNumber);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
