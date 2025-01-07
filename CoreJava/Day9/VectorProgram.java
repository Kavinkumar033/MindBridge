package Day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorProgram {
    public static void main(String[] args) {
        Vector<Integer> grade = new Vector<>();
        grade.add(78);
        grade.add(85);
        grade.add(92);
        grade.add(67);
        grade.add(88);
        int removeIndex = 3;
        grade.remove(removeIndex);
        double avg,sum=0;
        for (double a : grade)
        {
            sum=sum+a;
        }
        avg=sum/grade.size();
        System.out.println("Grade : "+ grade);
        System.out.println("Highest Grade : "+ Collections.max(grade));
        System.out.println("Lowest Grade : "+ Collections.min(grade));
        System.out.println("Average Grade : "+ avg);

    }
}
