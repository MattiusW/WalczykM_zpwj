package Lab04;

public class Main 
{
     public static void main(String[] args) 
     {
        
            String slowo = "Witaj";
            String slowo2 = "przyjacielu";
            
            System.out.println(isWord(slowo)); 
            System.out.println(isWord("123456")); 
            
            System.out.println(isJavaIdentifier(slowo2)); 
            System.out.println(isJavaIdentifier("123456")); 
    
     }
    
     public static boolean isWord(String litera) 
     {
        return litera.codePoints().allMatch(Character::isAlphabetic);
     }
        
    public static boolean isJavaIdentifier(String litera) 
    {
        if (!Character.isJavaIdentifierStart(litera.codePointAt(0))) 
        {
                return false;
        }
            
        return litera.codePoints().skip(1).allMatch(Character::isJavaIdentifierPart);
    }
}
