package DP;

public abstract class User {
  protected String userID;
  protected String userPassword;
  protected String userFirstName;
  protected String userLastName;
  protected String userAddress;

  public User(String userID,String userPassword,String userFirstName,String userLastName,String userAddress) {
  this.userID = userID;
  this.userPassword = userPassword;
  this.userFirstName = userFirstName;
  this.userLastName = userLastName;
  this.userAddress = userAddress;
  }

  public String toString(){
    return "userID : "+userID+"userPassword : "+userPassword+"userFirstName : "+userFirstName+"userLastName : "+userLastName+"userLastName : "+userLastName+"userAddress : "+userAddress;
  }
  public void setUserID(String ID) {userID=ID;}
  public String getUserID() {return userID;}
  public void setUserPassword(String Password) {userPassword=Password;}
  public String getUserPassword() {return userPassword;}
  public void setuserFirstName(String FirstName) {userFirstName=FirstName;}
  public String getuserFirstName() {return userFirstName;}
  public void setuserLastName(String LastName) {userLastName=LastName;}
  public String getuserLastName() {return userLastName;}
  public void setuserAddress(String Address) {userAddress=Address;}
  public String getuserAddress() {return userAddress;}

  //abstract method
  public abstract String[] getFullUser();
}
