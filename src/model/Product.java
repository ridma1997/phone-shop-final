
package model;


import java.io.Serializable;
import java.util.ArrayList;
import model.Brand;
import model.ProductHasFeatureType;
import model.ProductHasProductType;
import model.ProductStock;

public class Product implements Serializable,Comparable<Product>{
    private int pro_id;
    private String name;
    private Brand brand;
    private int status;
    private ArrayList<ProductHasFeatureType> product_has_feature_type=new ArrayList<>();
    private ArrayList<ProductStock> product_stock=new ArrayList<>();
    private ArrayList<ProductHasProductType> product_has_product_type=new ArrayList<>();
    
    public static final int ACTIVE = 1;
    public static final int DEACTIVE = 2;
    
    

    
    public int getpro_Id() {
        return getPro_id();
    }

    
    public void setId(int id) {
        this.setPro_id(id);
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public Brand getBrand() {
        return brand;
    }

    
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    
    public int getStatus() {
        return status;
    }

    
    public void setStatus(int status) {
        this.status = status;
    }

    
    public int getPro_id() {
        return pro_id;
    }

      
    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    
    public ArrayList<ProductHasFeatureType> getProduct_has_feature_type() {
        return product_has_feature_type;
    }

    
    public void setProduct_has_feature_type(ArrayList<ProductHasFeatureType> product_has_feature_type) {
        this.product_has_feature_type = product_has_feature_type;
    }


   
    public ArrayList<ProductStock> getProduct_stock() {
        return product_stock;
    }

    
    public void setProduct_stock(ArrayList<ProductStock> product_stock) {
        this.product_stock = product_stock;
    }

    
    public ArrayList<ProductHasProductType> getProduct_has_product_type() {
        return product_has_product_type;
    }

    
    public void setProduct_has_product_type(ArrayList<ProductHasProductType> product_has_product_type) {
        this.product_has_product_type = product_has_product_type;
    }

    @Override
    public int compareTo(Product t) {
        return 0;
    }
    
    
}
