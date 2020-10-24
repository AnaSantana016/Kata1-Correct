package kata1;

import java.time.LocalDate;
import java.time.Month;

public class kata1{

    public static void main(String[] args) {
        Person person = new Person("Luis Hernandez", LocalDate.of(1978, Month.MARCH, 20));
        System.out.print(person.getName() + " " + person.getAge());
    }
    
}