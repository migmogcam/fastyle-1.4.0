package app.fastyleApplication.fastyle.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGenerator  {
	
	
	
	private static String encode(String pass) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
        return bCryptPasswordEncoder.encode(pass);
	}
	
	public static String getPassEncode(String pass) {
      return  encode(pass);
    }

}
