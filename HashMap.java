package ust.examples;

import java.util.LinkedHashMap;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String>hml = new LinkedHashMap<Integer,String>();
hml.put(3,"Geeks");
hml.put(2,"For");
hml.put(1,"Geeks");

System.out.println("Mappings of LinkedHashMap:"+hml);
	}

}
