package com.nt.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectTest {
	private static final Logger logger = LoggerFactory.getLogger(SelectTest.class);
	private static final String GET_EMPS_QUERY = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";

	public static void main(String[] args) {
		logger.debug("Start of main(-) method");

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// establish the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");
			logger.info("Connection established with DB");

			// create PreparedStatement object
			ps = con.prepareStatement(GET_EMPS_QUERY);
			logger.debug("PreparedStatement object created");

			// execute Query (NO need to pass query again)
			rs = ps.executeQuery();
			logger.info("ResultSet object created");

			// process the ResultSet
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getFloat(4)
						+ "   " + rs.getInt(5));
			}
			logger.debug("ResultSet processed successfully");

		} catch (SQLException se) {
			logger.error("Database problem: {}", se.getMessage(), se);
		} catch (Exception e) {
			logger.error("Unexpected problem: {}", e.getMessage(), e);
		} finally {
			logger.debug("Start of finally block");
			try {
				if (rs != null) {
					rs.close();
					logger.debug("ResultSet closed");
				}
			} catch (Exception e) {
				logger.error("Error closing ResultSet", e);
			}
			try {
				if (ps != null) {
					ps.close();
					logger.debug("PreparedStatement closed");
				}
			} catch (Exception e) {
				logger.error("Error closing PreparedStatement", e);
			}
			try {
				if (con != null) {
					con.close();
					logger.debug("Connection closed");
				}
			} catch (Exception e) {
				logger.error("Error closing Connection", e);
			}
			logger.debug("End of finally block");
		}

		logger.debug("End of main(-) method");
	}
}
