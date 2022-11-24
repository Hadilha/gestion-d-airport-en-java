package projet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Outils {public Outils () {} ; 

public static Integer Reader (Integer i)
{
	  try{
	        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	        String s = bufferRead.readLine();
	        i = Integer.valueOf(s);
	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
	  return i;
	
}


public static String Readerch (String  i)
	{
		  try{
		        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		        String s = bufferRead.readLine();
		        i = String.valueOf(s);
		    }
		    catch(IOException e)
		    {
		        e.printStackTrace();
		    }
		  return i;
		
	}

}
