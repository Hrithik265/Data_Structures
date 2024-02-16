package DS;

public class LinkedList
{
    Node head;
    private int size;
    
    public void setSize(int size){
        this.size = size;
    }
    
    public int getSize(){
        return size;
    }
    
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = next;
        }
    }
    
    //Adding value in first
    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    
    //Deleting first node
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        head = head.next;
        size--;
    }
    
    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
    }
    
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        size--;
        if(head.next==null){
            head = null;
            return;
        }
        
        Node secondLast = head;
        Node last = head.next;
        
        while(last.next!=null){
            last = last.next;
            secondLast = secondLast.next;
        }
        
        secondLast.next = null;
    }
    
    public void addInMiddle(int index, String data){
        if(index>size || index<0){
            System.out.println("Invalid index value");
            return;
        }
        
        size++;
        
        Node newNode = new Node(data);
        if(head==null || index==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node currNode = head;
        for(int i=1;i<size;i++){
            if(i==index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            
            currNode = currNode.next;
        }
        
    }
    
    public void printList(){
        
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        
        System.out.println("NULL");
    }
    
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.printList();
		System.out.println(list.getSize());
		
		list.addFirst("Hrithik");
		list.addFirst("Mr.");
		list.addLast("Shanmugavel");
		System.out.println(list.getSize());
		
		list.printList();
		
		list.deleteFirst();
		list.printList();
		System.out.println(list.getSize());
		
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());
		
		list.addLast("Chennai");
		list.addInMiddle(1, "Lives in");
		list.printList();
		
	}
}
