package AllSeleniumPrograme;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecoding 
{
	public static void main(String[] args)
	{
		String pass="patil@1233";
		
		//encoding the password
		byte[] encodeBase64 = Base64.encodeBase64(pass.getBytes());
        System.out.println("encoded Password-> "+new String(encodeBase64));  

        
        //decodind the password
        byte[] decodeBase64 = Base64.decodeBase64(encodeBase64);
        System.out.println("decoded Password-> "+new String(decodeBase64));  
    
	}

}
