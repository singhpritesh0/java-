

public class exceptions {
    public static void main(String[] args){
        int a=5,b=5,c=5,d=5;
        int result;
        try{
            result = (a+b)/(c-d);
        }
        catch(ArithmeticException n){
            System.out.println("undefined");
        }

        String p = null;
        try{
            System.out.println(p.charAt(3));
        }
        catch(NullPointerException e){
            System.out.println("String is empty");
        }
    }
    
}
