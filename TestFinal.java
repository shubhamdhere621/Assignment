import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFinal {
        static void mainMenu()
        {
        	System.out.println("1.Stack");
    		System.out.println("2.Queue");
    		System.out.println("3.Array");
    		System.out.println("4.LinkedList");
    		System.out.println("5.Exit");
    		System.out.println("Enter the Choices");
        }

	public static void main(String[] args) {
		mainMenu();
		Scanner sc =new Scanner(System.in);
		int choice;
		try {
		while(true)
		{
				
			 choice=sc.nextInt();
		
			switch(choice)
			{
			case 1:
				SwitchStack e=new SwitchStack();
				e.switchStack();
				break;
			case 2:
				SwitchQueue q=new SwitchQueue();
				q.switchQueue();
					break;
			case 3:
				SwitchArray r=new SwitchArray();
				r.switchArray();
					break;
				case 4:
					SwitchLinkedList sl=new SwitchLinkedList();
					sl.switchLinkedList();
					break;
				case 5 : 
					System.out.println("Exit succesfully!");
					System.exit(0);
					
					break;
			}
			System.out.println("--------xxx---------xxx---------");
			 mainMenu();
			
		}
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
