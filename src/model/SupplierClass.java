package model;

public class SupplierClass {

    private String supid;
    private String companyName;
    private String email;
    private String mobile;
    private String addressNo;
    private String addressStreet;
    private String addressCity;
    private String supType;
    public static final int ACTIVE = 1;
    public static final int DEACTIVE = 2;

    /**
     * @return the supid
     */
    public String getSupid() {
        return supid;
    }

    /**
     * @param supid the supid to set
     */
    public void setSupid(String supid) {
        this.supid = supid;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the addressNo
     */
    public String getAddressNo() {
        return addressNo;
    }

    /**
     * @param addressNo the addressNo to set
     */
    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    /**
     * @return the addressStreet
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * @param addressStreet the addressStreet to set
     */
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    /**
     * @return the addressCity
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * @param addressCity the addressCity to set
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * @return the supType
     */
    public String getSupType() {
        return supType;
    }

    /**
     * @param supType the supType to set
     */
    public void setSupType(String supType) {
        this.supType = supType;
    }
   
}
