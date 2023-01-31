class MyArray{
	
	int arr[];
    int size;
    int count=-1;
    
	
	public MyArray( int size) {
		super();
		this.arr = new int [size];
		this.size = size;
			}
	
	public void reSize(int new_size)
	{
		int newArr[]=new int [new_size];
		for(int i=0;i<size;i++)
		{
			newArr[i]=arr[i];
		}
		arr=newArr;
		size=new_size;
	}
	public boolean isFull()
	{
		if(count==arr.length-1)
			return true;
		return false;
		
	}
	 public void add(int data) {
	        if (!isFull()) {
	            count++;
	            arr[count] = data;
	            System.out.println("added element:" + data);
	        
	        } else {
	        	reSize(size*2);
	        	count++;
	        	arr[count]=data;
	        	System.out.println("added element:" + data);
	                   }
	    }
	
	 
	public void insert(int input,int index)
	{
		
		int newArr[]=new int [arr.length+1];
		if(index>=arr.length || index<0) {
			System.out.println("index is out of array size '"+size+"'");
		}else {
		for(int i=0;i<newArr.length;i++)
		{
			
			if(i<index)
			{
				newArr[i]=arr[i];
			}else if(i==index)
			{
				count++;
				newArr[i]=input;
			}else if(i>index) {
				newArr[i]=arr[i-1];
			}
			
			}
		arr=newArr;
		System.out.println("Element inserted Successfully");
		}
		
				
	}
	public void delete(int index)
	{
		int newArr[]=new int[arr.length-1];
		if(index>=arr.length || index<0) {
			System.out.println("index is out of array size '"+size+"'");
		}else {		
			for(int i=0;i<arr.length;i++)
		{
			
			if(i<index)
			{
				newArr[i]=arr[i];
			}else if(i==index)
			{
				count--;
				continue;
			}else 
			{
				newArr[i-1]=arr[i];
			}
		}
		arr=newArr;
		System.out.println("Element deleted Successfully");
		}
		
	}
	
	public void update(int input,int index)
	{
		if(input>=arr.length)
		{
			System.out.println("Enter the index value in the array size '"+ arr.length+"'");
		}else {
		arr[index]=input;
		}
	}
	
	public void display()
	{
		if(count==-1)
		{
			System.out.println("Array is Empty!");
		}else {
		System.out.println("array elements :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		}
	}
	
}
public class ProgramMyArray {

	public static void main(String[] args) {
		
	}

}
