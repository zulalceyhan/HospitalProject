public class DischargeStack {
    int counter;
    int size;
    Node top;

    public DischargeStack(int size){
        this.size=size;
        counter=0;
        top=null;
    }
    public class Node{
        DischargeRecord data;
        Node next;

        private Node(DischargeRecord record){
            this.data = record;
            next = null;
        }
    }
    void push(DischargeRecord record){
        Node newNode = new Node(record);
        if(isFull()){
            System.out.println("List is full.We can not saved any patient on the system.");
        }else{
            if(isEmpty()){
                top = newNode;
                System.out.println("First patient saved the system.");
            }else{
                newNode.next=top;
                top=newNode;
                System.out.println("");
            }
            counter++;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("List has not any patient on the list.We can not remove any patient on the list.");
        }else{
            System.out.println(top.data + "patient is removed on the list.");
            top=top.next;
            counter--;
        }
    }
    public DischargeRecord peek() {
        if (isEmpty()) {
            return null;
        } else {
            return top.data; // return the top the data
        }
    }
    void printStack(){
        Node temp =top;
        if (temp == null){
            System.out.println("List is empty.We can not print anything.");
        }else{
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public boolean isEmpty(){
        return counter ==0;
    }
    public boolean isFull(){
        return counter == size;
    }

}
