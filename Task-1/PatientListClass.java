public class PatientListClass{
    Node head = null;
    Node tail = null;

    private class Node {
        Patient data;
        Node next;
        public Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addPatient(Patient p) {
        Node newNode = new Node(p);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode; // DÜZELTİLDİ: tail güncellendi
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
    public void findPatient(int id) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("Found patient: " + current.data);
                found = true;
                break;
            }
            current = current.next; // DÜZELTİLDİ: Döngü içine alındı
        }
        if (!found) {
            System.out.println("The patient searched (ID: " + id + ") is not present here.");
        }
    }
    public void printList() {
        System.out.println("\n--- FINAL PATIENT LIST ---"); // Başlık döngü dışına alındı
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
