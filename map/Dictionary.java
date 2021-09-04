package maps;
import java.util.*;

public class Dictionary {  
	public static void main(String args[]){  
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();    
		System.out.println("Initial list of elements: "+hashMap);  
		hashMap.put(1,"francis");    
		hashMap.put(2,"avinash");    
		hashMap.put(3,"blessy");   
       
		System.out.println("After invoking put() method ");  
		for(Map.Entry m:hashMap.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  
        
		hashMap.putIfAbsent(2, "raji");  
		hashMap.putIfAbsent(4, "shouri");  
		System.out.println("After invoking putIfAbsent() method ");  
		for(Map.Entry m:hashMap.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
        }  
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(104,"anjelina");  
		map.putAll(hashMap);  
		System.out.println("After invoking putAll() method ");  
		for(Map.Entry m:map.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
        }  
 }  
}  