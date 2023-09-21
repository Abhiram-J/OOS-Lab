import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person {
    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }
}

class Patient extends Person {
    String entryCode;
    Integer age;

    public Patient(String personName, String patientID) {
        super(personName);
        this.entryCode= patientID.split("-")[0];
        this.age = Integer.parseInt(patientID.split("-")[1]); 
    }

}

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of patients: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        ArrayList<Patient> patients = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of patient " + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Patient ID: ");
            String patientID = sc.nextLine();

            Patient patient = new Patient(name, patientID);
            patients.add(patient);
        }

        Collections.sort(patients, (Patient p1, Patient p2) -> {
                return p2.age.compareTo(p1.age);
            });

        System.out.println("\nList of Patients to be tested are:");
        for (Patient patient : patients) {
            System.out.println(patient.entryCode + "-" + patient.age + " " + patient.getPersonName());
        }

        sc.close();
    }
}
