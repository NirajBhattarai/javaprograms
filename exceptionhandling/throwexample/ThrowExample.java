

/**
 * User
 */
 class UsernamePasswordMisMatchException extends RuntimeException {

    public UsernamePasswordMisMatchException(String message)
    {
        super(message);
    }

    
}

public class ThrowExample {

    public static void main(String[] args) throws Throwable
    {
        // 1 
        throw new UsernamePasswordMisMatchException("Username Password Mismatch Exception");
    }
    
}
