public class TestHospitalSystem {
    public static void main(String[] args) {
        HospitalSystem hs = new HospitalSystem(10, 10);
        // Add patient
        hs.addPatient(new Patient("Ahmet", 4, 4, 39));
        hs.addPatient(new Patient("Aslı", 9, 2, 38)); // Yüksek severity
        hs.addPatient(new Patient("Dila", 8, 9, 23));
        hs.addPatient(new Patient("Sena", 11, 10, 60)); // Yüksek severity
        hs.addPatient(new Patient("Mehmet", 36, 8, 27));
        hs.addPatient(new Patient("Zeynep", 68, 1, 51));
        hs.addPatient(new Patient("Can", 77, 5, 32));
        hs.addPatient(new Patient("Ece Nur", 18, 3, 48));
        hs.addPatient(new Patient("Murat", 97, 6, 11));
        hs.addPatient(new Patient("Dilara", 10, 7, 29));


        hs.sortPatientsBySeverity();


        System.out.println("\n---  Adding Treatment Request ---");
        // Add the normal patient and priority patient
        hs.addTreatmentRequest(77, false);
        hs.addTreatmentRequest(45, true);   //priority
        hs.addTreatmentRequest(41, false);
        hs.addTreatmentRequest(23, true);  // priority
        hs.addTreatmentRequest(59, false);
        hs.addTreatmentRequest(62, true);  // priority
        hs.addTreatmentRequest(78, false);
        hs.addTreatmentRequest(89, false);


        // Patients with priority should go first
        System.out.println("\n--- Treatments are being processed ---");
        for (int i = 0; i < 4; i++) {
            System.out.print("Process " + i + ": ");
            hs.processTreatment();
        }

        System.out.println("\n---  Last System State ---");
        // last situation
        hs.printSystemState();

    }

}
