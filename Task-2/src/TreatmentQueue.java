public class TreatmentQueue {
    private class Node{
        TreatmentRequestClass data;
        Node next;

        public Node (TreatmentRequestClass request){
            this.data= request;
            this.next= null;
        }
    }
    private Node rear;
    private Node frond;
    private int counter;
    int capacity;
    public TreatmentQueue(int capacity){
        this.capacity= capacity;
        counter =0;
        rear = null;
        frond= null;
    }
    public void enQueue(TreatmentRequestClass request){
        if(isFull()){
            System.out.println("System is full. We can not add patient in the list.");
        }else{
            Node newNode = new Node(request);
            if (isEmpty()){
                rear= newNode;
                frond =newNode;
            }else{
                rear.next =newNode;
                rear= rear.next;
            }
            System.out.println();
            counter ++;
        }
    }
    public void deQueue(){
        if (isEmpty()){
            System.out.println("The is not any patient in the list. We can not remove any patient in the list.");
        }else{
            System.out.println(frond.data + " deleted" );
            frond = frond.next;
            counter --;
        }
    }
    public boolean isFull(){
        return counter == capacity;
    }
    public boolean isEmpty(){
        return counter == 0;
    }

    public int size(){
        return counter;
    }

    public void printQueue() {
        Node temp = frond;
        System.out.println("\n--- Current Treatment Queue ---"); // Döngü dışına alındı
        while (temp != null) {
            System.out.println(temp.data); // toString() otomatik çağrılır
            temp = temp.next;
        }
    }

}
