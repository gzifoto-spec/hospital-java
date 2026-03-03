package com.hospital;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AmbulancePatient patient01 = new AmbulancePatient("Xavier Piñeiro", 52, "32987654W", "Shock Anafiláctico");
        AmbulancePatient patient02 = new AmbulancePatient("Sergio Fernandez", 32, "321234567A", "Coma Etílico" );

        List<AmbulancePatient> ambulancePatients = List.of(patient01, patient02);

        for(AmbulancePatient patient : ambulancePatients) {
            patient.admission();
            patient.operation();
            patient.assignRoom();
            patient.treatment();
            patient.rehabilitation();
            patient.discharge();
        }

        ConsultationPatient patient03 = new ConsultationPatient("Ana Morandeira", 47, "34456789F", "Sobredosis de Origen Desconocido");
        ConsultationPatient patient04 = new ConsultationPatient("Heber Paris", 38, "77555888V", "Hidrocución");

        List<ConsultationPatient> consultationPatients = List.of(patient03, patient04);

        for(ConsultationPatient patient : consultationPatients) {
            patient.admission();
            patient.assignRoom();
            patient.treatment();
            patient.discharge();
            patient.nurseControl();
            patient.nextAppointment();
        }

        SpecialistDoctor doctor01 = new SpecialistDoctor("JM", 40, "22543876Q", "masterOfThePHP", "Urólogo", 40);
        SpecialistDoctor doctor02 = new SpecialistDoctor("Ana Aragón", 30, "44123987S", "becauseIamHappy", "Psiquiatra", 40);

        List<SpecialistDoctor> specialistDoctors = List.of(doctor01, doctor02);

        for (SpecialistDoctor doctor : specialistDoctors) {
            doctor.weeklyWorkHours();
            doctor.eat();
            doctor.vacation();
        }

        StudentDoctor student01 = new StudentDoctor("JuanLu", 42, "54678321G","soyDeBackend", 20, "Radiología", 20);
        StudentDoctor student02 = new StudentDoctor("David Navarro", 45, "36789123H", "archiMegaTester", 20, "Otorrinolaringología", 20);

        List<StudentDoctor> studentDoctors = List.of(student01, student02);

        for (StudentDoctor student : studentDoctors) {
            student.weeklyWorkHours();
            student.weeklyStudyHours();
            student.eat();
        }
    }
}
