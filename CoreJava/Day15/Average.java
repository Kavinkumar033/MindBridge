package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Average {
    public static void ToCalculateAverage(List<Students> list1, Consumer<Double> consumer  )
    {
        double sum=0;
       for(Students list : list1)
       {
           sum = sum + list.getCgpa();
       }
       consumer.accept(sum);
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

       ToCalculateAverage(list,(total)-> System.out.println("Average CGPA : "+(total/list.size())));

    }
}
