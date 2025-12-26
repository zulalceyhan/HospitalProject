public class TestTreatmentQueue {
    public static void main(String [] args){
        TreatmentQueue tq = new TreatmentQueue(8);

        System.out.println("--- First Treatment Queue List ---");
        //  Added 8 treatment requests
        tq.enQueue(new TreatmentRequestClass(101));
        tq.enQueue(new TreatmentRequestClass(102));
        tq.enQueue(new TreatmentRequestClass(103));
        tq.enQueue(new TreatmentRequestClass(104));
        tq.enQueue(new TreatmentRequestClass(105));
        tq.enQueue(new TreatmentRequestClass(106));
        tq.enQueue(new TreatmentRequestClass(107));
        tq.enQueue(new TreatmentRequestClass(108));

        // print the Treatment request List
        tq.printQueue();
        System.out.println("\"After process 3 patients dequeued:\"");

        // remove the patients on the list
        tq.deQueue();
        tq.deQueue();
        tq.deQueue();

        // print the Treatment request list
        System.out.println("----Last Treatment Request List----");
        tq.printQueue();
    }

}
