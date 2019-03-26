import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {
	//@BeforeClass
	DataService ds=new DataService();
	
	@Test
	public void testStringToDate() throws ParseException{
		 String dateStr = "2010/05/04 12:34:23";
		 DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
	     Date date= ds.StringToDate(dateStr);   
	     assertEquals(dateStr,ds.DateToString(date));
	 
	     //System.out.println(ds.DateToString(date));
	}
}
