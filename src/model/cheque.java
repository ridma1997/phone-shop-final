package model;

import java.util.Date;

public class cheque {

    public static final int DEACTIVATE_CHECK = 0;
    public static final int ACTIVE_CHECK = 1;
    public static final int RETURN_CHECK = 2;

    int chequeId;
    String chequeNo;
    String bank;
    String type;
    Date issuedDate;
    Date validityStartDate;
    double amount;
    int status;
//    Employee issuedEmp;
//    Employee recievedEmp;
    String issued_purpose;

}
