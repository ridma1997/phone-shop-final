
package model;


import java.io.Serializable;
import java.util.Date;


public class StockPrice implements Serializable,Comparable<StockPrice>{
     private int stock_price_id;
     private Date start_date;
     private Date end_date;
     private int status;
     private ProductStock product_stock;
     private double value;
     
      private static final int ACTIVE = 1;
      private static final int DEACTIVE = 2;
   
    public int getStock_price_id() {
        return stock_price_id;
    }

    
    public void setStock_price_id(int stock_price_id) {
        this.stock_price_id = stock_price_id;
    }

    
    public Date getStart_date() {
        return start_date;
    }

   
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    
    public Date getEnd_date() {
        return end_date;
    }

    
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    
    public int getStatus() {
        return status;
    }

    
    public void setStatus(int status) {
        this.status = status;
    }

   
    public ProductStock getProduct_stock() {
        return product_stock;
    }

    
    public void setProduct_stock(ProductStock product_stock) {
        this.product_stock = product_stock;
    }

    
    public double getValue() {
        return value;
    }

   
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(StockPrice t) {
        return 0;
    }
     
     
}
