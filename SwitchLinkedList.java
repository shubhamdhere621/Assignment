import java.util.Scanner;

 class SwitchLinkedList
{
	public void switchLinkedList()
	{
		
		
		SingleLinkedList sl=new SingleLinkedList();
		boolean bbbb=true;
		try {
		while(bbbb)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add At First ");
			System.out.println("2.Add at Last");
			System.out.println("3.Add at Specific Position");
			System.out.println("4.Delete At First Position");
			System.out.println("5.Delete At Last Position");
			System.out.println("6.Delete At  Specific Position");
			System.out.println("7.Display");
			System.out.println("8.Exit");
			System.out.println("Enter the choice ");
		    int	choice4=sc.nextInt();
			switch(choice4)
			{
			case 1 :
				try {
				System.out.println("Enter the Element :");
				int value=sc.nextInt();
				sl.addAtFirst(value);
				}catch(Exception e)
				{
					System.out.println("Enter the Integer value");
				}
			break;
			
			case 2:
				try {
				System.out.println("Enter the Element :");
				int val=sc.nextInt();
				sl.addAtLast(val);
			}catch(Exception e)
			{
				System.out.println("Enter the Integer value");
			}
				break;
			case 3:
				try {
				System.out.println("Enter the Element :");
				int ele=sc.nextInt();
				System.out.println("Enter the position :");
				int pos=sc.nextInt();
				  sl.addAtSpecificPos(pos, ele);
				}catch(Exception e)
				{
					System.out.println("Enter the Integer value");
				}
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
		}catch(Exception e)
		{
			System.out.println("Enter the valid value");
		}
		
	}
		
}