import java.util.List;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.Interceptor;

import DBManager.DBManager;

public class Service  {

	public DBManager db;
	
	public List<String> get(String value) {
		db=new DBManager("struts_db", "root", "root");
    	return db.get(value);
	}
}
