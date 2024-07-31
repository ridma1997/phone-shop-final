package model;

import db.Database;
import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductFeatureType implements Serializable, Comparable<ProductFeatureType> {

    private int feature_type;
    private String feature_name;
    private String description;
    private int status;
    public static final int ACTIVE = 1;
    public static final int DEACTIVE = 2;
    private static int color, modelNumber, ram, storage;
    private ArrayList<ProductHasFeatureType> pro_has_feature_type = new ArrayList<>();

    public int getFeature_type() {
        return feature_type;
    }

    public void setFeature_type(int feature_type) {
        this.feature_type = feature_type;
    }

    public String getFeature_name() {
        return feature_name;
    }

    public void setFeature_name(String feature_name) {
        this.feature_name = feature_name;
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

    public static int getACTIVE() {
        return ACTIVE;
    }

    public static int getDEACTIVE() {
        return DEACTIVE;
    }

    public ArrayList<ProductHasFeatureType> getPro_has_feature_type() {
        return pro_has_feature_type;
    }

    public void setPro_has_feature_type(ArrayList<ProductHasFeatureType> pro_has_feature_type) {
        this.pro_has_feature_type = pro_has_feature_type;
    }

    @Override
    public int compareTo(ProductFeatureType t) {
        return 0;
    }

    public static int getColor() {
        try {
            ResultSet rs4 = Database.search("select feature_type_id from product_feature_type where name='color'");
            while (rs4.next()) {
                ProductFeatureType.color= Integer.parseInt(rs4.getString("feature_type_id"));

            }
        } catch (Exception ex) {
            Logger.getLogger(ProductFeatureType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return color;
    }

    public static int getModelNumber() {
        try {
            ResultSet rs3 = Database.search("select feature_type_id from product_feature_type where name='Model No'");
            while (rs3.next()) {
                ProductFeatureType.modelNumber = Integer.parseInt(rs3.getString("feature_type_id"));

            }
        } catch (Exception ex) {
            Logger.getLogger(ProductFeatureType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelNumber;
    }

    public static int getRam() {
        try {
            ResultSet rs1 = Database.search("select feature_type_id from product_feature_type where name='RAM'");
            while (rs1.next()) {
                ProductFeatureType.ram = Integer.parseInt(rs1.getString("feature_type_id"));
            }

        } catch (Exception ex) {
            Logger.getLogger(ProductFeatureType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ram;
    }

    public static int getStorage() {
        try{
        ResultSet rs2 = Database.search("select feature_type_id from product_feature_type where name='Storage'");
            while (rs2.next()) {
                ProductFeatureType.storage= Integer.parseInt(rs2.getString("feature_type_id"));
            }
            }catch(Exception ex){
            Logger.getLogger(ProductFeatureType.class.getName()).log(Level.SEVERE, null, ex);
            }
        return storage;
    }

}
