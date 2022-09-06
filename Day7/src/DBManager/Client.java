package DBManager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DBManager dbObject = new DBManager("employee_db", "root", "root");
     System.out.println("Retrieving the table");
     System.out.println("");
     List<String> li=dbObject.get("employee");
     Client.iterate(li);
     HashMap<String, String> a = new HashMap<String, String>();
     a.put("idEmployee", "6");
     a.put("firstName", "Manjesh");
     a.put("lastName", "Mata");
     a.put("salary", "95000");
     
     dbObject.insert("employee", a);
     System.out.println("");
     System.out.println("Retrieving the updated table");
	 System.out.println("");
	 List<String> li1=dbObject.get("employee");
	 Client.iterate(li1);
	}
	public static void iterate(List<String> li) {
		
			Iterator<String> itr = li.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
	}

}
