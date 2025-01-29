package Day20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class DateAndTime {
    public static void main(String[] args) {
        int i;
        List<Event> list = List.of(new Event("College", LocalDateTime.of(2025,1,26,10,0), Duration.ofHours(1))
                ,new Event("School", LocalDateTime.of(2025,1,27,11,0), Duration.ofHours(2))
                ,new Event("School", LocalDateTime.of(2025,1,28,13,0), Duration.ofHours(3)));
        LocalDate filterDate = LocalDate.of(2025, 1, 28);
        list.forEach(System.out::println);
        System.out.println("*************************************************");
       list.stream().filter((date)->date.getDatetime().getDayOfMonth()==28)
               .forEach(System.out::println);
        System.out.println("*************************************************");
      for(i=0;i<list.size()-1;i++)
        {
            Duration duration = Duration.between(list.get(i).getDatetime(),list.get(i+1).getDatetime());
            System.out.println(duration.toHours());
        }
    }
}
