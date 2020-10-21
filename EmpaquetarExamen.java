import java.security.*;

import java.util.Calendar;

import javax.crypto.*;
import javac.crypto.interfaces.*;
import sun.jvm.hotspot.oops.CIntField;

import javax.crypto.spec.*;


public class EmpaquetarExamen{
    
    public static void main(String[] args){
        if(args.length != 1){
            System.exit(1);
        }
        
        Cipher cifrador = Cipher.getInstance("DES/ECB/PKCS5Padding");

        cifrador.init(Cipher.ENCRYPT_MODE, clave);
    }
}