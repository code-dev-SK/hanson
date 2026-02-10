public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int localVal = 50; //stored in Stack area
		Demo d = new Demo(); // d is stores in stack area, new Demo() is stored in Heap area
		d.show();
	}

}


class Demo {
    void show() {
       int methodVal = 10;  //  methodVal is stored in stack area
        System.out.println("Inside show");
    }
}



/*
 * When your program runs, memory is divided into:
 * 
 * 🔹 Heap
 * 
 * Objects live here
 * 
 * Shared among threads
 * 
 * GC works here
 * 
 * 🔹 Stack
 * 
 * Method calls
 * 
 * Local variables
 * 
 * Each thread has its own stack
 * 
 * 🔹 Method Area
 * 
 * Class metadata
 * 
 * Static variables
 */
