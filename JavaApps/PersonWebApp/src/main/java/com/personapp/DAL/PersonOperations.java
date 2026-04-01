package com.personapp.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.personapp.connections.DbConnection;
import com.personapp.entities.Person;

public class PersonOperations {

	Connection conObj = null;
	PreparedStatement  ps = null;
	
	public PersonOperations() throws Exception
	{
		conObj =DbConnection.getConnection();
	}
	
	public void AddPerson(Person pObj)
	{
		try {
			ps = conObj.prepareStatement("insert into person(pid, pname, email, phone) value(?,?,?,?)");
			ps.setInt(1, pObj.getPid());
			ps.setString(2, pObj.getPname());
			ps.setString(3, pObj.getEmail());
			ps.setString(4, pObj.getPhone());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public List<Person> ViewAll()
	{
		List<Person>  plist = new ArrayList<Person>();
		Person p = null;
		try {
			ps = conObj.prepareStatement("Select * from Person");
			ResultSet rsObj = ps.executeQuery();
			
			while(rsObj.next())
			{
				p = new Person();
				p.setPid(rsObj.getInt("pid"));
				p.setPname(rsObj.getString("pname"));
				p.setEmail(rsObj.getString("email"));
				p.setPhone(rsObj.getString("phone"));
				plist.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return plist;
	}
	
	public Person SearchPersonBasedOnPhone(String ph)
	{
		Person p = null;
		try {
			ps = conObj.prepareStatement("Select * from Person where phone=?");
			ps.setString(1, ph);
			ResultSet rsObj = ps.executeQuery();
			
			if(rsObj.next())
			{
				p = new Person();
				p.setPid(rsObj.getInt("pid"));
				p.setPname(rsObj.getString("pname"));
				p.setEmail(rsObj.getString("email"));
				p.setPhone(rsObj.getString("phone"));				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return p;
	}

	public Person SearchPersonBasedID(int pid)
	{
		Person p = null;
		try {
			ps = conObj.prepareStatement("Select * from Person where pid=?");
			ps.setInt(1, pid);
			ResultSet rsObj = ps.executeQuery();
			
			if(rsObj.next())
			{
				p = new Person();
				p.setPid(rsObj.getInt("pid"));
				p.setPname(rsObj.getString("pname"));
				p.setEmail(rsObj.getString("email"));
				p.setPhone(rsObj.getString("phone"));				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return p;
	}

	public void DeletePerson(int pid)
	{
		try {
			ps = conObj.prepareStatement("Delete from Person where Pid=?");
			ps.setInt(1, pid);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void UpdatePerson(Person pObj)
	{
		try {
			ps = conObj.prepareStatement("update person set pname=?, email=?, phone=? where pid=?");			
			ps.setString(1, pObj.getPname());
			ps.setString(2, pObj.getEmail());
			ps.setString(3, pObj.getPhone());
			ps.setInt(4, pObj.getPid());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}