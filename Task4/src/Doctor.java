import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private String  doctorSpeciality;

    List<Patient> doctorPatientList = new ArrayList<>();
    Doctor(String doctorName, int doctorAge, String doctorGender, String doctorSpeciality) {
        super(doctorName, doctorAge, doctorGender);
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void addPatientToDoctor(Patient o) {
        doctorPatientList.add(o);
    }

    public List<Patient> getDoctorPatientList() {
        return doctorPatientList;
    }

    public String toString() {
        return ("DoctorName: " + getName() + ", doctor speciality: " + doctorSpeciality + '.');
    }

}
