package DP;

import java.util.ArrayList;

public class Order_Item extends Product{
  private String itemOrdNo;
  private int ordItemQuantity;
  private int ordItemTotal;
  FileOperations fops = new FileOperations();


  public Order_Item(String[] itemInfo) {
    ArrayList <String[]> OrderItemList =  fops.searchOperations(itemInfo[0],"Product.txt","Product");
    String[] OrderItemLine;
    for (String[] lines: OrderItemList){
      OrderItemLine = lines;
      super.setprodNo(OrderItemLine[0]);
      super.setprodName(OrderItemLine[1]);
      super.setprodPrice(Integer.parseInt(OrderItemLine[2]));
      super.setprodType(OrderItemLine[3]);
      super.setprodBrand(OrderItemLine[4]);
      super.setprodStock(Integer.parseInt(OrderItemLine[5]));
    }

    this.itemOrdNo = itemInfo[1];

    this.ordItemQuantity = Integer.parseInt(itemInfo[2]);
    if ("Fragile".equals(super.getprodType())){
      this.ordItemTotal = (int) (this.ordItemQuantity*1.05*super.getprodPrice());
    }else{
      this.ordItemTotal = (int) (this.ordItemQuantity*1.02*super.getprodPrice());
      }
  }


  public String[] getFullOrder_Item() {
    String[] FullOrder_ItemInfo = new String[9];
    System.arraycopy(super.getFullProduct(), 0, FullOrder_ItemInfo, 0, 6);
    FullOrder_ItemInfo[6] = itemOrdNo;
    FullOrder_ItemInfo[7] = String.valueOf(ordItemQuantity);
    FullOrder_ItemInfo[8] = String.valueOf(ordItemTotal);
    return FullOrder_ItemInfo;
  }


  public String toString(){
    return "itemOrdNo : "+itemOrdNo+"ordItemQuantity : "+ordItemQuantity+"ordItemTotal : "+ordItemTotal;
  }

  public void setitemOrdNo(String OrdNo) {itemOrdNo=OrdNo;}
  public String getitemOrdNo() {return itemOrdNo;}
  public void setordItemQuantity(int ItemQuantity) {ordItemQuantity=ItemQuantity;}
  public int getordItemQuantity() {return ordItemQuantity;}
  public void setordItemTotal(int ItemTotal) {ordItemTotal=ItemTotal;}
  public int getordItemTotal() {return ordItemTotal;}

}
