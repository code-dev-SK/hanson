public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int localVal = 50;
		String name = "Shubham";
		Employee e = new Employee();
		e.id=50;
		e.name = "Shubham";
		e.update(localVal, name);
		
		System.out.println(e.id + "         "+ e.name);
		
	}
}

/*
 * Write program:
 * 
 * Create class Employee
 * 
 * Fields: id, name
 * 
 * Method that changes name
 * 
 * Call it and observe behavior
 */
