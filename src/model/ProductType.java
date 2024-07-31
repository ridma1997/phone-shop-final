package model;

import db.Database;
import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductType implements Serializable, Comparable<ProductType> {

    private int pro_type;
    private String pro_type_name;
    private String description;
    private int status;
    private ArrayList<ProductHasProductType> pro_has_pro_type = new ArrayList<>();

    public static final int ACTIVE = 1;
    public static final int DEACTIVE = 2;
    private static int smartDevice, Accessories, rechargeCard;

    public int getPro_type() {
        return pro_type;
    }

    public void setPro_type(int pro_type) {
        this.pro_type = pro_type;
    }

    public String getPro_type_name() {
        return pro_type_name;
    }

    public void setPro_type_name(String pro_type_name) {
        this.pro_type_name = pro_type_name;
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

    public ArrayList<ProductHasProductType> getPro_has_pro_type() {
        return pro_has_pro_type;
    }

    public void setPro_has_pro_type(ArrayList<ProductHasProductType> pro_has_pro_type) {
        this.pro_has_pro_type = pro_has_pro_type;
    }

    public static int getACTIVE() {
        return ACTIVE;
    }

    public static int getDEACTIVE() {
        return DEACTIVE;
    }

    @Override
    public int compareTo(ProductType t) {
        return 0;
    }

    /**
     * @return the smartDevice
     */
    public static int getSmartDevice() {
        try {
            ResultSet getProductTypeId = Database.search("select pro_type_id from  product_type where name='Smart Device'");
            while (getProductTypeId.next()) {
                ProductType.smartDevice = Integer.parseInt(getProductTypeId.getString("pro_type_id"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return smartDevice;
    }

    /**
     * @return the Accessories
     */
    public static int getAccessories() {
        try {
            ResultSet getProductTypeId = Database.search("select pro_type_id from  product_type where name='Accessories'");
            while (getProductTypeId.next()) {
                ProductType.Accessories = Integer.parseInt(getProductTypeId.getString("pro_type_id"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Accessories;
    }

    /**
     * @return the rechargeCard
     */
    public static int getRechargeCard() {
        try {
            ResultSet getProductTypeId = Database.search("select pro_type_id from  product_type where name='Recharge Card'");
            while (getProductTypeId.next()) {
                ProductType.rechargeCard = Integer.parseInt(getProductTypeId.getString("pro_type_id"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rechargeCard;
    }

}
