package com.gymapp.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gymapp.connections.DbConnection;

public class ParticipantsDAL {

	Connection conObj = null;
	PreparedStatement  ps = null;
	
	public ParticipantsDAL() throws Exception
	{
		conObj =DbConnection.getConnection();
	}

}
