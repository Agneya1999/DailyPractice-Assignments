package DBManager;

import java.sql.*;
import javax.sql.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DBManager {
	private String dBName;
	private String user;
	private String password;
	private Connection con;
	
 static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public DBManager(String dBName, String user, String password) {
		super();
		this.dBName = dBName;
		this.user = user;
		this.password = password;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.dBName, this.user,
					this.password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<String> get(String tableName) {
		List<String> list = new ArrayList<String>();
					
		
		Statement s=null;
		ResultSet rs=null;
		try {
		
			
			 
           
			 s = con.createStatement();
			String str = "select * from " + tableName + " ;";
			 rs = s.executeQuery(str);
			ResultSetMetaData rms = rs.getMetaData();
			int count = rms.getColumnCount();

			while (rs.next()) {
				String result = "";
				for (int i = 1; i <= count; i++) {
					result = result + " " + rs.getString(i);

				}
				list.add(result.trim());
			}
			

		} 
		catch(SQLException sql) {
			sql.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			e.printStackTrace();
		}
		
//		finally {
//			try {
//				rs.close();
//				s.close();
//				con.close();
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
//			
//		}
		return list;
		

	}

	public void insert(String tableName, HashMap<String, String> a) {
//            Connection con=null;
            PreparedStatement ps=null;
		try {
			
			
			
			
//			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.dBName, this.user,
//					this.password);
			
			String s = "?";
			for (int i = 1; i < a.size(); i++) {
				s = s + ",?";
			}
			// System.out.println(s);
			String abc = "";
			for (Entry<String, String> mo : a.entrySet()) {
				abc = abc + mo.getKey() + ",";
			}
			abc = abc.substring(0, abc.length() - 1);

			
			
			 ps = con.prepareStatement("insert into " + tableName + " (" + abc + ") values (" + s + ")");
			// System.out.println("insert into "+tableName+" values ("+s+")");

			int j = 1;
			while (j <= a.size()) {
				for (String b : a.values()) {
					ps.setString(j, b);
					j++;
				}
			}

			ps.executeUpdate();
			
			

		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			e.printStackTrace();
		}
//		finally {
//			try {
//				ps.close();
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}

	}
	

	public String getdBName() {
		return dBName;
	}

	public void setdBName(String dBName) {
		this.dBName = dBName;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void close() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside close method");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
