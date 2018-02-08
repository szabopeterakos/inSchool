package datenewtypes;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.of(2017,1,1));
        System.out.println(LocalDate.now().plusWeeks(1).getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println(LocalDate.now().getEra());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().isBefore(LocalDate.now().plusWeeks(1)));
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.now();
        System.out.println(pattern.format(ld));
        System.out.println(ld.format(DateTimeFormatter.ofPattern("|yyyy|MM|dd|")));
        LocalDate ldparse = LocalDate.parse("1990:03:23",DateTimeFormatter.ofPattern("yyyy:MM:dd"));
        System.out.println(ldparse.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        System.out.println(ldparse.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
        System.out.println(ldparse.format(DateTimeFormatter.ofPattern("                             *yyyy*MM*dd*")));
    }

}
