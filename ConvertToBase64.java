package RchilliApi;
import java.io.File;
import java.io.FileInputStream;
import java.io.*;

import javax.servlet.http.HttpSession;

public class ConvertToBase64 {
	public String Convert(String filePath)
	{
		try
		{
		 File f = new File(filePath);
         FileInputStream fin = new FileInputStream(f);
         byte[] fileContent = new byte[(int) f.length()];
         fin.read(fileContent);
         byte[] encoded = Base64.encodeBytesToBytes(fileContent);
        String encodedString =new String(encoded);
        fin.close();
        
        return encodedString ;
		}
		catch(Exception ex)
		{
			return "Error:- "+ex.getMessage();
		}
	}

}
