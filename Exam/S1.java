/**
 * S1
 */
public class S1 {
    public static int spower( int m, int n )
    {
        if(n==0)
            return 1;
            
       return  m * spower(m, n-1);
    }
    public static void main(String[] args) {
       System.out.println( spower( 7, 3 ) );
       System.out.println( spower( 2, 16 ) );
       System.out.println( spower( 13, 5 ) );
    }
}