public class PatientListClass {
    Node head = null;
    Node tail = null;

    public PatientListClass(){
        head = null;
        tail = null;
    }
    private class Node {
        Patient data ;
        Node next;
        public Node (Patient data){
            this.data = data;
            this.next = null;
        }
    }

    public void addPatient(Patient p){
        Node newNode = new Node(p);
        if (head == null) {// list is empty
            System.out.println("The first patient added the list.");
            head = newNode;
            tail = newNode;

        }else{
            tail.next = newNode;
            newNode= tail;
            System.out.println("New patient add the end of the list.");
        }
    }
    public void removePatient(int id){
        if(head == null ) {
            System.out.println("List is empty.we can not remove patient.");
        }else{
            if (head.next == null && id == head.data.id)  {
                head = null;
                tail = null;
                System.out.println(" first and only patient removed from the list. ");
            }else if( head.next != null && id == head.data.id) {
                head = head.next;
                System.out.println(id + " patient removed from the list.");
            }else{
                 Node temp = head ;
                 while ((temp.next != null) && (id != temp.next.data.id)) {
                     temp = temp.next;
                 }
                 if (temp.next != null){
                     temp.next = temp.next.next;
                 }
                 System.out.println("patient removed from the list:" + id);
            }
        }
    }
    public int findPatient(int id ) {
        Node current = head;
        while (current != null){
            if (id == current.data.id){
                System.out.println("Founded patient : " + id );
            }else{
                System.out.println("The patient searched is not present here.");
            }
        }
        current =current.next;
        return id;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println("Patient List ");
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
