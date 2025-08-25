package com.nt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SelectTest {
	private static Logger logger=LoggerFactory.getLogger(SelectTest.class);
	private static  final String GET_EMPS_QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";


	public static void main(String[] args) {
		logger.debug("start of main(-) method");
		  Connection con=null;
		  ResultSet rs=null;
		  PreparedStatement ps=null;
		try {
			      //establish the connection
				  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
				 logger.info("Connection is established with DB s/w");
				//create PreparedStatememt object
				  ps=con.prepareStatement(GET_EMPS_QUERY);
				logger.debug("PreparedStatement object is created");
				//execute Query
			      rs=ps.executeQuery(GET_EMPS_QUERY);
				logger.info("ResultSet object is created");
				
			   //process the ResultSet object
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getFloat(4)+"   "+rs.getInt(5));
			}
			logger.debug("ResultSet object is processsed");
		}//try
		catch(SQLException se) {
			logger.error("Problem in DB Connection"+se.getMessage());
			se.printStackTrace();
		}
		catch(Exception e) {
			logger.error("Un DB Problem ::"+ e.getMessage());
			e.printStackTrace();
		}
		finally {
			logger.debug("start of finally block");
			try {
				if(rs!=null)
					rs.close();
				logger.debug("ResultSet obj is closed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
				logger.debug("PreparedStatement obj is closed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
				logger.debug("Connection obj is closed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			logger.debug("end of finally block");
		}//finally
		logger.debug("end of main(-) method");
		}//main
}//class
