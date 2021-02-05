package packageCA_Event_Option_Term_Period;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;  // Import the IOException class to handle errors

public class ClassCA_Event_Option_Term_Period {
	public  void methodCA_Event_Option_Term_Period(String Arg_DB_endpoint,String Arg_port,String Arg_DB_SID,String Arg_DB_uname,String Arg_DB_password,String Arg_Event_num) throws SQLException, IOException{
		
		
		
		String DB_endpoint= Arg_DB_endpoint;
	     String port= Arg_port;
	     String DB_SID= Arg_DB_SID;
	     String DB_uname= Arg_DB_uname;
	     String DB_password= Arg_DB_password;
	     String Event_num = Arg_Event_num;
	     
	     String sql   = "select ACTIVE_STATUS,	ARCHIVAL_STATUS,	BLOK_DATE_CODE,	BLOK_FORMAT_TYPE,	BLOK_FROM_DT,	BLOK_TO_DT,	ENTITY_TYPE,	EVENT_NUM,	FLOW_ID,	INBOX_ID,	OPTION_SEQUENCE_NUM,	OVERALL_STATUS,	PRIC_DATE_CODE,	PRIC_FORMAT_TYPE,	PRIC_FROM_DT,	PRIC_TO_DT,	PRIORITY,	PWAL_DATE_CODE,	PWAL_FORMAT_TYPE,	PWAL_FROM_DT,	PWAL_TO_DT,	READY_FOR_ARCHIVAL_DATE,	SOFT_LOCK_KEY,	SYS_ENTRY_DATE,	TERM_SEQUENCE_NUM,	TRDP_DATE_CODE,	TRDP_FORMAT_TYPE,	TRDP_FROM_DT,	TRDP_TO_DT from  CA_EVENT_OPTION_TERM_PERIOD where event_num in (select event_num from ca_Event where master_id in ( Select master_id from ca_event where event_num='"+Event_num+"'))" ;
	     
	         
	     
	     // Get SQL from the flat file named "sqlfile"
	     System.out.println(sql);
	       
	     try {
	     	Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
	     
	     FileWriter myWriter;
			
			myWriter = new FileWriter(System.getProperty("user.dir")+"\\"+Event_num+"CA_Event_Option_Term_Period.csv");
			myWriter.write("ACTIVE_STATUS,	ARCHIVAL_STATUS,	BLOK_DATE_CODE,	BLOK_FORMAT_TYPE,	BLOK_FROM_DT,	BLOK_TO_DT,	ENTITY_TYPE,	EVENT_NUM,	FLOW_ID,	INBOX_ID,	OPTION_SEQUENCE_NUM,	OVERALL_STATUS,	PRIC_DATE_CODE,	PRIC_FORMAT_TYPE,	PRIC_FROM_DT,	PRIC_TO_DT,	PRIORITY,	PWAL_DATE_CODE,	PWAL_FORMAT_TYPE,	PWAL_FROM_DT,	PWAL_TO_DT,	READY_FOR_ARCHIVAL_DATE,	SOFT_LOCK_KEY,	SYS_ENTRY_DATE,	TERM_SEQUENCE_NUM,	TRDP_DATE_CODE,	TRDP_FORMAT_TYPE,	TRDP_FROM_DT,	TRDP_TO_DT \n");
			
	     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//"+DB_endpoint+":"+port+"/"+DB_SID+"", ""+DB_uname+"", ""+DB_password+""); 
	     Statement stmt = con.createStatement(); 
	     ResultSet rs = stmt.executeQuery(sql);
	    
	     while(rs.next()){
	         //Retrieve by column name
	    	 int ACTIVE_STATUS =  rs.getInt("ACTIVE_STATUS");
	    	 int ARCHIVAL_STATUS =  rs.getInt("ARCHIVAL_STATUS");
	    	 int BLOK_DATE_CODE =  rs.getInt("BLOK_DATE_CODE");
	    	 int BLOK_FORMAT_TYPE =  rs.getInt("BLOK_FORMAT_TYPE");
	    	 String BLOK_FROM_DT =  rs.getString("BLOK_FROM_DT");
	    	 String BLOK_TO_DT =  rs.getString("BLOK_TO_DT");
	    	 int ENTITY_TYPE =  rs.getInt("ENTITY_TYPE");
	    	 int EVENT_NUM =  rs.getInt("EVENT_NUM");
	    	 int FLOW_ID =  rs.getInt("FLOW_ID");
	    	 int INBOX_ID =  rs.getInt("INBOX_ID");
	    	 int OPTION_SEQUENCE_NUM =  rs.getInt("OPTION_SEQUENCE_NUM");
	    	 int OVERALL_STATUS =  rs.getInt("OVERALL_STATUS");
	    	 int PRIC_DATE_CODE =  rs.getInt("PRIC_DATE_CODE");
	    	 int PRIC_FORMAT_TYPE =  rs.getInt("PRIC_FORMAT_TYPE");
	    	 String PRIC_FROM_DT =  rs.getString("PRIC_FROM_DT");
	    	 String PRIC_TO_DT =  rs.getString("PRIC_TO_DT");
	    	 int PRIORITY =  rs.getInt("PRIORITY");
	    	 int PWAL_DATE_CODE =  rs.getInt("PWAL_DATE_CODE");
	    	 int PWAL_FORMAT_TYPE =  rs.getInt("PWAL_FORMAT_TYPE");
	    	 String PWAL_FROM_DT =  rs.getString("PWAL_FROM_DT");
	    	 String PWAL_TO_DT =  rs.getString("PWAL_TO_DT");
	    	 String READY_FOR_ARCHIVAL_DATE =  rs.getString("READY_FOR_ARCHIVAL_DATE");
	    	 int SOFT_LOCK_KEY =  rs.getInt("SOFT_LOCK_KEY");
	    	 String SYS_ENTRY_DATE =  rs.getString("SYS_ENTRY_DATE");
	    	 int TERM_SEQUENCE_NUM =  rs.getInt("TERM_SEQUENCE_NUM");
	    	 int TRDP_DATE_CODE =  rs.getInt("TRDP_DATE_CODE");
	    	 int TRDP_FORMAT_TYPE =  rs.getInt("TRDP_FORMAT_TYPE");
	    	 String TRDP_FROM_DT =  rs.getString("TRDP_FROM_DT");
	    	 String TRDP_TO_DT =  rs.getString("TRDP_TO_DT");

	     
		  myWriter.write(ACTIVE_STATUS+","	+ARCHIVAL_STATUS+","	+BLOK_DATE_CODE+","	+BLOK_FORMAT_TYPE+","	+BLOK_FROM_DT+","	+BLOK_TO_DT+","	+ENTITY_TYPE+","	+EVENT_NUM+","	+FLOW_ID+","	+INBOX_ID+","	+OPTION_SEQUENCE_NUM+","	+OVERALL_STATUS+","	+PRIC_DATE_CODE+","	+PRIC_FORMAT_TYPE+","	+PRIC_FROM_DT+","	+PRIC_TO_DT+","	+PRIORITY+","	+PWAL_DATE_CODE+","	+PWAL_FORMAT_TYPE+","	+PWAL_FROM_DT+","	+PWAL_TO_DT+","	+READY_FOR_ARCHIVAL_DATE+","	+SOFT_LOCK_KEY+","	+SYS_ENTRY_DATE+","	+TERM_SEQUENCE_NUM+","	+TRDP_DATE_CODE+","	+TRDP_FORMAT_TYPE+","	+TRDP_FROM_DT+","	+TRDP_TO_DT);
		  myWriter.write("\n");

	 
	     
	     System.out.println(ACTIVE_STATUS+","	+ARCHIVAL_STATUS+","	+BLOK_DATE_CODE+","	+BLOK_FORMAT_TYPE+","	+BLOK_FROM_DT+","	+BLOK_TO_DT+","	+ENTITY_TYPE+","	+EVENT_NUM+","	+FLOW_ID+","	+INBOX_ID+","	+OPTION_SEQUENCE_NUM+","	+OVERALL_STATUS+","	+PRIC_DATE_CODE+","	+PRIC_FORMAT_TYPE+","	+PRIC_FROM_DT+","	+PRIC_TO_DT+","	+PRIORITY+","	+PWAL_DATE_CODE+","	+PWAL_FORMAT_TYPE+","	+PWAL_FROM_DT+","	+PWAL_TO_DT+","	+READY_FOR_ARCHIVAL_DATE+","	+SOFT_LOCK_KEY+","	+SYS_ENTRY_DATE+","	+TERM_SEQUENCE_NUM+","	+TRDP_DATE_CODE+","	+TRDP_FORMAT_TYPE+","	+TRDP_FROM_DT+","	+TRDP_TO_DT);

	      }
	      rs.close();
	      stmt.close();
	      con.close();
	      myWriter.close();
	      System.out.println("Successfully executed");
		}

}
