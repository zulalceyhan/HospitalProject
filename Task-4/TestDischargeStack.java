public class TestDischargeStack {
    public static void main(String[] args){
        DischargeStack ds =new DischargeStack(5);

        // Add the 5 patient on the system
        ds.push(new DischargeRecord(50));
        ds.push(new DischargeRecord(60));
        ds.push(new DischargeRecord(70));
        ds.push(new DischargeRecord(80));
        ds.push(new DischargeRecord(90));

        // remove the 2 patient on the system
        ds.pop();
        ds.pop();

        // print the last situation system.
        ds.printStack();

        System.out.println("The last stack list. " + ds.counter);
    }
}
