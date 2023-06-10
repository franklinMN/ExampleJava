class DoubleLinkedList {

    Node head, tail;

    DoubleLinkedList() {
        head = tail = null;
    }

    class Node {
        int data;
        Node next, prev;

        Node( int d ) {
            this.data = d;
            this.next = null;
            this.prev = null;
           // System.out.println("Node Created...");
        }
    }

    void insertElementLast( int num ) {
        Node newNode = new Node(num);
        if( head == null ) {
            head = tail = newNode;
        }else {
           //Node temp = tail;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    void deleteElementLast(  ) {
        if(head == null) {
            System.out.println( "No elements to delete...!" );
        }else {
            if ( head.next == null ) {
                head = tail = null;
            }else {
                tail = tail.prev;
                tail.next = null;
            }
            
        }
    }

    void displayElement() {
        Node temp;
        for ( temp = head ; temp != null ; temp = temp.next) {
            System.out.print( temp.data + ", " );
        }
        System.out.println();
    }
}

class DoubleLinkedListMain {
    public static void main( String[] args ) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.insertElementLast(5);
        dl.displayElement();
        dl.deleteElementLast();
        dl.displayElement();
        dl.insertElementLast(10);
        dl.displayElement();
        dl.insertElementLast(15);
        dl.displayElement();
        dl.insertElementLast(20);
        dl.displayElement();
        dl.insertElementLast(25);
        dl.displayElement();
        dl.deleteElementLast();
        dl.displayElement();
        dl.deleteElementLast();
        dl.displayElement();
        dl.deleteElementLast();
        dl.displayElement();
        dl.deleteElementLast();
        dl.displayElement();
        dl.deleteElementLast();
        dl.displayElement();
    }
}