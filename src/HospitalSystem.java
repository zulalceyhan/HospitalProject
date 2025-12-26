import java.util.HashMap;
public class HospitalSystem {
        private PatientListClass admittedPatients;
        private TreatmentQueue normalQueue;
        private TreatmentQueue priorityQueue;
        private DischargeStack dischargeStack;
        private HashMap<Integer, Patient> patientLookup;

        public HospitalSystem(int queueCapacity, int stackSize) {
            this.admittedPatients = new PatientListClass();
            this.normalQueue = new TreatmentQueue(queueCapacity);
            this.priorityQueue = new TreatmentQueue(queueCapacity);
            this.dischargeStack = new DischargeStack(stackSize);
            this.patientLookup = new HashMap<>();
        }

        // 1. Add the new patient on the system
        public void addPatient(Patient p) {
            admittedPatients.addPatient(p);
            patientLookup.put(p.id, p); // Add the hash map for faster processing
            System.out.println("Added the patient on the system: " + p.name);
        }

        // Add the treatment patient on the list
        public void addTreatmentRequest(int id, boolean isPriority) {
            TreatmentRequestClass request = new TreatmentRequestClass(id);
            request.isPriority = isPriority;

            if (isPriority) {
                priorityQueue.enQueue(request); // Emergency patient
            } else {
                normalQueue.enQueue(request); // Normal patient
            }
        }

        // We are performing the treatment from the queue to the stage processing
        public void processTreatment() {
            TreatmentRequestClass request = null;

            // Firstly we check the priority queue
            if (!priorityQueue.isEmpty()) {
                request = priorityQueue.deQueue(); // we can not return null anymore
            } else if (!normalQueue.isEmpty()) {
                request = normalQueue.deQueue();
            }

            if (request != null) {
                // From the patient receiving treatment to the discharge department
                dischargeStack.push(new DischargeRecord(request.patientId));

                // We used `hasmap` to print the name to the screen
                Patient p = patientLookup.get(request.patientId);
                System.out.println("Processing and discharging: " + (p != null ? p.name : "ID " + request.patientId));
            } else {
                System.out.println("No patients waiting in any queue.");
            }
        }

        //  sorting patients according to priority (Bubble Sort)
        public void sortPatientsBySeverity() {
            // Printing when the list is empty or contains only one item
            if (admittedPatients.head == null || admittedPatients.head.next == null) return;

            boolean swapped;
            do {
                swapped = false;
                //It will start from the beginning of the list and the patient list class header
                PatientListClass.Node current = admittedPatients.head;

                while (current.next != null) {
                    // By comparing the levels of intensity, we ensured that the one with the greater intensity came first.
                    if (current.data.severity < current.next.data.severity) {
                        // we are swapped data
                        Patient temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;

                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }

        //Print the last situation on the system
        public void printSystemState() {
            System.out.println("\n--- At the moment hospital situation ---");
            admittedPatients.printList();
            System.out.println("Emergency patients waiting: " + priorityQueue.size());
            System.out.println("Normal patients waiting " + normalQueue.size());
            dischargeStack.printStack();
            System.out.println("-----------------------------\n");
        }
    }

