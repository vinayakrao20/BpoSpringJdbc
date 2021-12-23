package com.bpo.jdbc.entites;

public class Login 
{
private String userEmail ;
private String userPassword;
public Login() {
	super();

}
public Login(String userEmail, String userPassword) {
	super();
	this.userEmail = userEmail;
	this.userPassword = userPassword;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
@Override
public String toString() {
	return "Login [userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
}

}
