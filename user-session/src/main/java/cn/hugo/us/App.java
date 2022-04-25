package cn.hugo.us;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App a =new App();
        System.out.println( "Hello World!" );
        System.out.println( a.getj() );

    }
    public String getj(){
        String a = "7";
        try {
            a = "9";
            return a;
        }catch(Exception e){

        }finally{
            a = "4";
            System.out.println(222);
        }
        return a;
    }
}
