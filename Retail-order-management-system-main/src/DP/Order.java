package DP;

import java.util.*;

public class Order {
    private String ordNo;
    private String ordCustomerID;
    private String orderDate;
    private int ordTotal;
    private int CountOfItems;
    FileOperations fops = new FileOperations();

    public Order(String ordNo,String orderDate,int ordTotal,int CountOfItems) {
    this.ordNo = ordNo;
    this.orderDate = orderDate;
    this.ordTotal = ordTotal;
    this.CountOfItems = CountOfItems;
    }

    public Order(String[] anArray){
      this.ordNo = anArray[0];
      this.ordCustomerID = anArray[1];
      this.orderDate = anArray[2];

      ArrayList <String[]> OrderItemList =  fops.objectBasedSearchOperations(anArray[0],"Order_Item.txt","Order_Item");
      for (String[] lines: OrderItemList){
        this.ordTotal += Integer.parseInt(lines[8]);
      }
      this.CountOfItems = OrderItemList.size();
    }

    public String[] getFullOrder() {
      String[] FullOrderInfo = new String[5];
      FullOrderInfo[0] = ordNo;
      FullOrderInfo[1] = ordCustomerID;
      FullOrderInfo[2] = orderDate;
      FullOrderInfo[3] = String.valueOf(ordTotal);
      FullOrderInfo[4] = String.valueOf(CountOfItems);
      return FullOrderInfo;
    }


    public String toString(){
      return "ordNo : "+ordNo+"ordCustomerID : "+ordCustomerID+"orderDate : "+orderDate+"ordTotal : "+ordTotal+"CountOfItems : "+CountOfItems;
    }

    public void setordNo(String No) {ordNo=No;}
    public String getordNo() {return ordNo;}
    public void setordCustomerID(String CustomerID) {ordCustomerID=CustomerID;}
    public String getordCustomerID() {return ordCustomerID;}
    public void setorderDate(String dates) {orderDate=dates;}
    public String getorderDate() {return orderDate;}
    public void setordTotal(int Total) {ordTotal=Total;}
    public int getordTotal() {return ordTotal;}
    public void setCountOfItems(int Count) {CountOfItems=Count;}
    public int getCountOfItems() {return CountOfItems;}
}
