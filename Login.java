package ProgPOE10047466;

/**
 *
 * @author ST10047466
 */
public class Login 
{

    private final int MAX_USRNAME_LENGTH = 5;
    private final int MIN_PASS_LENGTH = 8;
    private final String SPECIAL = " !@#$%^&*()-=_+[]{};',./|<>?:\\";
    private final String UNDERSCORE = "_";
   
    private String usrName = "";
    private String pass = "";
    private String name = "";
    private String surname = "";
   
    
// METHOD TO CHECK PARAMETERS OF USERNAME
    public boolean checkusrName(String input) 
    {
        boolean check = false;

        if (checkEmpty(input))
        {
            if (input.length() <= MAX_USRNAME_LENGTH) 
            {
                if (input.contains(UNDERSCORE)) 
                {
                    check = true;
                }
            }
        }
        return check;
    }

// METHOD TO CHECK IF IT IS LEFT EMPTY
    
    public boolean checkEmpty(String input) 
    {
        boolean check = false;
        if ((input != null) && !input.isEmpty()) 
        {
            check = true;
        }
        return check;
    }
// CHECK IF THE USERNAME CONTAINS A DIGIT    
         public boolean checkDigit(String input)
      {
        boolean check = false;
        for (int i = 0; i < input.length(); i++)
        {
           if(Character.isDigit(input.charAt(i))) 
           {
               check = true;
               break;
           }
        }
        return check;
    }
    // CHECK THE USERNAME FOR UPPERCASE LETTER    
         public boolean checkUpper(String input)
   {
       boolean check = false;
       for (int i = 0; i < input.length(); i++)
       {
           if(Character.isUpperCase(input.charAt(i)))
           {
               check = true;
               break;
           }
       }
       return check;
   }
// CHECK FOR SPECIAL CHARACTERS IN THE STRING
    public boolean checkSpecial(String input) 
    {
        boolean check = false;
       for (int i = 0; i < SPECIAL.length(); i++)
       {
           String toCheck = Character.toString(SPECIAL.charAt(i));
           if (input.contains(toCheck))
           {
               check = true;
               break;
           }
       }
       return check;
    }
            
// CHECK THE USERS PASSWORD COMPLEXITY    
    public boolean checkPassword(String input) 
    {
        boolean check = false;
        
 if ((checkEmpty(input)) && (input.length() >= MIN_PASS_LENGTH))
       {
           if ((checkUpper(input)) && (checkDigit(input)))
           {
               if (checkSpecial(input))
               {
                   check = true;
               }
           }
       }
        return check;
        }
    
    // ALL CLASS VARIABLES (NOT CONSTANTS) MUST HAVE GETTERS & SETTERS
    
    /**
     * @return the usrName
     */
    public String getName() 
    {
        return name;
    }
     public void setName(String name)
    {
        this.name = name;
    }
     
    public String getusrName()
    {
        return usrName;
    }
    /**
     * @param usrName the usrName to set
     */
    public void setusrName(String usrName)
    {
        this.usrName = usrName;
    }

    /**
     * @return the pass
     */
    public String getPass() 
    {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass)
    {
        this.pass = pass;
    }
    /**
     * @return the surname
     */
    public String getsurName() 
    {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setsurName(String surname) 
    {
        this.surname= surname;
    }

    
    
}
