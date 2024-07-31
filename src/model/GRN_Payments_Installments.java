package model;

import java.util.ArrayList;
import java.util.Date;

public class GRN_Payments_Installments {
    int installmentsId;
    double amount;
    Date actualDate;
    Date expectDate;
    double discount;
//    Employee emp;
    ArrayList<PaymentType> paymentTypes=new ArrayList<>();
}
