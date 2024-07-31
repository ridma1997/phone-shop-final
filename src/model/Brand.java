
package model;


import java.io.Serializable;
import java.util.ArrayList;


public class Brand implements Serializable,Comparable<Brand>{
    
    private int brand_id;
    private String brand_name;
    private String description;
    private int status;
    private ArrayList<Product> product=new ArrayList<>();
    
    public static final int ACTIVE=1;
    public static final int DEACTIVE=2;

    
    public int getBrand_id() {
        return brand_id;
    }

    
    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    
    public String getBrand_name() {
        return brand_name;
    }

    
    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

        public int getStatus() {
        return status;
    }

    
    public void setStatus(int status) {
        this.status = status;
    }

    
    public ArrayList<Product> getProduct() {
        return product;
    }

    
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    
    public static int getACTIVE() {
        return ACTIVE;
    }

    
    public static int getDEACTIVE() {
        return DEACTIVE;
    }

    @Override
    public int compareTo(Brand t) {
        return 0;
    }

    
         
    
}
