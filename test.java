import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
        static void mainMenu()
        {
        	System.out.println("1.Stack");
    		System.out.println("2.Queue");
    		System.out.println("3.Array");
    		System.out.println("4.LinkedList");
    		System.out.println("5.Exit");
    		System.out.println("Enter the Choices");
        }
        static void stackmenu()
        {
        	System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");
        }
        static void queueMenu()
        {
        	System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.front");
			System.out.println("4.rear");
			System.out.println("5.exit");
        }
        static void arrayMenu()
        {
        	System.out.println("1.Add element ");
			System.out.println("2.delete at specific postion");
			System.out.println("3.update element at specific position");
			System.out.println("4.insert at specific position");
			System.out.println("5.display");
			
			
			System.out.println("6.Exit");
			
        }
        static void linkedListMenu()
        {
        	System.out.println("1.Add At First ");
			System.out.println("2.Add at Last");
			System.out.println("3.Add at Specific Position");
			System.out.println("4.Delete At First Position");
			System.out.println("5.Delete At Last Position");
			System.out.println("6.Delete At  Specific Position");
			System.out.println("7.Display");
			System.out.println("8.Exit");
        }
	public static void main(String[] args) {
		mainMenu();
		Scanner sc =new Scanner(System.in);
		int choice;
		
		while(true)
		{
			try {
				
			 choice=sc.nextInt();
		
			switch(choice)
			{
			case 1:
				MyStack st=new MyStack(3);
				boolean b=true;
				while(b)
				{
			    stackmenu();
				System.out.println("Enter the choice ");
				try {
				int	ch=sc.nextInt();
					switch(ch)
					{
					case 1 :
						try {
						System.out.println("Enter the Element :");
						int value=sc.nextInt();
						st.push(value);
						}catch(Exception e)
						{
							System.out.println("Enter the integer input");
						}
					break;
					
					case 2:
						st.pop();
						break;
					case 3:
						st.peek();
						break;
					case 4:
						b=false;
						break;
					}
					System.out.println();
					System.out.println("--------xxx---------xxx---------");
				}catch(Exception e)
				{
					System.out.println("Enter the valid Input");
				}
				}
				break;
			case 2:
					    
						MyQueue q=new MyQueue(3);
						boolean bb=true;
						while(bb)
						{
							queueMenu();
							try {
							System.out.println("Enter the choice ");
						int	choi=sc.nextInt();
							switch(choi)
							{
							case 1 :
								try {
								System.out.println("Enter the Element :");
								int value=sc.nextInt();
								q.enqueue(value);
								}catch(Exception e)
								{
									System.out.println("Enter the Integer value");
								}
							break;
							
							case 2:
								q.dequeue();
								break;
							case 3:
								q.front();
								break;
							case 4:
								q.rear();
								break;
							case 5:
								bb=false;
								break;
							
							}
							System.out.println();
							System.out.println("--------xxx---------xxx---------");
							}catch(Exception e)
							{
								System.out.println("Enter the valid Input");
							}
						}
					break;
			case 3:
					MyArray e=new MyArray(3);
					boolean bbb=true;
					while(bbb)
					{
						arrayMenu();
						System.out.println("Enter the choice ");
						choice=sc.nextInt();
						switch(choice)
						{
						case 1 :
							System.out.println("Enter the Element :");
							int valu=sc.nextInt();
							e.add(valu);
						break;
						
						case 2:
							System.out.println("Enter the Index :");
							int index1=sc.nextInt();
							e.delete(index1);
							break;
						case 3:
							System.out.println("Enter the Index :");
							int ind=sc.nextInt();
							System.out.println("Enter the update value:");
							int update=sc.nextInt();
							e.update(update,ind);
							break;
						case 4:
							System.out.println("Enter the Index :");
							int index=sc.nextInt();
							System.out.println("Enter the Element :");
							int value=sc.nextInt();
							e.insert(value,index);
							break;
						case 5:
							e.display();
							break;
						case 6 :
							bbb=false;
							break;
							
						}
						System.out.println();
						System.out.println("--------xxx---------xxx---------");
					}
					break;
				case 4:
					linkedListMenu();
					SingleLinkedList sl=new SingleLinkedList();
					boolean bbbb=true;
					while(bbbb)
					{
						System.out.println("Enter the choice ");
					int	choice4=sc.nextInt();
						switch(choice4)
						{
						case 1 :
							System.out.println("Enter the Element :");
							int value=sc.nextInt();
							
							sl.addAtFirst(value);
						break;
						
						case 2:
							System.out.println("Enter the Element :");
							int val=sc.nextInt();
							sl.addAtLast(val);
							break;
						case 3:
							System.out.println("Enter the Element :");
							int ele=sc.nextInt();
							System.out.println("Enter the position :");
							int pos=sc.nextInt();
							  sl.addAtSpecificPos(pos, ele);
							break;
						case 4:
							 sl.deleteAtFirst();
							break;
						case 5:
							 sl.deleteAtLast();
							break;
						case 6:	
							System.out.println("Enter the position :");
							int pos1=sc.nextInt();

							 sl.deleteAtSpecificPoint(pos1);
							break;
						case 7 : 
							sl.displayList();
							break;
						case 8:
							bbbb=false;
							break;
						}
						System.out.println();
						System.out.println("--------xxx---------xxx---------");
						
					}
					break;
				case 5 : 
					System.exit(0);
					break;
			}
			System.out.println("--------xxx---------xxx---------");
			 mainMenu();
			}catch(InputMismatchException e)
			{
			  System.out.println("Enter the valid number");
			  choice=sc.nextInt();
			}
			finally
			{
				sc.close();
			}
			
		}
		

	}

}
