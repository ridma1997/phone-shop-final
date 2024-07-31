/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ravinath Geethanjana
 */
public class Validation {
    
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 0;

    public static boolean nicPrimaryVal(String nic) {
        boolean b = false;
        if (nic != null & !nic.equals("")) {
            if (nic.length() == 10) {
                String sub = nic.substring(0, 9);
                String letter = nic.substring(9);
                String year = nic.substring(0, 2);
                String dd = nic.substring(2, 5);
                try {
                    int i = Integer.parseInt(sub);
                    if (letter.equals("v") | letter.equals("V") | letter.equals("x") | letter.equals("X")) {
                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
                        String ff = sdf.format(d);
                        int x = Integer.parseInt(ff);
                        int y = Integer.parseInt("19" + year);
                        int z = Integer.parseInt(dd);
                        if (!nic.substring(0, 1).equals("0")) {
                            if ((x - y) >= 16) {
                                if ((z >= 001 & z <= 366) | (z >= 501 & z <= 866)) {
                                    b = true;
                                } else {
                                    b = false;
                                }

                            } else {
                                b = false;
                            }
                        } else {
                            b = false;
                        }

                        //System.out.println(y);
                    } else {
                        b = false;
                    }
                } catch (java.lang.NumberFormatException ex) {
                    b = false;
                } catch (Exception e) {
                    b = false;
                }
                //System.out.println(sub);
            } else if (nic.length() == 12) {
                String year = nic.substring(0, 4);
                String dd = nic.substring(4, 7);
                //System.out.println(year);
                try {
                    long i = Long.parseLong(nic);
                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
                    String ff = sdf.format(d);
                    int x = Integer.parseInt(ff);
                    int y = Integer.parseInt(year);
                    int z = Integer.parseInt(dd);
                    if (nic.substring(0, 1).equals("2")) {
                        if ((x - y) >= 16) {
                            //b = true;
                            if ((z >= 001 & z <= 366) | (z >= 501 & z <= 866)) {
                                b = true;
                            } else {
                                b = false;
                            }

                        } else {
                            b = false;
                        }
                    } else {
                        b = false;
                    }

                    //System.out.println(y);
                } catch (java.lang.NumberFormatException ex) {
                   // ex.printStackTrace();
                    b = false;
                } catch (Exception e) {
                    b = false;
                }

            } else {
                b = false;
            }
        } else {
            b = false;
        }

        return b;
    }

    public static Vector nicSecondaryVal(String nic, Date dob, int gen) {
        Vector v = new Vector();
        String msg = "";
        boolean b = false;
        String gender = "";

        //////////////////////////////////////////////////////////////
        if (dob != null & nic != null & !nic.equals("") & (gen == 1 | gen == 0)) {
            if (gen == 1) {
                gender = "Male";
            } else if (gen == 0) {
                gender = "Female";
            }
            SimpleDateFormat sdf1 = new SimpleDateFormat("DD");
            SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY");

            String dayOfYear = sdf1.format(dob);
            //System.out.println(dayOfYear);
            String year = sdf2.format(dob);

            boolean nicPrimaryVal = nicPrimaryVal(nic);
            if (nicPrimaryVal) {
                boolean check = false;
                String mid = "";
                String y = "";
                int g = 0;

                if (nic.length() == 10) {
                    mid = nic.substring(2, 5);
                    y = "19" + nic.substring(0, 2);
                    check = true;
                } else if (nic.length() == 12) {
                    mid = nic.substring(4, 7);
                    y = nic.substring(0, 4);
                    check = true;
                } else {
                    b = false;
                    msg = "Invalid NIC length";
                }
                if (check) {
                    int yy = Integer.parseInt(y);
                    int m = Integer.parseInt(mid);
                    //System.out.println(yy/4);
                    if (m >= 501) {
                        g = 0;
                        m-=500;
                    } else {
                        g = 1;
                    }
                    if (!(yy % 4 == 0)) {
                        int x = 31 + 28;
                        //System.out.println(m);
                        if (m > x) {
                            m -= 1;
                           // System.out.println(m);
                        }
                    }
                    
                    if (gen == g) {
                        //System.out.println(dayOfYear);
                        if(m == Integer.parseInt(dayOfYear)){
                        
                            b = true;
                            msg = "Succusss";
                        } else {
                           // System.out.println(m+" == "+Integer.parseInt(dayOfYear));
                            b = false;
                            msg = "Date of Birth could not match with NIC";
                        }
                    } else {
                        b = false;
                        msg = "Gender is not match with NIC";
                    }

                }
            } else {
                msg = "Invalid NIC format";
                b = false;
            }
        } else {
            msg = "Empty String , Empty Date or unknown int";
            b = false;
        }
        //////////////////////////////////////////////////////////////
        v.add(b);
        v.add(msg);
        return v;
    }
    
