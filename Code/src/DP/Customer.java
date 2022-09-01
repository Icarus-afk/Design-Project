package DP;
public class Customer extends User{
  private String custEmail;
  private int custPhone;

  public Customer(String userID,String userPassword,String userFirstName,String userLastName,String userAddress,String custEmail,int custPhone) {
  super(userID,userPassword,userFirstName,userLastName,userAddress);
  this.custEmail = custEmail;
  this.custPhone = custPhone;
  }

  public Customer(String[] anArray){
  super(anArray[0],anArray[1],anArray[2],anArray[3],anArray[4]);
  this.custEmail=anArray[5];
  this.custPhone= Integer.parseInt(anArray[6]);
  }

  public String[] getFullUser() {
    String[] FullCustomerInfo = new String[7];
    FullCustomerInfo[0] = super.getUserID();
    FullCustomerInfo[1] = super.getUserPassword();
    FullCustomerInfo[2] = super.getuserFirstName();
    FullCustomerInfo[3] = super.getuserLastName();
    FullCustomerInfo[4] = super.getuserAddress();
    FullCustomerInfo[5] = custEmail;
    FullCustomerInfo[6] = String.valueOf(custPhone);
    return FullCustomerInfo;
  }

  public String toString(){
    return super.toString()+"custEmail : "+custEmail+"custPhone : "+custPhone;
  }
  public void setcustEmail(String Email) {custEmail=Email;}
  public String getcustEmail() {return custEmail;}
  public void setcustPhone(int Phone) {custPhone=Phone;}
  public int getcustPhone() {return custPhone;}
}
