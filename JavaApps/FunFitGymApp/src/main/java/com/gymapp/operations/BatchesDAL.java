package com.gymapp.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gymapp.connections.DbConnection;

public class BatchesDAL {

	Connection conObj = null;
	PreparedStatement  ps = null;
	
	public BatchesDAL() throws Exception
	{
		conObj =DbConnection.getConnection();
	}
}
