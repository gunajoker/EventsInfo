package packageCA_Event_Option_Term_Price;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;  // Import the IOException class to handle errors

public class ClassCA_Event_Option_Term_Price {
	public  void methodCA_Event_Option_Term_Price(String Arg_DB_endpoint,String Arg_port,String Arg_DB_SID,String Arg_DB_uname,String Arg_DB_password,String Arg_Event_num) throws SQLException, IOException{
		
		
		
		String DB_endpoint= Arg_DB_endpoint;
	     String port= Arg_port;
	     String DB_SID= Arg_DB_SID;
	     String DB_uname= Arg_DB_uname;
	     String DB_password= Arg_DB_password;
	     String Event_num = Arg_Event_num;
	     
	     String sql   = "select ACTIVE_STATUS,	ARCHIVAL_STATUS,	CAVA_AMOUNT_TYPE,	CAVA_DISPLAY,	CAVA_FIRST_AMOUNT,	CAVA_FIRST_CURRENCY,	CAVA_FORMAT_TYPE,	CAVA_PERCENTAGE_TYPE_CODE,	CAVA_PRICE,	CAVA_PRICE_CODE,	CAVA_QUANTITY,	CAVA_QUANTITY_TYPE,	CAVA_SECOND_AMOUNT,	CAVA_SECOND_CURRENCY,	CINL_AMOUNT_TYPE,	CINL_DISPLAY,	CINL_FIRST_CURRENCY,	CINL_FORMAT_TYPE,	CINL_PERCENTAGE_TYPE_CODE,	CINL_PRICE,	CINL_PRICE_CODE,	ENTITY_TYPE,	EVENT_NUM,	EXER_AMOUNT_TYPE,	EXER_DISPLAY,	EXER_FIRST_CURRENCY,	EXER_FORMAT_TYPE,	EXER_INDEX_POINTS,	EXER_PERCENTAGE_TYPE_CODE,	EXER_PRICE,	EXER_PRICE_CODE,	FLOW_ID,	INBOX_ID,	INDC_AMOUNT_TYPE,	INDC_DISPLAY,	INDC_FIRST_CURRENCY,	INDC_FORMAT_TYPE,	INDC_PERCENTAGE_TYPE_CODE,	INDC_PRICE,	INDC_PRICE_CODE,	ISSU_AMOUNT_TYPE,	ISSU_DISPLAY,	ISSU_FIRST_CURRENCY,	ISSU_FORMAT_TYPE,	ISSU_PERCENTAGE_TYPE_CODE,	ISSU_PRICE,	ISSU_PRICE_CODE,	MAXP_AMOUNT_TYPE,	MAXP_DISPLAY,	MAXP_FIRST_CURRENCY,	MAXP_FORMAT_TYPE,	MAXP_PERCENTAGE_TYPE_CODE,	MAXP_PRICE,	MAXP_PRICE_CODE,	MINP_AMOUNT_TYPE,	MINP_DISPLAY,	MINP_FIRST_CURRENCY,	MINP_FORMAT_TYPE,	MINP_PERCENTAGE_TYPE_CODE,	MINP_PRICE,	MINP_PRICE_CODE,	MRKT_AMOUNT_TYPE,	MRKT_DISPLAY,	MRKT_FIRST_CURRENCY,	MRKT_FORMAT_TYPE,	MRKT_PERCENTAGE_TYPE_CODE,	MRKT_PRICE,	MRKT_PRICE_CODE,	OFFR_AMOUNT_TYPE,	OFFR_DISPLAY,	OFFR_FIRST_AMOUNT,	OFFR_FIRST_CURRENCY,	OFFR_FORMAT_TYPE,	OFFR_INDEX_POINTS,	OFFR_PERCENTAGE_TYPE_CODE,	OFFR_PRICE,	OFFR_PRICE_CODE,	OFFR_QUANTITY,	OFFR_QUANTITY_TYPE,	OFFR_SECOND_AMOUNT,	OFFR_SECOND_CURRENCY,	OPTION_SEQUENCE_NUM,	OVERALL_STATUS,	PRIORITY,	PRPP_AMOUNT_TYPE,	PRPP_DISPLAY,	PRPP_FIRST_AMOUNT,	PRPP_FIRST_CURRENCY,	PRPP_FORMAT_TYPE,	PRPP_INDEX_POINTS,	PRPP_PERCENTAGE_TYPE_CODE,	PRPP_PRICE,	PRPP_PRICE_CODE,	PRPP_QUANTITY,	PRPP_QUANTITY_TYPE,	PRPP_SECOND_AMOUNT,	PRPP_SECOND_CURRENCY,	READY_FOR_ARCHIVAL_DATE,	SOFT_LOCK_KEY,	SYS_ENTRY_DATE,	TDMT_AMOUNT_TYPE,	TDMT_DISPLAY,	TDMT_FIRST_CURRENCY,	TDMT_FORMAT_TYPE,	TDMT_PRICE,	TERM_SEQUENCE_NUM from  CA_EVENT_OPTION_TERM_PRICE where event_num in (select event_num from ca_Event where master_id in ( Select master_id from ca_event where event_num='"+Event_num+"'))" ;
	     
	         
	     
	     // Get SQL from the flat file named "sqlfile"
	     System.out.println(sql);
	       
	     try {
	     	Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
	     
	     FileWriter myWriter;
			
			myWriter = new FileWriter(System.getProperty("user.dir")+"\\"+Event_num+"CA_Event_Option_Term_Price.csv");
			myWriter.write("ACTIVE_STATUS,	ARCHIVAL_STATUS,	CAVA_AMOUNT_TYPE,	CAVA_DISPLAY,	CAVA_FIRST_AMOUNT,	CAVA_FIRST_CURRENCY,	CAVA_FORMAT_TYPE,	CAVA_PERCENTAGE_TYPE_CODE,	CAVA_PRICE,	CAVA_PRICE_CODE,	CAVA_QUANTITY,	CAVA_QUANTITY_TYPE,	CAVA_SECOND_AMOUNT,	CAVA_SECOND_CURRENCY,	CINL_AMOUNT_TYPE,	CINL_DISPLAY,	CINL_FIRST_CURRENCY,	CINL_FORMAT_TYPE,	CINL_PERCENTAGE_TYPE_CODE,	CINL_PRICE,	CINL_PRICE_CODE,	ENTITY_TYPE,	EVENT_NUM,	EXER_AMOUNT_TYPE,	EXER_DISPLAY,	EXER_FIRST_CURRENCY,	EXER_FORMAT_TYPE,	EXER_INDEX_POINTS,	EXER_PERCENTAGE_TYPE_CODE,	EXER_PRICE,	EXER_PRICE_CODE,	FLOW_ID,	INBOX_ID,	INDC_AMOUNT_TYPE,	INDC_DISPLAY,	INDC_FIRST_CURRENCY,	INDC_FORMAT_TYPE,	INDC_PERCENTAGE_TYPE_CODE,	INDC_PRICE,	INDC_PRICE_CODE,	ISSU_AMOUNT_TYPE,	ISSU_DISPLAY,	ISSU_FIRST_CURRENCY,	ISSU_FORMAT_TYPE,	ISSU_PERCENTAGE_TYPE_CODE,	ISSU_PRICE,	ISSU_PRICE_CODE,	MAXP_AMOUNT_TYPE,	MAXP_DISPLAY,	MAXP_FIRST_CURRENCY,	MAXP_FORMAT_TYPE,	MAXP_PERCENTAGE_TYPE_CODE,	MAXP_PRICE,	MAXP_PRICE_CODE,	MINP_AMOUNT_TYPE,	MINP_DISPLAY,	MINP_FIRST_CURRENCY,	MINP_FORMAT_TYPE,	MINP_PERCENTAGE_TYPE_CODE,	MINP_PRICE,	MINP_PRICE_CODE,	MRKT_AMOUNT_TYPE,	MRKT_DISPLAY,	MRKT_FIRST_CURRENCY,	MRKT_FORMAT_TYPE,	MRKT_PERCENTAGE_TYPE_CODE,	MRKT_PRICE,	MRKT_PRICE_CODE,	OFFR_AMOUNT_TYPE,	OFFR_DISPLAY,	OFFR_FIRST_AMOUNT,	OFFR_FIRST_CURRENCY,	OFFR_FORMAT_TYPE,	OFFR_INDEX_POINTS,	OFFR_PERCENTAGE_TYPE_CODE,	OFFR_PRICE,	OFFR_PRICE_CODE,	OFFR_QUANTITY,	OFFR_QUANTITY_TYPE,	OFFR_SECOND_AMOUNT,	OFFR_SECOND_CURRENCY,	OPTION_SEQUENCE_NUM,	OVERALL_STATUS,	PRIORITY,	PRPP_AMOUNT_TYPE,	PRPP_DISPLAY,	PRPP_FIRST_AMOUNT,	PRPP_FIRST_CURRENCY,	PRPP_FORMAT_TYPE,	PRPP_INDEX_POINTS,	PRPP_PERCENTAGE_TYPE_CODE,	PRPP_PRICE,	PRPP_PRICE_CODE,	PRPP_QUANTITY,	PRPP_QUANTITY_TYPE,	PRPP_SECOND_AMOUNT,	PRPP_SECOND_CURRENCY,	READY_FOR_ARCHIVAL_DATE,	SOFT_LOCK_KEY,	SYS_ENTRY_DATE,	TDMT_AMOUNT_TYPE,	TDMT_DISPLAY,	TDMT_FIRST_CURRENCY,	TDMT_FORMAT_TYPE,	TDMT_PRICE,	TERM_SEQUENCE_NUM \n");
			
	     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//"+DB_endpoint+":"+port+"/"+DB_SID+"", ""+DB_uname+"", ""+DB_password+""); 
	     Statement stmt = con.createStatement(); 
	     ResultSet rs = stmt.executeQuery(sql);
	    
	     while(rs.next()){
	         //Retrieve by column name
	    	 int ACTIVE_STATUS =  rs.getInt("ACTIVE_STATUS");
	    	 int ARCHIVAL_STATUS =  rs.getInt("ARCHIVAL_STATUS");
	    	 int CAVA_AMOUNT_TYPE =  rs.getInt("CAVA_AMOUNT_TYPE");
	    	 String CAVA_DISPLAY =  rs.getString("CAVA_DISPLAY");
	    	 int CAVA_FIRST_AMOUNT =  rs.getInt("CAVA_FIRST_AMOUNT");
	    	 int CAVA_FIRST_CURRENCY =  rs.getInt("CAVA_FIRST_CURRENCY");
	    	 int CAVA_FORMAT_TYPE =  rs.getInt("CAVA_FORMAT_TYPE");
	    	 int CAVA_PERCENTAGE_TYPE_CODE =  rs.getInt("CAVA_PERCENTAGE_TYPE_CODE");
	    	 int CAVA_PRICE =  rs.getInt("CAVA_PRICE");
	    	 int CAVA_PRICE_CODE =  rs.getInt("CAVA_PRICE_CODE");
	    	 int CAVA_QUANTITY =  rs.getInt("CAVA_QUANTITY");
	    	 int CAVA_QUANTITY_TYPE =  rs.getInt("CAVA_QUANTITY_TYPE");
	    	 int CAVA_SECOND_AMOUNT =  rs.getInt("CAVA_SECOND_AMOUNT");
	    	 int CAVA_SECOND_CURRENCY =  rs.getInt("CAVA_SECOND_CURRENCY");
	    	 int CINL_AMOUNT_TYPE =  rs.getInt("CINL_AMOUNT_TYPE");
	    	 String CINL_DISPLAY =  rs.getString("CINL_DISPLAY");
	    	 int CINL_FIRST_CURRENCY =  rs.getInt("CINL_FIRST_CURRENCY");
	    	 int CINL_FORMAT_TYPE =  rs.getInt("CINL_FORMAT_TYPE");
	    	 int CINL_PERCENTAGE_TYPE_CODE =  rs.getInt("CINL_PERCENTAGE_TYPE_CODE");
	    	 int CINL_PRICE =  rs.getInt("CINL_PRICE");
	    	 int CINL_PRICE_CODE =  rs.getInt("CINL_PRICE_CODE");
	    	 int ENTITY_TYPE =  rs.getInt("ENTITY_TYPE");
	    	 int EVENT_NUM =  rs.getInt("EVENT_NUM");
	    	 int EXER_AMOUNT_TYPE =  rs.getInt("EXER_AMOUNT_TYPE");
	    	 String EXER_DISPLAY =  rs.getString("EXER_DISPLAY");
	    	 int EXER_FIRST_CURRENCY =  rs.getInt("EXER_FIRST_CURRENCY");
	    	 int EXER_FORMAT_TYPE =  rs.getInt("EXER_FORMAT_TYPE");
	    	 int EXER_INDEX_POINTS =  rs.getInt("EXER_INDEX_POINTS");
	    	 int EXER_PERCENTAGE_TYPE_CODE =  rs.getInt("EXER_PERCENTAGE_TYPE_CODE");
	    	 int EXER_PRICE =  rs.getInt("EXER_PRICE");
	    	 int EXER_PRICE_CODE =  rs.getInt("EXER_PRICE_CODE");
	    	 int FLOW_ID =  rs.getInt("FLOW_ID");
	    	 int INBOX_ID =  rs.getInt("INBOX_ID");
	    	 int INDC_AMOUNT_TYPE =  rs.getInt("INDC_AMOUNT_TYPE");
	    	 String INDC_DISPLAY =  rs.getString("INDC_DISPLAY");
	    	 int INDC_FIRST_CURRENCY =  rs.getInt("INDC_FIRST_CURRENCY");
	    	 int INDC_FORMAT_TYPE =  rs.getInt("INDC_FORMAT_TYPE");
	    	 int INDC_PERCENTAGE_TYPE_CODE =  rs.getInt("INDC_PERCENTAGE_TYPE_CODE");
	    	 int INDC_PRICE =  rs.getInt("INDC_PRICE");
	    	 int INDC_PRICE_CODE =  rs.getInt("INDC_PRICE_CODE");
	    	 int ISSU_AMOUNT_TYPE =  rs.getInt("ISSU_AMOUNT_TYPE");
	    	 String ISSU_DISPLAY =  rs.getString("ISSU_DISPLAY");
	    	 int ISSU_FIRST_CURRENCY =  rs.getInt("ISSU_FIRST_CURRENCY");
	    	 int ISSU_FORMAT_TYPE =  rs.getInt("ISSU_FORMAT_TYPE");
	    	 int ISSU_PERCENTAGE_TYPE_CODE =  rs.getInt("ISSU_PERCENTAGE_TYPE_CODE");
	    	 int ISSU_PRICE =  rs.getInt("ISSU_PRICE");
	    	 int ISSU_PRICE_CODE =  rs.getInt("ISSU_PRICE_CODE");
	    	 int MAXP_AMOUNT_TYPE =  rs.getInt("MAXP_AMOUNT_TYPE");
	    	 String MAXP_DISPLAY =  rs.getString("MAXP_DISPLAY");
	    	 int MAXP_FIRST_CURRENCY =  rs.getInt("MAXP_FIRST_CURRENCY");
	    	 int MAXP_FORMAT_TYPE =  rs.getInt("MAXP_FORMAT_TYPE");
	    	 int MAXP_PERCENTAGE_TYPE_CODE =  rs.getInt("MAXP_PERCENTAGE_TYPE_CODE");
	    	 int MAXP_PRICE =  rs.getInt("MAXP_PRICE");
	    	 int MAXP_PRICE_CODE =  rs.getInt("MAXP_PRICE_CODE");
	    	 int MINP_AMOUNT_TYPE =  rs.getInt("MINP_AMOUNT_TYPE");
	    	 String MINP_DISPLAY =  rs.getString("MINP_DISPLAY");
	    	 int MINP_FIRST_CURRENCY =  rs.getInt("MINP_FIRST_CURRENCY");
	    	 int MINP_FORMAT_TYPE =  rs.getInt("MINP_FORMAT_TYPE");
	    	 int MINP_PERCENTAGE_TYPE_CODE =  rs.getInt("MINP_PERCENTAGE_TYPE_CODE");
	    	 int MINP_PRICE =  rs.getInt("MINP_PRICE");
	    	 int MINP_PRICE_CODE =  rs.getInt("MINP_PRICE_CODE");
	    	 int MRKT_AMOUNT_TYPE =  rs.getInt("MRKT_AMOUNT_TYPE");
	    	 String MRKT_DISPLAY =  rs.getString("MRKT_DISPLAY");
	    	 int MRKT_FIRST_CURRENCY =  rs.getInt("MRKT_FIRST_CURRENCY");
	    	 int MRKT_FORMAT_TYPE =  rs.getInt("MRKT_FORMAT_TYPE");
	    	 int MRKT_PERCENTAGE_TYPE_CODE =  rs.getInt("MRKT_PERCENTAGE_TYPE_CODE");
	    	 int MRKT_PRICE =  rs.getInt("MRKT_PRICE");
	    	 int MRKT_PRICE_CODE =  rs.getInt("MRKT_PRICE_CODE");
	    	 int OFFR_AMOUNT_TYPE =  rs.getInt("OFFR_AMOUNT_TYPE");
	    	 String OFFR_DISPLAY =  rs.getString("OFFR_DISPLAY");
	    	 int OFFR_FIRST_AMOUNT =  rs.getInt("OFFR_FIRST_AMOUNT");
	    	 int OFFR_FIRST_CURRENCY =  rs.getInt("OFFR_FIRST_CURRENCY");
	    	 int OFFR_FORMAT_TYPE =  rs.getInt("OFFR_FORMAT_TYPE");
	    	 int OFFR_INDEX_POINTS =  rs.getInt("OFFR_INDEX_POINTS");
	    	 int OFFR_PERCENTAGE_TYPE_CODE =  rs.getInt("OFFR_PERCENTAGE_TYPE_CODE");
	    	 int OFFR_PRICE =  rs.getInt("OFFR_PRICE");
	    	 int OFFR_PRICE_CODE =  rs.getInt("OFFR_PRICE_CODE");
	    	 int OFFR_QUANTITY =  rs.getInt("OFFR_QUANTITY");
	    	 int OFFR_QUANTITY_TYPE =  rs.getInt("OFFR_QUANTITY_TYPE");
	    	 int OFFR_SECOND_AMOUNT =  rs.getInt("OFFR_SECOND_AMOUNT");
	    	 int OFFR_SECOND_CURRENCY =  rs.getInt("OFFR_SECOND_CURRENCY");
	    	 int OPTION_SEQUENCE_NUM =  rs.getInt("OPTION_SEQUENCE_NUM");
	    	 int OVERALL_STATUS =  rs.getInt("OVERALL_STATUS");
	    	 int PRIORITY =  rs.getInt("PRIORITY");
	    	 int PRPP_AMOUNT_TYPE =  rs.getInt("PRPP_AMOUNT_TYPE");
	    	 String PRPP_DISPLAY =  rs.getString("PRPP_DISPLAY");
	    	 int PRPP_FIRST_AMOUNT =  rs.getInt("PRPP_FIRST_AMOUNT");
	    	 int PRPP_FIRST_CURRENCY =  rs.getInt("PRPP_FIRST_CURRENCY");
	    	 int PRPP_FORMAT_TYPE =  rs.getInt("PRPP_FORMAT_TYPE");
	    	 int PRPP_INDEX_POINTS =  rs.getInt("PRPP_INDEX_POINTS");
	    	 int PRPP_PERCENTAGE_TYPE_CODE =  rs.getInt("PRPP_PERCENTAGE_TYPE_CODE");
	    	 int PRPP_PRICE =  rs.getInt("PRPP_PRICE");
	    	 int PRPP_PRICE_CODE =  rs.getInt("PRPP_PRICE_CODE");
	    	 int PRPP_QUANTITY =  rs.getInt("PRPP_QUANTITY");
	    	 int PRPP_QUANTITY_TYPE =  rs.getInt("PRPP_QUANTITY_TYPE");
	    	 int PRPP_SECOND_AMOUNT =  rs.getInt("PRPP_SECOND_AMOUNT");
	    	 int PRPP_SECOND_CURRENCY =  rs.getInt("PRPP_SECOND_CURRENCY");
	    	 String READY_FOR_ARCHIVAL_DATE =  rs.getString("READY_FOR_ARCHIVAL_DATE");
	    	 int SOFT_LOCK_KEY =  rs.getInt("SOFT_LOCK_KEY");
	    	 String SYS_ENTRY_DATE =  rs.getString("SYS_ENTRY_DATE");
	    	 int TDMT_AMOUNT_TYPE =  rs.getInt("TDMT_AMOUNT_TYPE");
	    	 String TDMT_DISPLAY =  rs.getString("TDMT_DISPLAY");
	    	 int TDMT_FIRST_CURRENCY =  rs.getInt("TDMT_FIRST_CURRENCY");
	    	 int TDMT_FORMAT_TYPE =  rs.getInt("TDMT_FORMAT_TYPE");
	    	 int TDMT_PRICE =  rs.getInt("TDMT_PRICE");
	    	 int TERM_SEQUENCE_NUM =  rs.getInt("TERM_SEQUENCE_NUM");

	     
		  myWriter.write(ACTIVE_STATUS+","	+ARCHIVAL_STATUS+","	+CAVA_AMOUNT_TYPE+","	+CAVA_DISPLAY+","	+CAVA_FIRST_AMOUNT+","	+CAVA_FIRST_CURRENCY+","	+CAVA_FORMAT_TYPE+","	+CAVA_PERCENTAGE_TYPE_CODE+","	+CAVA_PRICE+","	+CAVA_PRICE_CODE+","	+CAVA_QUANTITY+","	+CAVA_QUANTITY_TYPE+","	+CAVA_SECOND_AMOUNT+","	+CAVA_SECOND_CURRENCY+","	+CINL_AMOUNT_TYPE+","	+CINL_DISPLAY+","	+CINL_FIRST_CURRENCY+","	+CINL_FORMAT_TYPE+","	+CINL_PERCENTAGE_TYPE_CODE+","	+CINL_PRICE+","	+CINL_PRICE_CODE+","	+ENTITY_TYPE+","	+EVENT_NUM+","	+EXER_AMOUNT_TYPE+","	+EXER_DISPLAY+","	+EXER_FIRST_CURRENCY+","	+EXER_FORMAT_TYPE+","	+EXER_INDEX_POINTS+","	+EXER_PERCENTAGE_TYPE_CODE+","	+EXER_PRICE+","	+EXER_PRICE_CODE+","	+FLOW_ID+","	+INBOX_ID+","	+INDC_AMOUNT_TYPE+","	+INDC_DISPLAY+","	+INDC_FIRST_CURRENCY+","	+INDC_FORMAT_TYPE+","	+INDC_PERCENTAGE_TYPE_CODE+","	+INDC_PRICE+","	+INDC_PRICE_CODE+","	+ISSU_AMOUNT_TYPE+","	+ISSU_DISPLAY+","	+ISSU_FIRST_CURRENCY+","	+ISSU_FORMAT_TYPE+","	+ISSU_PERCENTAGE_TYPE_CODE+","	+ISSU_PRICE+","	+ISSU_PRICE_CODE+","	+MAXP_AMOUNT_TYPE+","	+MAXP_DISPLAY+","	+MAXP_FIRST_CURRENCY+","	+MAXP_FORMAT_TYPE+","	+MAXP_PERCENTAGE_TYPE_CODE+","	+MAXP_PRICE+","	+MAXP_PRICE_CODE+","	+MINP_AMOUNT_TYPE+","	+MINP_DISPLAY+","	+MINP_FIRST_CURRENCY+","	+MINP_FORMAT_TYPE+","	+MINP_PERCENTAGE_TYPE_CODE+","	+MINP_PRICE+","	+MINP_PRICE_CODE+","	+MRKT_AMOUNT_TYPE+","	+MRKT_DISPLAY+","	+MRKT_FIRST_CURRENCY+","	+MRKT_FORMAT_TYPE+","	+MRKT_PERCENTAGE_TYPE_CODE+","	+MRKT_PRICE+","	+MRKT_PRICE_CODE+","	+OFFR_AMOUNT_TYPE+","	+OFFR_DISPLAY+","	+OFFR_FIRST_AMOUNT+","	+OFFR_FIRST_CURRENCY+","	+OFFR_FORMAT_TYPE+","	+OFFR_INDEX_POINTS+","	+OFFR_PERCENTAGE_TYPE_CODE+","	+OFFR_PRICE+","	+OFFR_PRICE_CODE+","	+OFFR_QUANTITY+","	+OFFR_QUANTITY_TYPE+","	+OFFR_SECOND_AMOUNT+","	+OFFR_SECOND_CURRENCY+","	+OPTION_SEQUENCE_NUM+","	+OVERALL_STATUS+","	+PRIORITY+","	+PRPP_AMOUNT_TYPE+","	+PRPP_DISPLAY+","	+PRPP_FIRST_AMOUNT+","	+PRPP_FIRST_CURRENCY+","	+PRPP_FORMAT_TYPE+","	+PRPP_INDEX_POINTS+","	+PRPP_PERCENTAGE_TYPE_CODE+","	+PRPP_PRICE+","	+PRPP_PRICE_CODE+","	+PRPP_QUANTITY+","	+PRPP_QUANTITY_TYPE+","	+PRPP_SECOND_AMOUNT+","	+PRPP_SECOND_CURRENCY+","	+READY_FOR_ARCHIVAL_DATE+","	+SOFT_LOCK_KEY+","	+SYS_ENTRY_DATE+","	+TDMT_AMOUNT_TYPE+","	+TDMT_DISPLAY+","	+TDMT_FIRST_CURRENCY+","	+TDMT_FORMAT_TYPE+","	+TDMT_PRICE+","	+TERM_SEQUENCE_NUM);
		  myWriter.write("\n");

	 
	     
	     System.out.println(ACTIVE_STATUS+","	+ARCHIVAL_STATUS+","	+CAVA_AMOUNT_TYPE+","	+CAVA_DISPLAY+","	+CAVA_FIRST_AMOUNT+","	+CAVA_FIRST_CURRENCY+","	+CAVA_FORMAT_TYPE+","	+CAVA_PERCENTAGE_TYPE_CODE+","	+CAVA_PRICE+","	+CAVA_PRICE_CODE+","	+CAVA_QUANTITY+","	+CAVA_QUANTITY_TYPE+","	+CAVA_SECOND_AMOUNT+","	+CAVA_SECOND_CURRENCY+","	+CINL_AMOUNT_TYPE+","	+CINL_DISPLAY+","	+CINL_FIRST_CURRENCY+","	+CINL_FORMAT_TYPE+","	+CINL_PERCENTAGE_TYPE_CODE+","	+CINL_PRICE+","	+CINL_PRICE_CODE+","	+ENTITY_TYPE+","	+EVENT_NUM+","	+EXER_AMOUNT_TYPE+","	+EXER_DISPLAY+","	+EXER_FIRST_CURRENCY+","	+EXER_FORMAT_TYPE+","	+EXER_INDEX_POINTS+","	+EXER_PERCENTAGE_TYPE_CODE+","	+EXER_PRICE+","	+EXER_PRICE_CODE+","	+FLOW_ID+","	+INBOX_ID+","	+INDC_AMOUNT_TYPE+","	+INDC_DISPLAY+","	+INDC_FIRST_CURRENCY+","	+INDC_FORMAT_TYPE+","	+INDC_PERCENTAGE_TYPE_CODE+","	+INDC_PRICE+","	+INDC_PRICE_CODE+","	+ISSU_AMOUNT_TYPE+","	+ISSU_DISPLAY+","	+ISSU_FIRST_CURRENCY+","	+ISSU_FORMAT_TYPE+","	+ISSU_PERCENTAGE_TYPE_CODE+","	+ISSU_PRICE+","	+ISSU_PRICE_CODE+","	+MAXP_AMOUNT_TYPE+","	+MAXP_DISPLAY+","	+MAXP_FIRST_CURRENCY+","	+MAXP_FORMAT_TYPE+","	+MAXP_PERCENTAGE_TYPE_CODE+","	+MAXP_PRICE+","	+MAXP_PRICE_CODE+","	+MINP_AMOUNT_TYPE+","	+MINP_DISPLAY+","	+MINP_FIRST_CURRENCY+","	+MINP_FORMAT_TYPE+","	+MINP_PERCENTAGE_TYPE_CODE+","	+MINP_PRICE+","	+MINP_PRICE_CODE+","	+MRKT_AMOUNT_TYPE+","	+MRKT_DISPLAY+","	+MRKT_FIRST_CURRENCY+","	+MRKT_FORMAT_TYPE+","	+MRKT_PERCENTAGE_TYPE_CODE+","	+MRKT_PRICE+","	+MRKT_PRICE_CODE+","	+OFFR_AMOUNT_TYPE+","	+OFFR_DISPLAY+","	+OFFR_FIRST_AMOUNT+","	+OFFR_FIRST_CURRENCY+","	+OFFR_FORMAT_TYPE+","	+OFFR_INDEX_POINTS+","	+OFFR_PERCENTAGE_TYPE_CODE+","	+OFFR_PRICE+","	+OFFR_PRICE_CODE+","	+OFFR_QUANTITY+","	+OFFR_QUANTITY_TYPE+","	+OFFR_SECOND_AMOUNT+","	+OFFR_SECOND_CURRENCY+","	+OPTION_SEQUENCE_NUM+","	+OVERALL_STATUS+","	+PRIORITY+","	+PRPP_AMOUNT_TYPE+","	+PRPP_DISPLAY+","	+PRPP_FIRST_AMOUNT+","	+PRPP_FIRST_CURRENCY+","	+PRPP_FORMAT_TYPE+","	+PRPP_INDEX_POINTS+","	+PRPP_PERCENTAGE_TYPE_CODE+","	+PRPP_PRICE+","	+PRPP_PRICE_CODE+","	+PRPP_QUANTITY+","	+PRPP_QUANTITY_TYPE+","	+PRPP_SECOND_AMOUNT+","	+PRPP_SECOND_CURRENCY+","	+READY_FOR_ARCHIVAL_DATE+","	+SOFT_LOCK_KEY+","	+SYS_ENTRY_DATE+","	+TDMT_AMOUNT_TYPE+","	+TDMT_DISPLAY+","	+TDMT_FIRST_CURRENCY+","	+TDMT_FORMAT_TYPE+","	+TDMT_PRICE+","	+TERM_SEQUENCE_NUM);

	      }
	      rs.close();
	      stmt.close();
	      con.close();
	      myWriter.close();
	      System.out.println("Successfully executed");
		}

}
