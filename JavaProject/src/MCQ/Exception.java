package MCQ;

public class Exception {
    public static void main(String str[]) {
        int i = 1, j = 1;

        try

        {

            i++;

            j--;
            if (i / j > 1)

                i++;

        } 

        catch (ArithmeticException e)

        {
            System.out.println("arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index exception");
        }

        catch (Exception e)

        {
            System.out.println("Exception");
        }
        finally

        {
            System.out.println("finally");
        }
        System.out.println("after exceptions ");

    }

}
