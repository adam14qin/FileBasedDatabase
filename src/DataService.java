import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class DataService {
	HashMap<String, Double> map=new HashMap();
	
	public DataService() {
		//setFileDir("TimeSeries.csv");
	}
	
	
	Date StringToDate(String dateStr){
		Date date = new Date();  
        // 
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
        try {  
            date = sdf.parse(dateStr);    
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		
        return date;
	}
	
	String DateToString(Date date) {
		String dateStr="";
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH/mm/ss");  
		 try {  
	            dateStr = sdf.format(date);  
	            //dateStr = sdf2.format(date);  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
		return dateStr;
	}
	
	private void getConnection() throws FileNotFoundException{
		//File reader objects
		String filename="TimeSeries.cvs";
		FileReader reader = new FileReader(filename);
		Scanner in=null;
		in =new Scanner(reader);
		
		try {
			in =new Scanner(reader);
			while(in.hasNextLine()) {
				String theLine=in.nextLine();
				String[] data=theLine.split(", ");
				
			}
		} finally {
			//Cleanup the scanner
			if(in != null) in.close();
		}
	}
	
	private void readLast() throws Exception {//Read the latest value
		  String filename="TimeSeries.cvs";
		  FileReader reader = new FileReader(filename);
		  BufferedReader br = new BufferedReader(reader);

		  String strLastLine = "";
		  String tmp;
		  String strlastLineMinusOne="";;

		  while ((tmp = br.readLine()) != null)
		  {
		     strlastLineMinusOne = strLastLine;
		     strLastLine = tmp;
		  }

		  reader.close();
		 
	}
	
	private void WriteLast() throws Exception {//Write a new value
		
	}
	
	private void ReadTimeRange(Date start, Date end) throws Exception {//Read a series of values over a certain time range 
		
	}
	
	
	
	public static void main(String[] args) {
		

	}

}

 class Query {
	 String dateStr;
	 Double value;
	 public Query(String dateStr, Double value) {
		 this.dateStr=dateStr;
		 this.value=value;
	 }
 }
