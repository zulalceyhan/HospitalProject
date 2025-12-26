public class TestClassLinkedList {
    public static void main (String [] args ){
        //Create a linked list
        PatientListClass List= new PatientListClass();
        Patient p1= new Patient("Zülal Ceyhan ",96,1,46);
        Patient p2= new Patient("Arzu Akgün",78,6,77);
        Patient p3= new Patient("İrem Karademir",42,2,29);
        Patient p4= new Patient("Mirac Kaya",87,9,31);
        Patient p5= new Patient("Batuhan Pek",21,4,7);

        // Add the patient in the list
        List.addPatient(p1);
        List.addPatient(p2);
        List.addPatient(p3);
        List.addPatient(p4);
        List.addPatient(p5);

        // Remove the patient in the list
        List.removePatient(78);

        // Finding the patient in the list
        List.findPatient(21);

        //Print the all patients in the list
        List.printList();

    }
}
