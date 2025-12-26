public class DischargeRecord {
    int patientId;
    long dischargeTime;
    public DischargeRecord(int patientId){
        this.patientId=patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
    public String toString() {
        return "Discharge Record [ID: " + patientId + "]";
    }
}
