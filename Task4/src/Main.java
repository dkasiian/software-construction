public class Main {
    public static void main (String args[]) {

        Hospital hospital = new Hospital("OxfordMed");

        hospital.addDoctor(new Doctor("Oleksiy", 44, "Male", "Surgeon"));
        hospital.addDoctor(new Doctor("Bogdan", 57, "Male","Opthalmologist"));
        hospital.addDoctor(new Doctor("Maksim", 38, "Male","ENT"));

        hospital.showDoctors();

        hospital.addPatient(new Patient("Roman", 47, "Male", "eye"));
        hospital.addPatient(new Patient("Michael", 12, "Male", "heart patient"));
        hospital.addPatient(new Patient("Ivan", 23, "Male", "earnose"));
        hospital.addPatient(new Patient("Anna", 31, "Female", "earnose"));
        hospital.addPatient(new Patient("Julia", 18, "Female", "eye"));
        hospital.addPatient(new Patient("Pavel", 67, "Male", "heart patient"));

        hospital.showPatients();

        hospital.assignDoctor();

        for(Doctor doctor : hospital.getDoctorList()){
            System.out.println("Doctor " + doctor.getName() + " treats such patients:\n" + doctor.getDoctorPatientList());
        }

        hospital.assignTreatment();

        for(Patient patient: hospital.getPatientList()){
            System.out.println("Patient " + patient.getName() + " has a such treat:\n" + patient.getTreatment());
        }

    }
}
