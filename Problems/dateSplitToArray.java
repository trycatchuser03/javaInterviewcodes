package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dateSplitToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String curDate = "02/01/2025";
        String [] arr = curDate.split("[/]");
       
        
        Set <String> date1= new HashSet<String >();
        date1.add(arr[0]);
       System.out.println(date1);
       Set <String> month1= new HashSet<String >();
       month1.add(arr[1]);
       System.out.println( month1);
       Set <String> year1= new HashSet<String >();
       year1.add(arr[2]);
       System.out.println( year1);
      
        
        //using arrays class
        List<String> date = Arrays.asList(arr[0]);
        System.out.println(date);
        List<String> month = Arrays.asList(arr[1]);
        System.out.println(month);
        List<String> year = Arrays.asList(arr[2]);
        System.out.println(year);
	}

}
