package calculator.operations.algebra;

public class Factorial {

    public int factorial(int a) {
        int res=1;
        if(a<0)
            return 0;
        else if(a>1)
        {
            for(int i=1;i<=a;i++)
            {
                res=res*i;
            }
        }
        return res;
    }
}
