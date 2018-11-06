public class Patient extends Person {
    private String disease;
    private String treatment;

    Patient (String patientName, int patientAge, String patientGender, String disease) {
        super(patientName, patientAge, patientGender);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String toString() {
        return ("Patient name: " + getName() + ", patient age: " + getAge() + ", patient gender: "
                + getGender() + ", patient disease: " + disease + '.');
    }
}
