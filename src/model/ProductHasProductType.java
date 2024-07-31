
package model;

import java.io.Serializable;




public class ProductHasProductType implements Serializable,Comparable<ProductHasProductType>{
    
    private int pro_has_pro_type_id;
    private ProductType product_type;
    private Product product;

   
    public int getPro_has_pro_type_id() {
        return pro_has_pro_type_id;
    }

    
    public void setPro_has_pro_type_id(int pro_has_pro_type_id) {
        this.pro_has_pro_type_id = pro_has_pro_type_id;
    }

    
    public ProductType getProduct_type() {
        return product_type;
    }

    
    public void setProduct_type(ProductType product_type) {
        this.product_type = product_type;
    }

    
    public Product getProduct() {
        return product;
    }

   
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int compareTo(ProductHasProductType t) {
        return 0;
    }
    
    
}
