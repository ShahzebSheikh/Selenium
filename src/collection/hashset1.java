package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	hs.add("pramod");
	hs.add("shahzeb");
	hs.add("Asmita");
	hs.add(100);
	hs.add(500);
	hs.add('A');
	hs.add(70.7f);
	hs.add("Velocity");
	System.out.println(hs);
	Iterator itr=hs.iterator();
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
	for(Object oj:hs) 
	{
		System.out.print(oj+" ");
	}
	System.out.println(hs.toArray());
}
}
