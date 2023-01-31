class SingleLinkedList
{
	 class node
	{
		private  int data;
		private node next;
		public node(int data) {
			super();
			this.data = data;
			this.next=null;
		}
	}
	private	node head;
	public SingleLinkedList() {
		
		this.head = null;
		}
	
	boolean isListEmpty( ){
        return ( head == null );
          }
		public void addAtLast(int data)
	{
		node newNode=new node(data);
	  if(isListEmpty())
	  {
		  head=newNode;
	   }else {
		        node trav=head;
		        while(trav.next !=null)
		         {
			         trav=trav.next;
		         }
		 trav.next=newNode;
		 System.out.println("Element added at Last Successfully "+data);
	  }
	}
		
		
	public void addAtFirst(int data)
	{
		node newNode=new node(data);
		 if(isListEmpty())
		  {
			  head=newNode;
			  System.out.println("Element added at First position Successfully "+data);
		   }else if(head !=null) {
			     
			newNode.next=head;
			head=newNode;
			 System.out.println("Element added at First position Successfully "+data);
		  }
	}
	
	public void addAtSpecificPos(int pos,int data )
	{
	   node newNode=new node(data);
	   if(pos<=0)
	   {
		   System.out.println("Invalid pos");
	   }else {
	   if(pos==1)
	   {
		   newNode.next=head;
		   head=newNode;
		   System.out.println("Element added  Successfully "+data); 
	   }else
		   if(!isListEmpty()){
	   {
		   node trav=head;
		   int i=1;
		   while(trav.next!=null && i<pos-1)
		   {
			   i++;
			   trav=trav.next;
		   }
		   newNode.next=trav.next;
		   trav.next=newNode;
		   System.out.println("Element added  Successfully "+data); 
	   }
	   }else
	   {
		   System.out.println("List is Empty");
	   }
	   }
	}
	
        public void displayList(){
	        if( isListEmpty() ){
	            System.out.println("list is empty!");
	        }else{
	            node trav = head;
	         
	            while( trav.next != null ){
	                System.out.printf( trav.data  + "   ");
	                trav=trav.next;
	            }
	         System.out.print(trav.data);
	            System.out.print(" null");
	        
	        }
	    }
        public void deleteAtFirst()
        {
        	if(isListEmpty())
        	{
        		System.out.println("LinkedList is empty");
        	}else {
        		if(head.next==null)
        		{
        			head=null;
        			System.out.println("Element deleted Successfully");
        		}else {
        			node trav=head.next;
        			head=trav;
        			System.out.println("Element deleted Successfully");
        		}
        	}
        }
        
        public void deleteAtLast()
        {
        	if(isListEmpty())
        	{
        		System.out.println("LinkedList is empty");
        		}else
        	{
        		if(head.next==null)
        		{
        			node trav=head.next;
        			head=trav;
        			System.out.println("Element deleted Successfully");
        		}else {
        			node trav=head;
        			while(trav.next.next!=null)
        			{
        				trav=trav.next;
        			}
        	   trav.next=null;
        	   System.out.println("Element deleted Successfully");
        			}
        	}
        }
        
        public void deleteAtSpecificPoint(int pos)
        {
        	
        	if(pos<=0)
     	   {
     		   System.out.println("Invalid position");
     	   }else{
     		   if(isListEmpty())
        	{
        		System.out.println("LinkedList is empty");
        	}else
        	{
        		if(pos==1)
        		{
        			node trav=head.next;
        			head=trav;;
        		}else {
        			int i=1;
        			node tra=head;
        				
        			while(tra.next!=null   && i<pos-1)
        			{
            		    i++;
        				tra=tra.next;
        			}
        			if(tra==null || tra.next==null)
        			{
        				System.out.println("Position is Invalid!");
        			}
        			else {
        			tra.next=tra.next.next;
        			}
        			}
        	}
     	   }
        }
  }


public class ProgramLinkedList {
	public static void main(String[] args) {
		SingleLinkedList sl=new SingleLinkedList();
		
		sl.addAtLast(10);
		sl.addAtLast(30);
	    sl.addAtLast(70);
	    sl.addAtLast(90);
	    sl.addAtSpecificPos(2, 40);
	    sl.addAtFirst(10);
	    sl.deleteAtFirst();
	    sl.displayList();
	    System.out.println();
	    sl.deleteAtLast();
	    sl.displayList();
	    sl.deleteAtSpecificPoint(3);
	    System.out.println();
		sl.displayList();
        
	}

}
