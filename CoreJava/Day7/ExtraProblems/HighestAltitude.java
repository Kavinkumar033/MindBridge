package Day7;

public class HighestAltitude {
    public static int highestAltitude(int[] gain)
    {
        int high=0;
        int currentAltitude=0;
        for(int a: gain)
        {
            currentAltitude += a;
            if(currentAltitude>high)
            {
                high=currentAltitude;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int gain[]={-5,1,5,0,-7};
        int result = highestAltitude(gain);
        System.out.println("THe Highest Altitude is : "+result);
    }
}
