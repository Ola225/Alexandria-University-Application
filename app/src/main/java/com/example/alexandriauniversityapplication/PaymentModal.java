package com.example.alexandriauniversityapplication;

import java.util.ArrayList;
import java.util.Date;

public class PaymentModal {

    private String type;
    private int nofpayements;
    private double total;
    private Date d;
    private static int transactionnumber = 0;

    public void setType(String type) {
        this.type = type;
    }

    public void setNofpayements(int nofpayements) {
        this.nofpayements = nofpayements;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public static void setTransactionnumber(int transactionnumber) {
        PaymentModal.transactionnumber = transactionnumber;
    }

    public void setPayement(ArrayList<PaymentModal> payement) {
        this.payement = payement;
    }

    public String getType() {
        return type;
    }

    public int getNofpayements() {
        return nofpayements;
    }

    public double getTotal() {
        return total;
    }

    public Date getD() {
        return d;
    }

    public static int getTransactionnumber() {
        return transactionnumber;
    }

    public ArrayList<PaymentModal> getPayement() {
        return payement;
    }
    ArrayList<PaymentModal>
            payement = new ArrayList <> ();
    public PaymentModal(){
        this.type = type;
        this.nofpayements = nofpayements;
        this.total = total;
        this.d = new Date ();
        this.transactionnumber = transactionnumber++;
    }
    public PaymentModal(double tot){
        this.total = tot;
        this.d = new Date();
        transactionnumber++;
    }
    public String toString(){
        return("Date: "+d+
                "\n Amount payement: "+total+
                "\n Transaction Number : "+transactionnumber);
    }

}
