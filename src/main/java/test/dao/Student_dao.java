package test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.beans.Student_bean;


public class Student_dao 
{

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template)
    {
		this.template = template;
	}
	
	public int save(Student_bean s)
	{
		String sql="insert into student(fname,lname,email,password)values('"+s.getFname()+"','"+s.getLname()+"','"+s.getEmail()+"','"+s.getPassword()+"')";
		return template.update(sql);		
	}
	
	public List<Student_bean> getallstudent()
	{
		return template.query("select * from student", new RowMapper<Student_bean> () {

			public Student_bean mapRow(ResultSet rs, int row) throws SQLException {
				
				Student_bean s=new Student_bean();
				
			    s.setId(rs.getInt(1));
				s.setFname(rs.getString(2));
				s.setLname(rs.getString(3));
				s.setEmail(rs.getString(4));
				s.setPassword(rs.getString(5));

				
				return s;
			}} );
	
	}
}	
