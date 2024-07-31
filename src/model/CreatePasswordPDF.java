
package model;

import db.Database;
import java.io.File;
import java.io.PrintWriter;

public class CreatePasswordPDF {
    
    public static File createPasswordFile(String nic)throws Exception{
        File f = new File("C:/MOBSYS/ser/file/"+nic+".txt");
        PrintWriter pw = new PrintWriter(f);
        String pwd = PasswordGenerator.generatePassword();
        pw.println(pwd);
        pw.flush();
        pw.close();
        Database.iud("update employee set password='"+Encryption.passwordEncryption(pwd)+"',status = '"+EmployeeModel.ACTIVE_EMPLOYEE+"' where nic = '"+nic+"'");
        return f;
    
    }
    public static void main(String[] args) throws Exception {
        createPasswordFile("962781241v");
    }
    
    
}
