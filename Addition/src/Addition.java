import java.util.Scanner;

public class Addition {
	
	public static void main(String args[]){
		
		int x, y, z;
		System.out.println("Enter Two Numbers to Find Their Sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("The Sum is "+z);
		
	}

}
