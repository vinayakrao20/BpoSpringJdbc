package com.bpo.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bpo.jdbc.dao.LoginDao;
import com.bpo.jdbc.entites.Login;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started........." );
        // spring jdbc=> jdbc Template
        ApplicationContext context= new ClassPathXmlApplicationContext("com/bpo/jdbc/config.xml");
       
		LoginDao loginDao = context.getBean("loginDao",LoginDao.class);
		
		Login login= new Login();
		login.setUserEmail("abc@gmail.com");
		login.setUserPassword("abc123");
		
		int result = loginDao.insert(login);
		System.out.println("Login Credentials added "+result);
    }
}
