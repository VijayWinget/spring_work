package vroughwork.main;


import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base644 {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String value ="muTap7PHiXVb6imNE9DmK7JgJF5DGPd4YYtdqD6MyapChtDMj1txuMwdfpJL4aAk"+":"+"sGck1uTB1sIG9Q9c84cCb6ybpHmr0gaXfD1HpUkKX7WnYDf2Ojfirl0BbkvuUIX9";
		
		byte[] bytes =value.getBytes("UTF-8");
		String encoded = Base64.getEncoder().encodeToString(bytes);
		System.out.println(encoded);
		
		
		

//		byte[] decoded = Base64.getDecoder().decode("TC3QTHjQRbxAJE8miqnPpbZhDuC4WCVrWv");
//		String decodedStr = new String(decoded, StandardCharsets.UTF_8);
//		System.out.println(decodedStr);
	}

	

}
