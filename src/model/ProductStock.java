
package model;


import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

  
public class ProductStock implements Serializable,Comparable<ProductStock>{
    
    private int pro_stk_id;
    private Date in_date;
    private Date out_date;
    private Time time;
    private int qty;
    private Product product; 
    private ArrayList<StockPrice> stock_price=new ArrayList<>();
    
    public static final int AVAILABLE = 1;
    public static final int NOTAVAILABLE = 2;
    public static final int DAMAGED = 3;

   
    public int getPro_stk_id() {
        return pro_stk_id;
    }

    
    public void setPro_stk_id(int pro_stk_id) {
        this.pro_stk_id = pro_stk_id;
    }

    
    public Date getIn_date() {
        return in_date;
    }

    
    public void setIn_date(Date in_date) {
        this.in_date = in_date;
    }

   
    public Date getOut_date() {
        return out_date;
    }

    
    public void setOut_date(Date out_date) {
        this.out_date = out_date;
    }

    
    public Time getTime() {
        return time;
    }

   
    public void setTime(Time time) {
        this.time = time;
    }

   
    public int getQty() {
        return qty;
    }

   
    public void setQty(int qty) {
        this.qty = qty;
    }

   
    public Product getProduct() {
        return product;
    }

   
    public void setProduct(Product product) {
        this.product = product;
    }

   
    public ArrayList<StockPrice> getStock_price() {
        return stock_price;
    }

   
    public void setStock_price(ArrayList<StockPrice> stock_price) {
        this.stock_price = stock_price;
    }

    
    public static int getAVAILABLE() {
        return AVAILABLE;
    }

    
   

    
    public static int getNOTAVAILABLE() {
        return NOTAVAILABLE;
    }

    
   

   
    public static int getDAMAGED() {
        return DAMAGED;
    }

    @Override
    public int compareTo(ProductStock t) {
        return 0;
    }

   
    
    
    
}
