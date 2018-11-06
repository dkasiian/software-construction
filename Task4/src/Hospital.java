import java.util.ArrayList;
import java.util.List;

public class Hospital {
    List<Doctor> doctorList = new ArrayList<>();
    List<Patient> patientList = new ArrayList<>();
    String hospitalName;

    Hospital(String name) {
        this.hospitalName = name;
    }

    void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in hospital:");
        for (Doctor doctor : doctorList)
            System.out.println(doctor.toString());
    }

    public void showPatients() {
        System.out.println("Patients in hospital:");
        for (Patient patient : patientList)
            System.out.println(patient.toString());
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void assignDoctor() {
        for (Patient patient : patientList) {
            for (Doctor doctor : doctorList) {
                if (patient.getDisease().equals("eye"))
                    if (doctor.getDoctorSpeciality().equals("Opthalmologist"))
                        doctor.addPatientToDoctor(patient);

                if (patient.getDisease().equals("heart patient"))
                    if (doctor.getDoctorSpeciality().equals("Surgeon"))
                        doctor.addPatientToDoctor(patient);

                if (patient.getDisease().equals("earnose"))
                    if (doctor.getDoctorSpeciality().equals("ENT"))
                        doctor.addPatientToDoctor(patient);
            }
        }
    }

    public void assignTreatment(){
        for (Doctor doctor : doctorList){
            for(Patient patient : doctor.getDoctorPatientList()){
                switch (doctor.getDoctorSpeciality()){
                    case "Surgeon":
                        patient.setTreatment("heart transplantation");
                        break;
                    case "Opthalmologist":
                        patient.setTreatment("laser therapy");
                        break;
                    case "ENT":
                        patient.setTreatment("nose pills");
                }

            }
        }
    }

}
