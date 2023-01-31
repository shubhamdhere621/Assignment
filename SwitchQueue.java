import java.util.Scanner;

public class SwitchQueue {
public void switchQueue()
{
	
	
  try {
	 
	  MyQueue q=new MyQueue(4);
		boolean bb=true;
	while(bb)
	{
		 Scanner sc =new Scanner(System.in);
		System.out.println("1.enqueue");
		System.out.println("2.dequeue");
		System.out.println("3.front");
		System.out.println("4.rear");
		System.out.println("5.display");
		System.out.println("6.exit");
	
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
			q.display();
			break;
		case 6:
			bb=false;
			break;
		
		}
		System.out.println();
		System.out.println("--------xxx---------xxx---------");
		
		}
	}catch(Exception e)
	{
		System.out.println("Enter the Integer value");
	}
  
}


}

