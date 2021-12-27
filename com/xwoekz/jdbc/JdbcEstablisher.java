package com.xwoekz.jdbc;

public class JdbcEstablisher {
public static void main(String[] args) {
	String jdbcFQN="com.mysql.cj.jdbc.Driver";
	System.out.println("loading of driver class ");
	try {
		Class.forName(jdbcFQN);
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	}
}
