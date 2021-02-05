package packageCA_Event_Option_Term;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;  // Import the IOException class to handle errors


public class ClassCA_Event_Option_Term {


public  void methodCA_EVENT_optionTerm(String Arg_DB_endpoint,String Arg_port,String Arg_DB_SID,String Arg_DB_uname,String Arg_DB_password,String Arg_Event_num) throws SQLException, IOException{



String DB_endpoint= Arg_DB_endpoint;
     String port= Arg_port;
     String DB_SID= Arg_DB_SID;
     String DB_uname= Arg_DB_uname;
     String DB_password= Arg_DB_password;
     String Event_num = Arg_Event_num;
     
     String sql   = "select  ACCOUNT_NUM,ACTIVE_STATUS,ARCHIVAL_STATUS,ASSET_ID,CHARGES_ACCOUNT,CLASSIFICATION_TYPE_CFI_CODE,CLASSIFICATION_TYPE_CODE,COIN_COUNTRY_CODE_E1,COIN_COUNTRY_CODE_E2,COMMON_GROUPING_ATT,CONTRACTUAL_PAYMENT_IND,CONTRACT_SIZE_QTY,CONTRACT_SIZE_QTY_CODE,CONTRACT_SIZE_QTY_FORMAT,CONTRACT_SIZE_QTY_TYPE,CREATION_CONFIG_FLAG,CREDIT_DEBIT_IND,CURRENCY_OF_DENOM,CURRENCY_OPTION,DISP_OF_FRACTIONS_IND,ENTITLED_QTY_AMORTISED_VALUE,ENTITLED_QTY_FACE_AMOUNT,ENTITLED_QTY_UNITS,ENTITY_TYPE,ETYP_CASH_DISPLAY,ETYP_CASH_DSS,ETYP_CASH_FORMAT,ETYP_CASH_IND,ETYP_CASH_MULTIPLE_IND_FLAG,ETYP_IND,ETYP_SEC_DISPLAY,ETYP_SEC_DSS,ETYP_SEC_FORMAT,ETYP_SEC_IND,ETYP_SEC_MULTIPLE_IND_FLAG,EVENT_NUM,EXEMPTION_TYPE_IND,FLOW_ID,INBOX_ID,INCOME_TYPE_IND,ISSUER_OFFERER_TAXABILITY_IND,ISSUER_OFFEROR_TAXABILITY_IND,IS_DELETED,ITYP_CASH_DISPLAY,ITYP_CASH_DSS,ITYP_CASH_FORMAT,ITYP_CASH_IND,ITYP_IND,ITYP_SEC_DISPLAY,ITYP_SEC_DSS,ITYP_SEC_FORMAT,ITYP_SEC_IND,LISTING_ID,MASTER_TERM_SEQUENCE_NUMBER,MICO_IND,MIN_EX_MULTIPLE_QTY,MIN_EX_MULTIPLE_QTY_CODE,MIN_EX_MULTIPLE_QTY_FORMAT,MIN_EX_MULTIPLE_QTY_TYPE,MIN_EX_QTY,MIN_EX_QTY_CODE,MIN_EX_QTY_FORMAT,MIN_EX_QTY_TYPE,MIN_NOMINAL_QTY,MIN_NOMINAL_QTY_CODE,MIN_NOMINAL_QTY_FORMAT,MIN_NOMINAL_QTY_TYPE,MOVEMENT_SECURITY_DESCRIPTION,MOVEMENT_SECURITY_ID,MOVEMENT_TYPE,NEW_SECURITIES_IND,NON_ELIGIBLE_PROCEEDS_IND,OPTION_SEQUENCE_NUM,OPTION_STYLE,OPTION_TERM_DISPLAY_ORDER,OVERALL_STATUS,PLIS,PLIS_NARRATIVE,PRIORITY,PSTA_AMOR_QUANTITY,PSTA_AMOUNT,PSTA_FAMT_QUANTITY,PSTA_UNIT_QUANTITY,READY_FOR_ARCHIVAL_DATE,SAFE_PLACE_COUNTRY_CODE,SAFE_PLACE_DISPLAY,SAFE_PLACE_FORMAT_TYPE,SAFE_PLACE_IDENTIFIER_CODE,SAFE_PLACE_NARRATIVE,SAFE_PLACE_PLACE_CODE,SECURITY_ID_TYPE,SOFT_LOCK_KEY,SYSTEM_TERM,SYS_ENTRY_DATE,TAX_ACCOUNT,TAX_VOUCHER_REFERENCE,TEMP_IND,TERM_SEQUENCE_NUM,TXAP_CASH_DISPLAY,TXAP_CASH_DSS,TXAP_CASH_FORMAT,TXAP_CASH_IND,TXAP_CASH_SWIFT_IND,TXAP_SEC_DISPLAY,TXAP_SEC_DSS,TXAP_SEC_FORMAT,TXAP_SEC_IND,TXAP_SEC_SWIFT_IND  from CA_EVENT_OPTION_TERM where event_num in (select event_num from ca_Event where master_id in ( Select master_id from ca_event where event_num='"+Event_num+"'))" ;
     
     
     
     // Get SQL from the flat file named "sqlfile"
     System.out.println(sql);
       
     try {
     Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} 
     
     FileWriter myWriter;

myWriter = new FileWriter(System.getProperty("user.dir")+"\\"+Event_num+"CA_Event_Option_Term.csv");
myWriter.write("ACCOUNT_NUM,ACTIVE_STATUS,ARCHIVAL_STATUS,ASSET_ID,CHARGES_ACCOUNT,CLASSIFICATION_TYPE_CFI_CODE,CLASSIFICATION_TYPE_CODE,COIN_COUNTRY_CODE_E1,COIN_COUNTRY_CODE_E2,COMMON_GROUPING_ATT,CONTRACTUAL_PAYMENT_IND,CONTRACT_SIZE_QTY,CONTRACT_SIZE_QTY_CODE,CONTRACT_SIZE_QTY_FORMAT,CONTRACT_SIZE_QTY_TYPE,CREATION_CONFIG_FLAG,CREDIT_DEBIT_IND,CURRENCY_OF_DENOM,CURRENCY_OPTION,DISP_OF_FRACTIONS_IND,ENTITLED_QTY_AMORTISED_VALUE,ENTITLED_QTY_FACE_AMOUNT,ENTITLED_QTY_UNITS,ENTITY_TYPE,ETYP_CASH_DISPLAY,ETYP_CASH_DSS,ETYP_CASH_FORMAT,ETYP_CASH_IND,ETYP_CASH_MULTIPLE_IND_FLAG,ETYP_IND,ETYP_SEC_DISPLAY,ETYP_SEC_DSS,ETYP_SEC_FORMAT,ETYP_SEC_IND,ETYP_SEC_MULTIPLE_IND_FLAG,EVENT_NUM,EXEMPTION_TYPE_IND,FLOW_ID,INBOX_ID,INCOME_TYPE_IND,ISSUER_OFFERER_TAXABILITY_IND,ISSUER_OFFEROR_TAXABILITY_IND,IS_DELETED,ITYP_CASH_DISPLAY,ITYP_CASH_DSS,ITYP_CASH_FORMAT,ITYP_CASH_IND,ITYP_IND,ITYP_SEC_DISPLAY,ITYP_SEC_DSS,ITYP_SEC_FORMAT,ITYP_SEC_IND,LISTING_ID,MASTER_TERM_SEQUENCE_NUMBER,MICO_IND,MIN_EX_MULTIPLE_QTY,MIN_EX_MULTIPLE_QTY_CODE,MIN_EX_MULTIPLE_QTY_FORMAT,MIN_EX_MULTIPLE_QTY_TYPE,MIN_EX_QTY,MIN_EX_QTY_CODE,MIN_EX_QTY_FORMAT,MIN_EX_QTY_TYPE,MIN_NOMINAL_QTY,MIN_NOMINAL_QTY_CODE,MIN_NOMINAL_QTY_FORMAT,MIN_NOMINAL_QTY_TYPE,MOVEMENT_SECURITY_DESCRIPTION,MOVEMENT_SECURITY_ID,MOVEMENT_TYPE,NEW_SECURITIES_IND,NON_ELIGIBLE_PROCEEDS_IND,OPTION_SEQUENCE_NUM,OPTION_STYLE,OPTION_TERM_DISPLAY_ORDER,OVERALL_STATUS,PLIS,PLIS_NARRATIVE,PRIORITY,PSTA_AMOR_QUANTITY,PSTA_AMOUNT,PSTA_FAMT_QUANTITY,PSTA_UNIT_QUANTITY,READY_FOR_ARCHIVAL_DATE,SAFE_PLACE_COUNTRY_CODE,SAFE_PLACE_DISPLAY,SAFE_PLACE_FORMAT_TYPE,SAFE_PLACE_IDENTIFIER_CODE,SAFE_PLACE_NARRATIVE,SAFE_PLACE_PLACE_CODE,SECURITY_ID_TYPE,SOFT_LOCK_KEY,SYSTEM_TERM,SYS_ENTRY_DATE,TAX_ACCOUNT,TAX_VOUCHER_REFERENCE,TEMP_IND,TERM_SEQUENCE_NUM,TXAP_CASH_DISPLAY,TXAP_CASH_DSS,TXAP_CASH_FORMAT,TXAP_CASH_IND,TXAP_CASH_SWIFT_IND,TXAP_SEC_DISPLAY,TXAP_SEC_DSS,TXAP_SEC_FORMAT,TXAP_SEC_IND,TXAP_SEC_SWIFT_IND \n");

     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//"+DB_endpoint+":"+port+"/"+DB_SID+"", ""+DB_uname+"", ""+DB_password+""); 
     Statement stmt = con.createStatement(); 
     ResultSet rs = stmt.executeQuery(sql);
    
     while(rs.next()){
         //Retrieve by column name
     
     String ACCOUNT_NUM =  rs.getString("ACCOUNT_NUM");
     int ACTIVE_STATUS =  rs.getInt("ACTIVE_STATUS");
     int ARCHIVAL_STATUS =  rs.getInt("ARCHIVAL_STATUS");
     int ASSET_ID =  rs.getInt("ASSET_ID");
     String CHARGES_ACCOUNT =  rs.getString("CHARGES_ACCOUNT");
     String CLASSIFICATION_TYPE_CFI_CODE =  rs.getString("CLASSIFICATION_TYPE_CFI_CODE");
     String CLASSIFICATION_TYPE_CODE =  rs.getString("CLASSIFICATION_TYPE_CODE");
     int COIN_COUNTRY_CODE_E1 =  rs.getInt("COIN_COUNTRY_CODE_E1");
     int COIN_COUNTRY_CODE_E2 =  rs.getInt("COIN_COUNTRY_CODE_E2");
     String COMMON_GROUPING_ATT =  rs.getString("COMMON_GROUPING_ATT");
     int CONTRACTUAL_PAYMENT_IND =  rs.getInt("CONTRACTUAL_PAYMENT_IND");
     int CONTRACT_SIZE_QTY =  rs.getInt("CONTRACT_SIZE_QTY");
     int CONTRACT_SIZE_QTY_CODE =  rs.getInt("CONTRACT_SIZE_QTY_CODE");
     int CONTRACT_SIZE_QTY_FORMAT =  rs.getInt("CONTRACT_SIZE_QTY_FORMAT");
     int CONTRACT_SIZE_QTY_TYPE =  rs.getInt("CONTRACT_SIZE_QTY_TYPE");
     int CREATION_CONFIG_FLAG =  rs.getInt("CREATION_CONFIG_FLAG");
     int CREDIT_DEBIT_IND =  rs.getInt("CREDIT_DEBIT_IND");
     int CURRENCY_OF_DENOM =  rs.getInt("CURRENCY_OF_DENOM");
     int CURRENCY_OPTION =  rs.getInt("CURRENCY_OPTION");
     int DISP_OF_FRACTIONS_IND =  rs.getInt("DISP_OF_FRACTIONS_IND");
     int ENTITLED_QTY_AMORTISED_VALUE =  rs.getInt("ENTITLED_QTY_AMORTISED_VALUE");
     int ENTITLED_QTY_FACE_AMOUNT =  rs.getInt("ENTITLED_QTY_FACE_AMOUNT");
     int ENTITLED_QTY_UNITS =  rs.getInt("ENTITLED_QTY_UNITS");
     int ENTITY_TYPE =  rs.getInt("ENTITY_TYPE");
     String ETYP_CASH_DISPLAY =  rs.getString("ETYP_CASH_DISPLAY");
     String ETYP_CASH_DSS =  rs.getString("ETYP_CASH_DSS");
     int ETYP_CASH_FORMAT =  rs.getInt("ETYP_CASH_FORMAT");
     String ETYP_CASH_IND =  rs.getString("ETYP_CASH_IND");
     String ETYP_CASH_MULTIPLE_IND_FLAG =  rs.getString("ETYP_CASH_MULTIPLE_IND_FLAG");
     int ETYP_IND =  rs.getInt("ETYP_IND");
     String ETYP_SEC_DISPLAY =  rs.getString("ETYP_SEC_DISPLAY");
     String ETYP_SEC_DSS =  rs.getString("ETYP_SEC_DSS");
     int ETYP_SEC_FORMAT =  rs.getInt("ETYP_SEC_FORMAT");
     String ETYP_SEC_IND =  rs.getString("ETYP_SEC_IND");
     String ETYP_SEC_MULTIPLE_IND_FLAG =  rs.getString("ETYP_SEC_MULTIPLE_IND_FLAG");
     int EVENT_NUM =  rs.getInt("EVENT_NUM");
     int EXEMPTION_TYPE_IND =  rs.getInt("EXEMPTION_TYPE_IND");
     int FLOW_ID =  rs.getInt("FLOW_ID");
     int INBOX_ID =  rs.getInt("INBOX_ID");
     int INCOME_TYPE_IND =  rs.getInt("INCOME_TYPE_IND");
     int ISSUER_OFFERER_TAXABILITY_IND =  rs.getInt("ISSUER_OFFERER_TAXABILITY_IND");
     int ISSUER_OFFEROR_TAXABILITY_IND =  rs.getInt("ISSUER_OFFEROR_TAXABILITY_IND");
     String IS_DELETED =  rs.getString("IS_DELETED");
     String ITYP_CASH_DISPLAY =  rs.getString("ITYP_CASH_DISPLAY");
     String ITYP_CASH_DSS =  rs.getString("ITYP_CASH_DSS");
     int ITYP_CASH_FORMAT =  rs.getInt("ITYP_CASH_FORMAT");
     String ITYP_CASH_IND =  rs.getString("ITYP_CASH_IND");
     int ITYP_IND =  rs.getInt("ITYP_IND");
     String ITYP_SEC_DISPLAY =  rs.getString("ITYP_SEC_DISPLAY");
     String ITYP_SEC_DSS =  rs.getString("ITYP_SEC_DSS");
     int ITYP_SEC_FORMAT =  rs.getInt("ITYP_SEC_FORMAT");
     String ITYP_SEC_IND =  rs.getString("ITYP_SEC_IND");
     int LISTING_ID =  rs.getInt("LISTING_ID");
     int MASTER_TERM_SEQUENCE_NUMBER =  rs.getInt("MASTER_TERM_SEQUENCE_NUMBER");
     int MICO_IND =  rs.getInt("MICO_IND");
     int MIN_EX_MULTIPLE_QTY =  rs.getInt("MIN_EX_MULTIPLE_QTY");
     int MIN_EX_MULTIPLE_QTY_CODE =  rs.getInt("MIN_EX_MULTIPLE_QTY_CODE");
     int MIN_EX_MULTIPLE_QTY_FORMAT =  rs.getInt("MIN_EX_MULTIPLE_QTY_FORMAT");
     int MIN_EX_MULTIPLE_QTY_TYPE =  rs.getInt("MIN_EX_MULTIPLE_QTY_TYPE");
     int MIN_EX_QTY =  rs.getInt("MIN_EX_QTY");
     int MIN_EX_QTY_CODE =  rs.getInt("MIN_EX_QTY_CODE");
     int MIN_EX_QTY_FORMAT =  rs.getInt("MIN_EX_QTY_FORMAT");
     int MIN_EX_QTY_TYPE =  rs.getInt("MIN_EX_QTY_TYPE");
     int MIN_NOMINAL_QTY =  rs.getInt("MIN_NOMINAL_QTY");
     int MIN_NOMINAL_QTY_CODE =  rs.getInt("MIN_NOMINAL_QTY_CODE");
     int MIN_NOMINAL_QTY_FORMAT =  rs.getInt("MIN_NOMINAL_QTY_FORMAT");
     int MIN_NOMINAL_QTY_TYPE =  rs.getInt("MIN_NOMINAL_QTY_TYPE");
     String MOVEMENT_SECURITY_DESCRIPTION =  rs.getString("MOVEMENT_SECURITY_DESCRIPTION");
    	if (MOVEMENT_SECURITY_DESCRIPTION != null)
    		{
    		String temp=MOVEMENT_SECURITY_DESCRIPTION.substring(0, 15);
    		MOVEMENT_SECURITY_DESCRIPTION=temp;
    		}
     
     String MOVEMENT_SECURITY_ID =  rs.getString("MOVEMENT_SECURITY_ID");
     int MOVEMENT_TYPE =  rs.getInt("MOVEMENT_TYPE");
     int NEW_SECURITIES_IND =  rs.getInt("NEW_SECURITIES_IND");
     int NON_ELIGIBLE_PROCEEDS_IND =  rs.getInt("NON_ELIGIBLE_PROCEEDS_IND");
     int OPTION_SEQUENCE_NUM =  rs.getInt("OPTION_SEQUENCE_NUM");
     int OPTION_STYLE =  rs.getInt("OPTION_STYLE");
     int OPTION_TERM_DISPLAY_ORDER =  rs.getInt("OPTION_TERM_DISPLAY_ORDER");
     int OVERALL_STATUS =  rs.getInt("OVERALL_STATUS");
     int PLIS =  rs.getInt("PLIS");
     String PLIS_NARRATIVE =  rs.getString("PLIS_NARRATIVE");
     int PRIORITY =  rs.getInt("PRIORITY");
     int PSTA_AMOR_QUANTITY =  rs.getInt("PSTA_AMOR_QUANTITY");
     String PSTA_AMOUNT =  rs.getString("PSTA_AMOUNT");
     int PSTA_FAMT_QUANTITY =  rs.getInt("PSTA_FAMT_QUANTITY");
     int PSTA_UNIT_QUANTITY =  rs.getInt("PSTA_UNIT_QUANTITY");
     String READY_FOR_ARCHIVAL_DATE =  rs.getString("READY_FOR_ARCHIVAL_DATE");
     int SAFE_PLACE_COUNTRY_CODE =  rs.getInt("SAFE_PLACE_COUNTRY_CODE");
     String SAFE_PLACE_DISPLAY =  rs.getString("SAFE_PLACE_DISPLAY");
     int SAFE_PLACE_FORMAT_TYPE =  rs.getInt("SAFE_PLACE_FORMAT_TYPE");
     String SAFE_PLACE_IDENTIFIER_CODE =  rs.getString("SAFE_PLACE_IDENTIFIER_CODE");
     String SAFE_PLACE_NARRATIVE =  rs.getString("SAFE_PLACE_NARRATIVE");
     int SAFE_PLACE_PLACE_CODE =  rs.getInt("SAFE_PLACE_PLACE_CODE");
     int SECURITY_ID_TYPE =  rs.getInt("SECURITY_ID_TYPE");
     int SOFT_LOCK_KEY =  rs.getInt("SOFT_LOCK_KEY");
     String SYSTEM_TERM =  rs.getString("SYSTEM_TERM");
     String SYS_ENTRY_DATE =  rs.getString("SYS_ENTRY_DATE");
     String TAX_ACCOUNT =  rs.getString("TAX_ACCOUNT");
     String TAX_VOUCHER_REFERENCE =  rs.getString("TAX_VOUCHER_REFERENCE");
     int TEMP_IND =  rs.getInt("TEMP_IND");
     int TERM_SEQUENCE_NUM =  rs.getInt("TERM_SEQUENCE_NUM");
     String TXAP_CASH_DISPLAY =  rs.getString("TXAP_CASH_DISPLAY");
     String TXAP_CASH_DSS =  rs.getString("TXAP_CASH_DSS");
     int TXAP_CASH_FORMAT =  rs.getInt("TXAP_CASH_FORMAT");
     String TXAP_CASH_IND =  rs.getString("TXAP_CASH_IND");
     int TXAP_CASH_SWIFT_IND =  rs.getInt("TXAP_CASH_SWIFT_IND");
     String TXAP_SEC_DISPLAY =  rs.getString("TXAP_SEC_DISPLAY");
     String TXAP_SEC_DSS =  rs.getString("TXAP_SEC_DSS");
     int TXAP_SEC_FORMAT =  rs.getInt("TXAP_SEC_FORMAT");
     String TXAP_SEC_IND =  rs.getString("TXAP_SEC_IND");
     int TXAP_SEC_SWIFT_IND =  rs.getInt("TXAP_SEC_SWIFT_IND");

    
  myWriter.write(ACCOUNT_NUM+","+ACTIVE_STATUS+","+ARCHIVAL_STATUS+","+ASSET_ID+","+CHARGES_ACCOUNT+","+CLASSIFICATION_TYPE_CFI_CODE+","+CLASSIFICATION_TYPE_CODE+","+COIN_COUNTRY_CODE_E1+","+COIN_COUNTRY_CODE_E2+","+COMMON_GROUPING_ATT+","+CONTRACTUAL_PAYMENT_IND+","+CONTRACT_SIZE_QTY+","+CONTRACT_SIZE_QTY_CODE+","+CONTRACT_SIZE_QTY_FORMAT+","+CONTRACT_SIZE_QTY_TYPE+","+CREATION_CONFIG_FLAG+","+CREDIT_DEBIT_IND+","+CURRENCY_OF_DENOM+","+CURRENCY_OPTION+","+DISP_OF_FRACTIONS_IND+","+ENTITLED_QTY_AMORTISED_VALUE+","+ENTITLED_QTY_FACE_AMOUNT+","+ENTITLED_QTY_UNITS+","+ENTITY_TYPE+","+ETYP_CASH_DISPLAY+","+ETYP_CASH_DSS+","+ETYP_CASH_FORMAT+","+ETYP_CASH_IND+","+ETYP_CASH_MULTIPLE_IND_FLAG+","+ETYP_IND+","+ETYP_SEC_DISPLAY+","+ETYP_SEC_DSS+","+ETYP_SEC_FORMAT+","+ETYP_SEC_IND+","+ETYP_SEC_MULTIPLE_IND_FLAG+","+EVENT_NUM+","+EXEMPTION_TYPE_IND+","+FLOW_ID+","+INBOX_ID+","+INCOME_TYPE_IND+","+ISSUER_OFFERER_TAXABILITY_IND+","+ISSUER_OFFEROR_TAXABILITY_IND+","+IS_DELETED+","+ITYP_CASH_DISPLAY+","+ITYP_CASH_DSS+","+ITYP_CASH_FORMAT+","+ITYP_CASH_IND+","+ITYP_IND+","+ITYP_SEC_DISPLAY+","+ITYP_SEC_DSS+","+ITYP_SEC_FORMAT+","+ITYP_SEC_IND+","+LISTING_ID+","+MASTER_TERM_SEQUENCE_NUMBER+","+MICO_IND+","+MIN_EX_MULTIPLE_QTY+","+MIN_EX_MULTIPLE_QTY_CODE+","+MIN_EX_MULTIPLE_QTY_FORMAT+","+MIN_EX_MULTIPLE_QTY_TYPE+","+MIN_EX_QTY+","+MIN_EX_QTY_CODE+","+MIN_EX_QTY_FORMAT+","+MIN_EX_QTY_TYPE+","+MIN_NOMINAL_QTY+","+MIN_NOMINAL_QTY_CODE+","+MIN_NOMINAL_QTY_FORMAT+","+MIN_NOMINAL_QTY_TYPE+","+MOVEMENT_SECURITY_DESCRIPTION+","+MOVEMENT_SECURITY_ID+","+MOVEMENT_TYPE+","+NEW_SECURITIES_IND+","+NON_ELIGIBLE_PROCEEDS_IND+","+OPTION_SEQUENCE_NUM+","+OPTION_STYLE+","+OPTION_TERM_DISPLAY_ORDER+","+OVERALL_STATUS+","+PLIS+","+PLIS_NARRATIVE+","+PRIORITY+","+PSTA_AMOR_QUANTITY+","+PSTA_AMOUNT+","+PSTA_FAMT_QUANTITY+","+PSTA_UNIT_QUANTITY+","+READY_FOR_ARCHIVAL_DATE+","+SAFE_PLACE_COUNTRY_CODE+","+SAFE_PLACE_DISPLAY+","+SAFE_PLACE_FORMAT_TYPE+","+SAFE_PLACE_IDENTIFIER_CODE+","+SAFE_PLACE_NARRATIVE+","+SAFE_PLACE_PLACE_CODE+","+SECURITY_ID_TYPE+","+SOFT_LOCK_KEY+","+SYSTEM_TERM+","+SYS_ENTRY_DATE+","+TAX_ACCOUNT+","+TAX_VOUCHER_REFERENCE+","+TEMP_IND+","+TERM_SEQUENCE_NUM+","+TXAP_CASH_DISPLAY+","+TXAP_CASH_DSS+","+TXAP_CASH_FORMAT+","+TXAP_CASH_IND+","+TXAP_CASH_SWIFT_IND+","+TXAP_SEC_DISPLAY+","+TXAP_SEC_DSS+","+TXAP_SEC_FORMAT+","+TXAP_SEC_IND+","+TXAP_SEC_SWIFT_IND +"\n");
     
     System.out.println(ACCOUNT_NUM+","+ACTIVE_STATUS+","+ARCHIVAL_STATUS+","+ASSET_ID+","+CHARGES_ACCOUNT+","+CLASSIFICATION_TYPE_CFI_CODE+","+CLASSIFICATION_TYPE_CODE+","+COIN_COUNTRY_CODE_E1+","+COIN_COUNTRY_CODE_E2+","+COMMON_GROUPING_ATT+","+CONTRACTUAL_PAYMENT_IND+","+CONTRACT_SIZE_QTY+","+CONTRACT_SIZE_QTY_CODE+","+CONTRACT_SIZE_QTY_FORMAT+","+CONTRACT_SIZE_QTY_TYPE+","+CREATION_CONFIG_FLAG+","+CREDIT_DEBIT_IND+","+CURRENCY_OF_DENOM+","+CURRENCY_OPTION+","+DISP_OF_FRACTIONS_IND+","+ENTITLED_QTY_AMORTISED_VALUE+","+ENTITLED_QTY_FACE_AMOUNT+","+ENTITLED_QTY_UNITS+","+ENTITY_TYPE+","+ETYP_CASH_DISPLAY+","+ETYP_CASH_DSS+","+ETYP_CASH_FORMAT+","+ETYP_CASH_IND+","+ETYP_CASH_MULTIPLE_IND_FLAG+","+ETYP_IND+","+ETYP_SEC_DISPLAY+","+ETYP_SEC_DSS+","+ETYP_SEC_FORMAT+","+ETYP_SEC_IND+","+ETYP_SEC_MULTIPLE_IND_FLAG+","+EVENT_NUM+","+EXEMPTION_TYPE_IND+","+FLOW_ID+","+INBOX_ID+","+INCOME_TYPE_IND+","+ISSUER_OFFERER_TAXABILITY_IND+","+ISSUER_OFFEROR_TAXABILITY_IND+","+IS_DELETED+","+ITYP_CASH_DISPLAY+","+ITYP_CASH_DSS+","+ITYP_CASH_FORMAT+","+ITYP_CASH_IND+","+ITYP_IND+","+ITYP_SEC_DISPLAY+","+ITYP_SEC_DSS+","+ITYP_SEC_FORMAT+","+ITYP_SEC_IND+","+LISTING_ID+","+MASTER_TERM_SEQUENCE_NUMBER+","+MICO_IND+","+MIN_EX_MULTIPLE_QTY+","+MIN_EX_MULTIPLE_QTY_CODE+","+MIN_EX_MULTIPLE_QTY_FORMAT+","+MIN_EX_MULTIPLE_QTY_TYPE+","+MIN_EX_QTY+","+MIN_EX_QTY_CODE+","+MIN_EX_QTY_FORMAT+","+MIN_EX_QTY_TYPE+","+MIN_NOMINAL_QTY+","+MIN_NOMINAL_QTY_CODE+","+MIN_NOMINAL_QTY_FORMAT+","+MIN_NOMINAL_QTY_TYPE+","+MOVEMENT_SECURITY_DESCRIPTION+","+MOVEMENT_SECURITY_ID+","+MOVEMENT_TYPE+","+NEW_SECURITIES_IND+","+NON_ELIGIBLE_PROCEEDS_IND+","+OPTION_SEQUENCE_NUM+","+OPTION_STYLE+","+OPTION_TERM_DISPLAY_ORDER+","+OVERALL_STATUS+","+PLIS+","+PLIS_NARRATIVE+","+PRIORITY+","+PSTA_AMOR_QUANTITY+","+PSTA_AMOUNT+","+PSTA_FAMT_QUANTITY+","+PSTA_UNIT_QUANTITY+","+READY_FOR_ARCHIVAL_DATE+","+SAFE_PLACE_COUNTRY_CODE+","+SAFE_PLACE_DISPLAY+","+SAFE_PLACE_FORMAT_TYPE+","+SAFE_PLACE_IDENTIFIER_CODE+","+SAFE_PLACE_NARRATIVE+","+SAFE_PLACE_PLACE_CODE+","+SECURITY_ID_TYPE+","+SOFT_LOCK_KEY+","+SYSTEM_TERM+","+SYS_ENTRY_DATE+","+TAX_ACCOUNT+","+TAX_VOUCHER_REFERENCE+","+TEMP_IND+","+TERM_SEQUENCE_NUM+","+TXAP_CASH_DISPLAY+","+TXAP_CASH_DSS+","+TXAP_CASH_FORMAT+","+TXAP_CASH_IND+","+TXAP_CASH_SWIFT_IND+","+TXAP_SEC_DISPLAY+","+TXAP_SEC_DSS+","+TXAP_SEC_FORMAT+","+TXAP_SEC_IND+","+TXAP_SEC_SWIFT_IND+ "\n");

      }
      rs.close();
      stmt.close();
      con.close();
      myWriter.close();
      System.out.println("Successfully executed");
}


}