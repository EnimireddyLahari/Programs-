//constructor chaining

package com.constructor;

public class Patient {

    int patientId;
    String PatientName;
    String disease;
    int amount;

    // First constructor
    public Patient(int patientId) {

        this.patientId = patientId;

        System.out.println("Patient is first visit the hospital");
    }

    // Second constructor
    public Patient(int patientId, String PatientName) {

        this(patientId);

        this.PatientName = PatientName;
    }

    // Third constructor
    public Patient(int patientId, String PatientName, String disease) {

        this(patientId, PatientName);

        this.disease = disease;
    }

    // Fourth constructor
    public Patient(int patientId, String PatientName,
            String disease, int amount) {

        this(patientId, PatientName, disease);

        this.amount = amount;
    }

    // Display method
    public void display() {

        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + PatientName);
        System.out.println("Disease: " + disease);
        System.out.println("Bill Amount: " + amount);
    }

    public static void main(String[] args) {

        Patient pt = new Patient(101, "Ram", "Cold", 10000);

        pt.display();
    }
}
