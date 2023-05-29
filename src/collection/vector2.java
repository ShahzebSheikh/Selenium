package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vector2
{
public static void main(String[] args) 
{
	Vector v=new Vector();
	v.add("pramod");
	v.add("shahzeb");
	v.add("Asmita");
	v.add(100);
	v.add(500);
	v.add('A');
	v.add(70.7f);
	v.add("Velocity");
	
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.get(1));
	//v.remove(4);
	//System.out.print(v);
	v.add(3, 200);
	System.out.println(v);
	v.set(3, 1000);
	System.out.println(v);
	System.out.println(v.size());
	Iterator itr=v.iterator();
	while(itr.hasNext()) 
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println(v.capacity());
	Object rtn = v.retainAll(v);
	System.out.println(rtn);
	System.out.println(v.getClass());
	//System.out.println(v.stream());
	//System.out.println(v.parallelStream());
	Enumeration enr=v.elements();
	while(enr.hasMoreElements()) 
	{
		System.out.print(enr.nextElement()+" ");
	}
	
	
	
}
}
