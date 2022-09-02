package practice;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CarsInIndia car=new CarsInIndia();
      Set<String> s1=car.getcarIndia();
     
      HashSet<String> s2=car.getcarJapanese();
      Set<String> s4=new HashSet<String>(s2);
      System.out.println("--------------"+s4);
      HashSet<String> s5=(HashSet<String>) s2.clone();
      System.out.println("++++++++++++"+s5);
      System.out.println("Cars of Indian brand \n"+s1);
      System.out.println("Cars of Japanese brand \n"+s2);
      System.out.println("**********************");
      System.out.println("Before adding s2 to s1, checking for contains all "+s1.containsAll(s2));
     
      System.out.println("Adding from s2 to s1"+ s1.addAll(s2));
      System.out.println("After adding s2 to s1, checking for contains all "+s1.containsAll(s2));
      Set<String> s3=car.getcarIndia();
      s3.retainAll(s2);
      System.out.println(s3);
      System.out.println("Removing all from s1 & s2");
      s1.removeAll(s2);
      System.out.println(s1);
      System.out.println(s2);
      
	} 

}
