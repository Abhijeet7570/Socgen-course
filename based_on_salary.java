/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class user implements Comparable<user> {
        int id;
        int salary;
        String name;
        public int compareTo(user u)
        {
            //return this.id - u.id;
            //return this.name.compareTo(u.name);
            return u.salary-this.salary;
        }
        user(int id,int salary,String name)
        {
            this.id=id;
            this.salary=salary;
            this.name=name;
        }
}
public class GFG {
	public static void main (String[] args) {
		ArrayList<user> arr=new ArrayList<user>();
		arr.add(new user(1,1000,"abhijeet"));
		arr.add(new user(2,5000,"aqib"));
		arr.add(new user(3,300,"deepak"));
		Collections.sort(arr);
		for (user i : arr) 
        System.out.println(i.id+"  "+i.salary+"  "+i.name);
	}
}
