# Hospital Java

A Java OOP exercise simulating a hospital management system.

## Class Structure
```
Character (abstract)
├── Patient (abstract) → implements Hospitalizable
│   ├── AmbulancePatient
│   └── ConsultationPatient
└── Doctor (abstract) → implements Workable
    ├── SpecialistDoctor
    └── StudentDoctor
```
<img width="400" alt="hospitalOPP" src="https://github.com/user-attachments/assets/943baa8d-8054-4109-862e-ec4d508812d0" />



## Interfaces

- **Hospitalizable** — admission, assignRoom, treatment, discharge
- **Workable** — weeklyWorkHours, eat

## Technologies

- Java 21
- IntelliJ IDEA
- Maven

## How to run

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run `Main.java`
