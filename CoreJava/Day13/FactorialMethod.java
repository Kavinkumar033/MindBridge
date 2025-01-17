package Day13;

public class FactorialMethod {
    public long findfact(int num){
        if (num<0){
            return -1;
        }
        if (num==0){
            return 1;
        }
        long fact=1;
        for (int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}