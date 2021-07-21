package ust.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>hm = new LinkedHashMap<Integer,String>();
		hm.put(3,"Geeks");
		hm.put(2,"For");
		hm.put(1,"Geeks");
		
		for(Map.Entry<Integer, String>mapElement:hm.entrySet()) {
			Integer Key =mapElement.getKey();
			String value = mapElement.getValue();
			System.out.println(Key+" : " + value);
		}
		
		
	}

}
