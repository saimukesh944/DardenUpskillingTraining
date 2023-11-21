package CollectionsAssignments;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

class cal{
	int day;
	int month;
	int year;
	Calendar c;
	public cal(Calendar c) {
		day=c.get(Calendar.DAY_OF_MONTH);
		month=c.get(Calendar.MONTH);
		year=c.get(Calendar.YEAR);
		this.c=c;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public String getCal() {
		String str=Integer.toString(day)+"-"+Integer.toString(month)+"-"+Integer.toString(year);
		return str;
	}
}
public class Collections04 {

	public static void main(String[] args) {
		cal c=new cal(new GregorianCalendar(2000,5,2));
		cal c1=new cal(new GregorianCalendar(1999,9,23));
		cal c2=new cal(new GregorianCalendar(1998,7,18));
		cal c3=new cal(new GregorianCalendar(1997,11,18));
		cal c4=new cal(new GregorianCalendar(1998,12,18));
		
		LinkedList<cal> ll=new LinkedList<>();
		ll.add(c);
		ll.add(c1);
		ll.add(c2);
		ll.add(c3);
		ll.add(c4);
		
		for(cal dob:ll) {
			int year=dob.getYear();
			if((year%400==0)||((year%4==0)&&(year%100!=0))) {
				System.out.println("Your dob is "+dob.getCal()+" and it was a leap year");
			}
			else 
			{
				System.out.println("Your dob is "+dob.getCal()+" and it was not a leap year");
			}
		}
	}

}
