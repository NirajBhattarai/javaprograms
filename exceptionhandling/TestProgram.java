public class TestProgram {
    public static void main(String[] args)
    {

        try {
            // throw new ArithmeticException();
            System.out.println("get connection");
            throw new ArithmeticException();

        } catch (Exception e) {
            // log 
            System.out.println("start logging");
            throw new ArithmeticException();
            // System.out.println("inside exception");
        
        }finally{
            System.out.println("resource release");
        // System.out.println("After Aithemtic Exception");
        }


    }
    
}
