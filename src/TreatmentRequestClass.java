public class TreatmentRequestClass {
    public int patientId;
    public long arrivalTime;
    int requestTime;
    boolean isPriority;

    public TreatmentRequestClass(int patientId){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
    }
    public String toString() {
        return "Request [Patient ID: " + patientId + ", Arrival Time: " + arrivalTime + "]";
    }
}
