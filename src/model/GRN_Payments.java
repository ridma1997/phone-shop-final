package model;

import java.util.ArrayList;
import java.util.Date;

public class GRN_Payments {

    public static final int COMPLETE = 1;
    public static final int PENDING = 2;

    int grnPaymentID;
    int intallmentsCount;
    int completeInstallmentsCount;
    double totalAmount;
    double nextTotalAmount;
    Date nextPaymentsDate;
    int status;
    GRN grnId;
    ArrayList<GRN_Payments_Installments> installments=new ArrayList<>();
}
