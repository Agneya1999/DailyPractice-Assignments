import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

import DBManager.DBManager;

public class GetBusinessAction extends ActionSupport{
//	private String str;
    private List<String> list;
    
    public Service service=new Service();

	   public List<String> getList() {
		return list;
	}



	public void setList(List<String> list) {
		this.list = list;
	}



	/*public String getStr() {
	        return str;
	    }



	   public void setStr(String str) {
	        this.str = str;
	    } */
	    
	    public String restaurants(){
//	    	DBManager dbObject=new DBManager("struts_db", "root", "root");
//	    	list=dbObject.get("restaurant");
	    	list=service.get("restaurant");
	        return SUCCESS;
	    }
	    public String hospitals(){
	    	DBManager dbObject=new DBManager("struts_db", "root", "root");
	    	list=dbObject.get("hospitals");
	        return SUCCESS;
	    }
	   public String movietheaters(){
		   DBManager dbObject=new DBManager("struts_db", "root", "root");
	    	list=dbObject.get("movietheaters");
	        return SUCCESS;
	    }
	   
	   
	   
	
	   
	   
	
}