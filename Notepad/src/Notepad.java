import java.util.*;
import java.io.*;

public class Notepad {
	
	public static void main(String[] args){
		Runtime rs = Runtime.getRuntime();
		
		try {
			rs.exec("notepad");
			rs.exec("notepad programming.txt");
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
