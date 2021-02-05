package codeBase;



import java.io.IOException;
import java.sql.SQLException;

import packageCA_Event_Option_Date.*;
import packageCA_Event_Option_Price.ClassCA_Event_Option_Price;
import packageCA_Event_Option_Rate.ClassCA_Event_Option_Rate;
import packageCA_Event_Option_Term.ClassCA_Event_Option_Term;
import packageCA_Event_Option_Term_Amount.ClassCA_Event_Option_Term_Amount;
import packageCA_Event_Option_Term_Date.ClassCA_Event_Option_Term_Date;
import packageCA_Event_Option_Term_Period.ClassCA_Event_Option_Term_Period;
import packageCA_Event_Option_Term_Price.ClassCA_Event_Option_Term_Price;
import packageCA_Event_Option_Term_Rate.ClassCA_Event_Option_Term_Rate;
import packageCA_Event.*;
import packageCA_Event_Option.ClassCA_Event_Option;



public class ClassBase {

public static void main(String[] args) throws SQLException, IOException {
// TODO Auto-generated method stub

	System.out.println("Files will be saved in " + System.getProperty("user.dir"));
	
/*	String DB_endpoint= "aia-cas-uat.chxy2zmicoex.ap-southeast-1.rds.amazonaws.com";
    String port= "1521";
    String DB_SID= "CAS";
    String DB_uname= "tlm_dbo";
    String DB_password= "password";
    String Event_num = "29686"; */
	
	String DB_endpoint= args[0];
    String port= args[1];
    String DB_SID= args[2];
    String DB_uname= args[3];
    String DB_password= args[4];
    String Event_num = args[5];
	
    
    
         ClassCA_Event ce =new ClassCA_Event();
         ce.methodCA_EVENT(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option CEO =new ClassCA_Event_Option();
         CEO.methodCA_EVENTOption(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option_Date cd=new ClassCA_Event_Option_Date();
         cd.methodCA_Event_date(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option_Price CEOP = new ClassCA_Event_Option_Price();
         CEOP.methodCA_EVENT_optionPrice(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option_Rate CEOR =new ClassCA_Event_Option_Rate();
         CEOR.methodCA_Event_option_rate(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);       
      
         ClassCA_Event_Option_Term CEOT = new ClassCA_Event_Option_Term();
         CEOT.methodCA_EVENT_optionTerm(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
       
         ClassCA_Event_Option_Term_Amount CEOTA = new ClassCA_Event_Option_Term_Amount();
         CEOTA.methodCA_EVENTOptionTermAmount(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option_Term_Date CEOTD= new ClassCA_Event_Option_Term_Date();
         CEOTD.methodCA_EVENTOptionTermDate(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option_Term_Period CEOTPE =  new ClassCA_Event_Option_Term_Period();
         CEOTPE.methodCA_Event_Option_Term_Period(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option_Term_Price CEOTPR= new ClassCA_Event_Option_Term_Price();
         CEOTPR.methodCA_Event_Option_Term_Price(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
         
         ClassCA_Event_Option_Term_Rate CEOTR=new ClassCA_Event_Option_Term_Rate();
         CEOTR.methodCA_Event_Option_Term_Rate(DB_endpoint,port,DB_SID,DB_uname,DB_password,Event_num);
      
}

}
