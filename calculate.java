/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerorganizationodevi;

/**
 *
 * @author tuncaymsi
 */
public class calculate {
    
    public int binarytodecimal(String value)
    {
        
        return Integer.parseInt(value,2);
    }
    public String decimaltohex(String value)
    {
        int reminder;
        String hexnumber = "";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       int number = Integer.parseInt(value);
        
        while(number > 0)
        {
            reminder = number%16;
            hexnumber = hex[reminder] + hexnumber;
            number = number/16;    
        }

         return hexnumber;
    }
    public String decimaltobinary(int value)
    {
        int rem = 0; 
        String binary = "";
        while(value != 0)
        {
            rem = value % 2;
            binary = rem + binary;
            value = value/2;
        }
        return binary;
    }
    public int hextodecimal(String value)
    {
        int decimal = 0;
        decimal = Integer.parseInt(value,16); //shortcut
        
        
                                                //long way
  /*      String digits = "0123456789ABCDEF";
             value = value.toUpperCase();
             
             for (int i = 0; i < value.length(); i++) {
                 char c = value.charAt(i);
                 int d = digits.indexOf(c);
                 decimal = 16*decimal + d;
             }
             */
        
        return decimal;
    }
    public String hextobinary(String value)
    {
        
        String binary = "";
        int decimal = hextodecimal(value);
        binary = decimaltobinary(decimal);
        
        return binary;
        
    }
    public String binarytohex(String value)
    {
        String hex = "";
        int decimal = binarytodecimal(value);
        hex = decimaltohex(value);
        
        return hex;
    }
}
