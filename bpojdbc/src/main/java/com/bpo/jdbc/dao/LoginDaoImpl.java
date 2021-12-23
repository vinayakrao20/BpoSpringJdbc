package com.bpo.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bpo.jdbc.entites.Login;

public class LoginDaoImpl  implements LoginDao
{
private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	public int insert(Login login) {
		//insert Query
        String query="insert into sys.login(userEmail,userPassword) values(?,?)"; 
       int r = this.jdbcTemplate.update(query,login.getUserEmail(),login.getUserPassword());
		return r;
	}

}
