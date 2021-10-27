package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {	
	
	public static void main(String[] args) {
		       //Key   , Value
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(78, "velocity");
		table.put(75, "katraj");
		table.put(86, null);
		table.put(45, "2021");
		
		
		for(Map.Entry<Integer, String> j : table.entrySet())
		{
			System.out.println("Key = " + j.getKey() + " Value = " +j.getValue());
		}


		
		
		
		
		
	}
	

}
