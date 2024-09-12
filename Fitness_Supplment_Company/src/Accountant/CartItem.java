/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accountant;

/**
 *
 * @author USER
 */
public class CartItem {
    private String productname;
    private float unitPrice;
    private  int quantity; 

    public CartItem(String productname, float unitPrice, int quantity) {
        this.productname = productname;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getTotalAmount(){
        float totalAmount =(unitPrice * quantity);
        return totalAmount; 
     
    }
    public void increaseQuantity(int tobeAdded){
        this.quantity += tobeAdded;
    }

    @Override
    public String toString() {
        return  "productname=" + productname + ", unitPrice=" + unitPrice + "BDT" + ", quantity=" + quantity + "Total Amount"+getTotalAmount();
    }
         
}
