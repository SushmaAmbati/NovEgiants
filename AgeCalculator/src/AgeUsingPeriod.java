import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeUsingPeriod {
public static void main(String[] args) {
	LocalDate birthdate = LocalDate.of (1992, Month.FEBRUARY, 24);          
	LocalDate now = LocalDate.now();   
	Period p = Period.between(birthdate, now);
	System.out.println(p.getDays());
	System.out.println(p.getMonths());
	System.out.println(p.getYears());
}
}
