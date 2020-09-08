import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementB {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {

		System.out.println("Hi");
		 List<Employee> emplist=new ArrayList<>(); 
		    emplist.add(new Employee(1L, 34, 400000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "sachin", "sachin@123", 1L, "IT","Mumbai"));
		    emplist.add(new Employee(2L, 32, 1300000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), false, "Jiya", "Jiya@123", 2L, "HR","Mumbai"));
		    emplist.add(new Employee(3L, 19, 150000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Paul", "paul@123", 1L, "Infrastructure","Mumbai"));
		    emplist.add(new Employee(4L, 23, 190000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Nima", "Nima@123", 2L, "Account And Finance","Pune"));
		    emplist.add(new Employee(5L, 42, 4500000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), false, "Iqbal", "Iqbal@123", 1L, "Product Development","Mumbai"));
		    emplist.add(new Employee(6L, 50, 5000000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Manu", "manu@123", 2L, "Product Development","Pune"));
		    emplist.add(new Employee(7L, 24, 300000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Wang", "Wang@123", 2L, "IT","Chennai"));
		    emplist.add(new Employee(8L, 61, 7000000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Jaden", "jaden@123", 2L, "IT","Mumbai"));
		    emplist.add(new Employee(9L, 38, 3500000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Amelia", "Amelia@123", 1L, "Product Development","Chennai"));
		    emplist.add(new Employee(10L, 31, 1900000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Jasna", "Jasna@123", 2L, "IT","Mumbai"));
		    emplist.add(new Employee(11L, 32, 2000000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Nitin", "Nitin@123", 2L, "Account And Finance","Pune"));
		    emplist.add(new Employee(12L, 33, 2200000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), false, "Jyothi", "Jyothi@123", 1L, "IT","Mumbai"));
		    emplist.add(new Employee(13L, 46, 4800000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "Sanvi", "Sanvi@123", 2L, "Infrastructure","Chennai"));
		    emplist.add(new Employee(14L, 51, 6000000L, new SimpleDateFormat("dd-MM-yyyy").parse(("12-08-2019")), true, "yogendra", "yo@123", 2L, "HR","Mumbai"));
		    System.out.println("All active employee above age 40");
		   emplist.stream().filter(e -> e.getAge()> 40 && e.getStatus().equals(true)).collect(Collectors.toList()).forEach(System.out::println);
		   
		   System.out.println("All active employee above age 40 and ctc less than 2 lakh");
		   emplist.stream().filter(e -> e.getAge()> 40 && e.getStatus().equals(true) && e.getAnnualCtc() > 200000).collect(Collectors.toList()).forEach(System.out::println);
		    
		
		   System.out.println("All active employee between salary 2 lakh and 5 lakh");
		   
		   emplist.stream().filter(e ->  e.getStatus().equals(true) && e.getCityName().equalsIgnoreCase("mumbai") && e.getAnnualCtc() >=200000 && e.getAnnualCtc() <=500000).forEach(System.out::println);
				
	}

}
