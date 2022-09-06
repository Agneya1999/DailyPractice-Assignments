package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import javax.sql.*;

public class MySqlExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 System.out.println("With in My SQL Example class");
		   
		 Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");
       try {
       
	   Statement s= con.createStatement();
	   displayResultSet(s);
	   System.out.println("");
    	   
	   //Inserting a new row
	   System.out.println("Inserting a row");
	   String insert = "Insert into employee values (5,'Michael','Scott',125000)";
	   int j=s.executeUpdate(insert);
	   System.out.println("Total number of rows affected"+ j);
	   
	   //Update query
	   System.out.println("");
	   System.out.println("Updating a row");
	   String update = "update employee set lastName='Krishna' where idEmployee=4";
	   int i=s.executeUpdate(update);
	   System.out.println("Total number of rows affected"+ i);
	   
	   System.out.println("Table after doind insert and update");
	   System.out.println("");
	   displayResultSet(s);
	   System.out.println("");
	   PreparedStatement ps=con.prepareStatement("insert into employee (idEmployee,firstName,salary) values (?,?,?)");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Enter Id:");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter firstName:");
			String fName=br.readLine();
			System.out.println("Enter Salary:");
			int salary=Integer.parseInt(br.readLine());
			
			ps.setInt(1, id);
			ps.setString(2, fName);
			ps.setInt(3, salary);
			int k=ps.executeUpdate();
			System.out.println(k+" records affected");
			
			System.out.println("Do you want to continue Y or N");
			String str=br.readLine();
			if(str.startsWith("n")){
				break;
			}
			
		}while(true);
		displayResultSet(s);
      }
       catch(Exception e) {
    	   System.out.println("Exception:"+e.getMessage());
    	   e.printStackTrace();
       }
//       finally {
//    	   con.close();
//       }
		
	}
	public static void displayResultSet(Statement s) throws SQLException {
		String str = "select * from employee";
		ResultSet rs = s.executeQuery(str);
		
		while(rs.next()) {
			String resultSet = rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3)+" "+ rs.getInt(4);
			System.out.println(resultSet);
		}
	}

}
