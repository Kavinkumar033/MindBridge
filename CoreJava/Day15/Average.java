package Day15;

import java.util.ArrayList;
import java.util.List;

public class Average {
    public static double ToCalculateAverage(List<Students> list1)
    {
        return list1.stream().mapToDouble(list-> list.getCgpa()).average().orElse(0.0);
    }
    public static void main(String[] args) {
        Students s1 = new Students("Kavin", 7.5);
        Students s2 = new Students("Manoj", 7.2);
        Students s3 = new Students("Poovarasan", 7.8);
        Students s4 = new Students("Teddy", 8.5);
        Students s5 = new Students("Rocky", 6.5);

        List<Students> list = new ArrayList<Students>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        double avg = ToCalculateAverage(list);
        System.out.println("Average CGPA : "+avg);
    }
}
