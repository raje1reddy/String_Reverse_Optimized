package com.padmaja.stringreverse;
import java.lang.String;

public class stringUtil {
    public String reverse(String inputString) {
        char[] myarray= inputString.toCharArray();
        for(int i=0,j = inputString.length()-1; i<j; i++,j--){
            char temp = myarray[i];
            myarray[i]= myarray[j];
            myarray[j]= temp;
        }
        return new String(myarray);
    }


}
