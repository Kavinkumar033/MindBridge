package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModifyStudentGrades {
    public  static  void ModifyGrades(List<Students> list, Consumer<Students> consumer)
    {
        for(Students stu : list)
        {
            consumer.accept(stu);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Students> list = new ArrayList();
        list.add(new Students("Kavin",98));
        list.add(new Students("Manoj",78));
        list.add(new Students("Teddy",50));
        list.add(new Students("Rocky",59));
        list.add(new Students("Kumar",88));
        System.out.println(list);
        System.out.println("---------------------------------------");
        ModifyGrades(list,(grade)-> grade.setGrade(grade.getGrade()+10));
        System.out.println("------------------------------------------------------------------------");
      //  Consumer<Students> consumer = (change)-> change.setGrade(change.getGrade()+10);


    }
}
