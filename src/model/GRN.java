package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class GRN implements Serializable,Comparable<GRN>{

    public static final int COMPLETE=1;
    public static final int PENDING=2;
    public static final int DEACTIVATE=3;
     
    private int grnId;
    private int machineId;
    private Date getDate;
    private Date enterDate;
    private double paidAmount;
    private double totalAmount;
    private double totalDiscount;
    private double netTotal;
    private int status;
    private ArrayList<Object> supplier=new ArrayList<>();
//    Employee employee;
    private ArrayList<Object> grnItems=new ArrayList<>();

    @Override
    public int compareTo(GRN o) {
        return 0;
    }

  
}
