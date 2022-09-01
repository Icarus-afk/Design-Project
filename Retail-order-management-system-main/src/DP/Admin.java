package DP;
public class Admin extends User{
  private String adminPosition;

  public Admin(String userID,String userPassword,String userFirstName,String userLastName,String userAddress,String adminPosition){
  super(userID,userPassword,userFirstName,userLastName,userAddress);
  this.adminPosition=adminPosition;
  }

  public Admin(String[] anArray){
  super(anArray[0],anArray[1],anArray[2],anArray[3],anArray[4]);
  this.adminPosition=anArray[5];
  }
  public String[] getFullUser() {
    String[] FullAdminInfo = new String[6];
    FullAdminInfo[0] = super.getUserID();
    FullAdminInfo[1] = super.getUserPassword();
    FullAdminInfo[2] = super.getuserFirstName();
    FullAdminInfo[3] = super.getuserLastName();
    FullAdminInfo[4] = super.getuserAddress();
    FullAdminInfo[5] = adminPosition;
    return FullAdminInfo;
  }

  public String ToString(){
    return super.toString()+"adminPosition : "+adminPosition;
  }
  public void setadminPosition(String Position) {adminPosition=Position;}
  public String getadminPosition() {return adminPosition;}

}
