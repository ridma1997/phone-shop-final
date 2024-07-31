
package model;

import java.io.Serializable;




public class ProductHasFeatureType implements Serializable,Comparable<ProductHasFeatureType>{
    
    private int product_feature_type_id;
    private String value ;
    private int status;
    private static int ACTIVE = 1;
    private static int DEACTIVE = 2;

    
    public int getProduct_feature_type_id() {
        return product_feature_type_id;
    }

    
    public void setProduct_feature_type_id(int product_feature_type_id) {
        this.product_feature_type_id = product_feature_type_id;
    }

   
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

    
    public int getStatus() {
        return status;
    }

    
    public void setStatus(int status) {
        this.status = status;
    }

    
    public static int getACTIVE() {
        return ACTIVE;
    }

    
    public static void setACTIVE(int aACTIVE) {
        ACTIVE = aACTIVE;
    }

    
    public static int getDEACTIVE() {
        return DEACTIVE;
    }

    
    public static void setDEACTIVE(int aDEACTIVE) {
        DEACTIVE = aDEACTIVE;
    }

    @Override
    public int compareTo(ProductHasFeatureType t) {
        return 0;
    }
}
