package practice;

public class Q6FindFactorial {

//Write a method that returns the factorial number of any given number.
//Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
//than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.



            public static  int factorial(int num){

                if(num == 1){
                    return 1;
                }

                return  num * factorial(num -1);
                //    /         /      \
                // num  *  num-1 * factorial(num-1 -1)
                // ...
                // num * num-1 * ... * 1
            }


    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(4) = " + factorial(4));
        System.out.println("factorial(1) = " + factorial(1));
    }

}
