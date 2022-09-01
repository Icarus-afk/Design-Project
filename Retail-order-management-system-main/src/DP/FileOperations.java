package DP;
import java.io.*;
import java.util.*;

public class FileOperations {
  private String searchID;
  private String searchPassword;
  private String FilePath;
  private String classType;
  private String searchInput;
  enum loginType {Admin,Customer};

  public ArrayList viewOperations(String FileAddress,String Type) {
    FilePath = FileAddress;
    classType = Type;
    ArrayList <String[]> tempList = new ArrayList<String[]>();
    try{
        File Filetxt = new File (FilePath);
        BufferedReader br = new BufferedReader(new FileReader(Filetxt));
        Object[] tableLines = br.lines().toArray();
        for(int i = 0; i < tableLines.length; i++)
        {
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split(";");

            if (classType == "Admin"){
            Admin temp = new Admin(dataRow);
            tempList.add(temp.getFullUser());
          }else if (classType == "Customer"){
            Customer temp = new Customer(dataRow);
            tempList.add(temp.getFullUser());
          }else if (classType == "Product"){
            Product temp = new Product(dataRow);
            tempList.add(temp.getFullProduct());
          }else if (classType == "Order_Item"){
            Order_Item temp = new Order_Item(dataRow);
            tempList.add(temp.getFullOrder_Item());
          }else if (classType == "Order"){
            Order temp = new Order(dataRow);
            tempList.add(temp.getFullOrder());
          }
        }
    } catch(FileNotFoundException ex){
    }
    return tempList;
  }



  public ArrayList viewOperations(String FileAddress) {
    FilePath = FileAddress;
    ArrayList <String[]> tempList = new ArrayList<String[]>();
    try{
        File Filetxt = new File (FilePath);
        BufferedReader br = new BufferedReader(new FileReader(Filetxt));
        Object[] tableLines = br.lines().toArray();
        for(int i = 0; i < tableLines.length; i++)
        {
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split(";");
            tempList.add(dataRow);
        }
    } catch(FileNotFoundException ex){
    }
    return tempList;
  }



  public ArrayList objectBasedSearchOperations(String Input,String FileAddress,String Type) {
    searchInput = Input;
    FilePath = FileAddress;
    classType = Type;
    ArrayList <String[]> tempList = new ArrayList<String[]>();
    ArrayList <String[]> searchResultList = new ArrayList<String[]>();

    try {
    File Filetxt = new File (FilePath);
    Scanner SC1 = new Scanner(Filetxt);
    while (SC1.hasNextLine()) {
     String line = SC1.nextLine();
     String[] wordsinLine = line.split(";");

     if (classType == "Order_Item"){
     Order_Item temp = new Order_Item(wordsinLine);
     tempList.add(temp.getFullOrder_Item());
     }else if (classType == "Order"){
     Order temp = new Order(wordsinLine);
     tempList.add(temp.getFullOrder());
     }
    }

    for (String[] wordsinLine: tempList){
      for (String words: wordsinLine){
        if (words.equals(searchInput)){
          searchResultList.add(wordsinLine);
        }
      }
    }
    } catch (IOException ex) {
    System.out.println("IOException found");
    }

    return searchResultList;
  }



  public ArrayList searchOperations(String Input,String FileAddress,String Type) {
    searchInput = Input;
    FilePath = FileAddress;
    classType = Type;
    ArrayList <String[]> tempList = new ArrayList<String[]>();

    try {
    File Filetxt = new File (FilePath);
    Scanner SC1 = new Scanner(Filetxt);
    while (SC1.hasNextLine()) {
     String line = SC1.nextLine();
     String[] wordsinLine = line.split(";");

     for (String word: wordsinLine){
       if (word.equals(searchInput)){
         if (classType == "Admin"){
         Admin temp = new Admin(wordsinLine);
         tempList.add(temp.getFullUser());
         }else if (classType == "Customer"){
           Customer temp = new Customer(wordsinLine);
           tempList.add(temp.getFullUser());
         }else if (classType == "Product"){
           Product temp = new Product(wordsinLine);
           tempList.add(temp.getFullProduct());
         }else{}
       }
      }
    }
    } catch (IOException ex) {
    System.out.println("IOException found");
    }

    return tempList;
  }



  public void write2File(Object[][] arrayToAdd,String FileAddress,String Type) {
    FilePath = FileAddress;
    classType = Type;
    Object[][] addingData = arrayToAdd;
        try{
            File Filetxt = new File (FilePath);
            FileWriter fw = new FileWriter(Filetxt);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (Object[] Lines: addingData){
              for (Object words: Lines){
                pw.write(String.valueOf(words));
                pw.write(";");
             }
             bw.newLine();
           }
          pw.close();
        } catch(IOException ex){ }
      }


  public void write2File(ArrayList arrayToAdd,String FileAddress,String Type) {
    FilePath = FileAddress;
    classType = Type;
    ArrayList <String[]> tempList = arrayToAdd;
    Object[][] dlist = tempList.toArray(new Object[][]{});
    this.write2File(dlist,FilePath,classType);
  }



  public void append2File(String[] arrayToAdd,String FileAddress,String Type) {
    FilePath = FileAddress;
    classType = Type;
    String[] addingData = arrayToAdd;
    try{
      File Filetxt = new File (FilePath);
      FileWriter fw = new FileWriter(Filetxt,true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
      for (String Lines: addingData){
          pw.write(Lines);
          pw.write(";");
       }
       bw.newLine();
       pw.close();
    } catch(IOException ex){ }
    }



  public boolean LoginOperation(String userID,String userpassword,int Type) {
    searchID = userID;
    searchPassword = userpassword;
    int userlogin = Type;
    boolean loginStuccessful = false;
    if (userlogin == 1){
      FilePath = "Admin.txt";
      classType = "Admin";
    }else if (userlogin == 2){
      FilePath = "Customer.txt";
      classType = "Customer";
    }

    ArrayList <String[]> tempList = (this.viewOperations(FilePath,classType));
    for (String[] line: tempList){
      if (line[0].equals(searchID) && line[1].equals(searchPassword)){
        loginStuccessful = true;
      }
    }
    return loginStuccessful;
  }



  public boolean DuplicateCheckOperation(String userID,String FileAddress,String Type) {
    searchID = userID;
    FilePath = FileAddress;
    classType = Type;
    boolean loginStuccessful = true;
    ArrayList <String[]> tempList = (this.viewOperations(FilePath,classType));
    for (String[] line: tempList){
      if (line[0].equals(searchID)){
        loginStuccessful = false;
      }
    }
    return loginStuccessful;
  }



  public boolean MultiDuplicateCheckOperation(String id1,String id2,int Position, String FileAddress,String Type) {
    String searchID1 = id1;
    String searchID2 = id2;
    FilePath = FileAddress;
    classType = Type;
    ArrayList <String> secondCheck = new ArrayList<String>();
    boolean loginStuccessful = true;

    ArrayList <String[]> tempList = (this.viewOperations(FilePath,classType));
    for (String[] line: tempList){
      if (line[0].equals(searchID1) &&      line[Position].equals(searchID2)){
        loginStuccessful = false;
      }
    }
    return loginStuccessful;
  }



  public String capitalizeEveryWord(String source,int upperPosition) {
    String capitalized = "";
    String[] word = source.split(" ");
    for(String c: word){
    capitalized += c.substring(0, upperPosition).toUpperCase() + c.substring(upperPosition).toLowerCase();
    capitalized += " ";
    }
      return capitalized.trim();
  }

}
