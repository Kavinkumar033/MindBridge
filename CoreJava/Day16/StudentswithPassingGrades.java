package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentswithPassingGrades {
    public static  void GradeCheck(List<Students> list, Predicate<Students> predicate)
    {
        System.out.println("Pass Students");
      for(Students stu : list)
      {
          if(predicate.test(stu))
          {
              System.out.println("Name : "+stu.getName()+" Grade : "+stu.getGrade());
          }
      }
    }
    public static void main(String[] args) {
        List<Students> list = new ArrayList();
        list.add(new Students("Kavin",98));
        list.add(new Students("Manoj",78));
        list.add(new Students("Teddy",50));
        list.add(new Students("Rocky",59));
        list.add(new Students("Kumar",88));

        GradeCheck(list,(grade)-> grade.getGrade() > 60 );
    }
}
