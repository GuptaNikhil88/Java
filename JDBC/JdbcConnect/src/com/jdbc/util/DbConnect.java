package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DbConnect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		ResultSet rs = null;
		String query = null;
		int emp_id;
		String emp_nm = "";
		String desig = "";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    String  url = "jdbc:oracle:thin:@localhost:1521:xe";
		    String uName = "IS7032";
		    String pass = "IS7032";
		    
		    con = DriverManager.getConnection(url,uName,pass);
		    
		    query = "SELECT * FROM FACULTY WHERE FAC_LAST_NM = 'Randolph'";
		    
		    Statement st = con.createStatement();
		    rs = st.executeQuery(query);
		  		
		    System.out.print(" ID"+"\t");
	    	System.out.print("NAME"+"\t");
	    	System.out.println("DESIGNATION");
	    	System.out.println("------------------------------------");
		    
		    while(rs.next()){
		    	
		    	
		    	emp_id = rs.getInt("FAC_UNIVID");
		    	emp_nm = rs.getString("FAC_FIRST_NM");
		    	desig = rs.getString("FAC_DEP_NAME");
		    	
		    	System.out.print(emp_id+"\t"+"\t");
		    	System.out.print(emp_nm+"\t"+"\t");
		    	System.out.println(desig);
		    }
		    
		}
		  catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	


/*
 * CREATE OR REPLACE PROCEDURE getEmpName 
   (EMP_ID IN NUMBER, EMP_FIRST OUT VARCHAR) AS
BEGIN
   SELECT first INTO EMP_FIRST
   FROM Employees
   WHERE ID = EMP_ID;
END;
 * */
 