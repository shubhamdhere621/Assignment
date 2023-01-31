import java.util.Scanner;

 class SwitchArray
{
	public void switchArray()
	{
		
	  try {
		  
		  MyArray e=new MyArray(3);
			boolean bbb=true;
		while(bbb)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("1.Add element ");
			System.out.println("2.delete at specific postion");
			System.out.println("3.update element at specific position");
			System.out.println("4.insert at specific position");
			System.out.println("5.display");
			
			
			System.out.println("6.Exit");
			System.out.println("Enter the choice ");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
				try {
				System.out.println("Enter the Element :");
				int valu=sc.nextInt();
				e.add(valu);
				}catch(Exception e1)
				{
					System.out.println("Enter the Integer value");
				}
			break;
			
			case 2:
				try {
				System.out.println("Enter the Index :");
				int index1=sc.nextInt();
				e.delete(index1);
				}catch(Exception e1)
				{
					System.out.println("Enter the Integer value");
				}
				break;
			case 3:try {
				System.out.println("Enter the Index :");
				int ind=sc.nextInt();
				System.out.println("Enter the update value:");
				int update=sc.nextInt();
				e.update(update,ind);
			}catch(Exception e1)
			{
				System.out.println("Enter the Integer value");
			}
				break;
			case 4:
			try {
				System.out.println("Enter the Index :");
				int index=sc.nextInt();
				System.out.println("Enter the Element :");
				int value=sc.nextInt();
				e.insert(value,index);
			}catch(Exception e1)
			{
				System.out.println("Enter the Integer value");
			}
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
	  }catch(Exception eee)
		{
			System.out.println("Enter the Valid value");
		}
	  
		}
	

	}
