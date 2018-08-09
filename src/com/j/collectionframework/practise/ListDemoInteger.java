package com.j.collectionframework.practise;
import java.util.*;

public class ListDemoInteger {

	public static void main(String[] args) {
		
				// Create a list
		
				List<Integer> st =new ArrayList<>();
				
				//List st=new ArrayList();
				
				System.out.println(st.size());
				
				st.add(99);
				st.add(999);
				st.add(9999);
				st.add(99999);
				st.add(999999);
				st.add(9999999);
				
				System.out.println(st);
			
				//For Loop
				for(int i=0; i<st.size(); i++)
				{
					System.out.println(st.get(i));
				}
				
				//For Each Loop
				for(Integer num: st)
				{
					System.out.println("For each loop:"+"\n"+num);
				}
				
				
				// While Loop
				int count =0;
				while(st.size()>count)
				{
					System.out.println(st.get(count));
					count++;
				}
				
				
				System.out.println("Iterator Loop");
				
				// Iterator loop
				Iterator it=st.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				

			}

		}

		