    public static void nicLength(String nic,KeyEvent evt){
        int keyCode = evt.getKeyCode();
        System.out.println(keyCode);
        if(nic.trim().length() == 12){
            evt.consume();
        }
    }

    
    public static void stringVal(String v, java.awt.event.KeyEvent evt) {
        char keyChar = evt.getKeyChar();

        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }

        //System.out.println(keyChar);
    }

    public static void stringValLength(String v, java.awt.event.KeyEvent evt, int l) {
        char keyChar = evt.getKeyChar();
        if (v.length() <= l - 1) {
            if (!Character.isLetter(evt.getKeyChar())) {
                evt.consume();
            }
        } else {
            evt.consume();
        }

        //System.out.println(keyChar);
    }

    public static void numberAndText(String v, java.awt.event.KeyEvent evt) {
        if (!Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public static void numberVal(String v, java.awt.event.KeyEvent evt) {
        char keyChar = evt.getKeyChar();

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }

        //System.out.println(keyChar);
    }

    public static boolean numberValLength(String v, java.awt.event.KeyEvent evt, int l) {
        char keyChar = evt.getKeyChar();
        boolean b = true;
        if (v.length() <= l - 1) {
            if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
            } else {
                b = false;
            }
        } else {
            b = false;
            evt.consume();
        }
        return b;

        //System.out.println(keyChar);
    }

    public static boolean isValidemail(String mail) {
        //boolean x;
        String email = mail;
        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern p = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        return b;

    }

    public static int priceVal(String val, java.awt.event.KeyEvent evt) {
        /*
        if(val.equals(".")){
            evt.consume();
        }
        if(val.contains(".")){
            evt.consume();
        }
         */
        int i = 0;
        int f = 0;
        if (!val.isEmpty()) {
            if (val.substring(0, 1).equals("0")) {
                Integer.parseInt(val.substring(0, 1));
            }
            if (!Character.isDigit(evt.getKeyChar())) {
                // evt.consume();
                if (val.equals(".")) {
                    evt.consume();
                    i = 1;
                }
                if (f == 0) {
                    evt.consume();
                    i = 1;
                } else {
                    if (val.contains(".")) {
                        evt.consume();
                    }
                }

            } else {
            }
        }
        return i;
    }
    
    public static void doubleValidation(String s,java.awt.event.KeyEvent evt){
        try {
            double i = Double.parseDouble(s);
            //System.out.println(i);
        }
        catch(java.lang.NumberFormatException ex){
            evt.consume();
            //System.out.println("error");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //System.out.println(nicPrimaryVal("200087812410"));
        Vector nic = nicSecondaryVal("962781241v", new Date(96, Calendar.OCTOBER, 4), 1);
        System.out.println(nic.get(0));
        System.out.println(nic.get(1));
        System.out.println("× x X ˟");
        //Date date = new Date(96,Calendar.OCTOBER, 04);
        //System.out.println(new SimpleDateFormat("YYYY-MM-dd").format(date));
        //String v = "20962781241v";
        //System.out.println(v.substring(4, 7));

    }

}
