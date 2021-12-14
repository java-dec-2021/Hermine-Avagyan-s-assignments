public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList(){
        this.head = null;
    }
    
    public void add (int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        } else{
    
            Node runner = this.head;
            //System.out.println(runner.value);
            while(runner.next !=null) {
                //System.out.println(runner.next.value);
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
            if(this.head == null || this.head.next == null){
                this.head = null;
                return;
            }
        Node node = this.head;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }
    public void removeAt(int value){
        if (this.head == null)
            return;
    
        Node runner = this.head;
    
        int count = 0;
        while(runner != null) {
    
            runner = runner.next;
            count ++;
        }
        if (count == value){
            runner.next = runner;
            System.out.println(runner.value);
    
        }
    
            System.out.println("this is the count  " + count);
           System.out.println( " count is " + count);
        System.out.println("valu is " + value);
    
    
    }
    public void printValues(){
        Node runner = this.head;
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    
    public Node find(int value){
    Node runner =this.head;
    //    SinglyLinkedList myLinkedList = new SinglyLinkedList();
        while (runner != null){
    if (runner.value == value) {
        return runner;
    }
    runner = runner.next;
    }
        return null;
    }
    
        }
    
    
    