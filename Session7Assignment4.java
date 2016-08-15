public class Session7Assignment4
{
    public static void main(String [] args) 
    {
       		
        try
          {
	        String str="fiveruless2buildprogram";
	        System.out.println("Length of the string is : " +str.length());
	        char c = str.charAt(0);
                System.out.println("Charecter present at 1st position of the string is : " +c);                
	        c = str.charAt(40);
	        System.out.println("Charecter present at 40th position of the string is : " +c);
          }

         catch(StringIndexOutOfBoundsException e)
         {
	         System.out.println("StringIndexOutOfBoundsException : "+ e);
         }
     }
}