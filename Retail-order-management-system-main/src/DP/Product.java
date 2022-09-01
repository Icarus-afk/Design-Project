package DP;
import java.util.*;

public class Product {
  protected String prodNo;
  protected String prodName;
  protected int prodPrice;
  protected String prodType;
  private String prodBrand;
  private int prodStock;

  public Product(){}

  public Product(String prodNo, String prodName, int prodPrice, String prodType, String prodBrand, int prodStock){
    this.prodNo = prodNo;
    this.prodName = prodName;
    this.prodPrice = prodPrice;
    this.prodType = prodType;
    this.prodBrand = prodBrand;
    this.prodStock = prodStock;
  }

  public Product(String[] anArray){
    this.prodNo = anArray[0];
    this.prodName = anArray[1];
    this.prodPrice = Integer.parseInt(anArray[2]);
    this.prodType = anArray[3];
    this.prodBrand = anArray[4];
    this.prodStock = Integer.parseInt(anArray[5]);
  }

  public String[] getFullProduct() {
    String[] FullProductInfo = new String[6];
    FullProductInfo[0] = prodNo;
    FullProductInfo[1] = prodName;
    FullProductInfo[2] = String.valueOf(prodPrice);
    FullProductInfo[3] = prodType;
    FullProductInfo[4] = prodBrand;
    FullProductInfo[5] = String.valueOf(prodStock);
    return FullProductInfo;
  }

  public String ToString(){
    return "prodNo : "+prodNo+"prodName : "+prodName+"prodPrice : "+prodPrice+"prodType : "+prodType+"prodBrand : "+prodBrand+"prodStock : "+prodStock;
  }
  public void setprodNo(String No) {prodNo=No;}
  public String getprodNo() {return prodNo;}

  public void setprodName(String Name) {prodName=Name;}
  public String getprodName() {return prodName;}

  public void setprodPrice(int Price) {prodPrice=Price;}
  public int getprodPrice() {return prodPrice;}

  public void setprodType(String Type) {prodType=Type;}
  public String getprodType() {return prodType;}

  public void setprodBrand(String Brand) {prodBrand=Brand;}
  public String getprodBrand() {return prodBrand;}

  public void setprodStock(int Stock) {prodStock=Stock;}
  public int getprodStock() {return prodStock;}
}
