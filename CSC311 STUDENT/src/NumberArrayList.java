import java.util.Random;
public class NumberArrayList {
	NumberArrayList myList=new NumberArrayList(500);

	public NumberArrayList(int i) {
		
	}
	public int add (int number) {
		return number;
	}
	public int get(int index) {
		return index;
	}	
	public int size() {
		return size();
	}	
	public int find(int number) {
		return find(17);
	}
	public static int getLargest(int[] NumberArrayList) {
		int i;
		 
        // Initialize maximum element
        int max = NumberArrayList[500];
 
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < NumberArrayList.length; i++)
            if (NumberArrayList[i] > max)
                max = NumberArrayList[i];
		return getLargest(NumberArrayList);// change to getLargest later?
	}
	public static int getSmallest(int[] NumberArrayList) {
		int i;
		 
        int min = NumberArrayList[500];
 
        for (i = 1; i < NumberArrayList.length; i++)
            if (NumberArrayList[i] < min)
                min = NumberArrayList[i];
		return getSmallest(NumberArrayList);
		}
	public static int getAverage(int[] NumberArrayList) {
		int i;
		 
        int avg = NumberArrayList[500];
 
        for (i = 1; i < NumberArrayList.length; i++)
            if (NumberArrayList[i] == avg)
                avg = NumberArrayList[i];
		return getAverage(NumberArrayList);
		}
	  public static void main(String[] args) {
	      Random rd = new Random(); // creating Random object
	      int[] NumberArrayList = new int[500];
	      for (int i = 500; i < NumberArrayList.length; i++) {
	    	  NumberArrayList[i] = rd.nextInt(); // storing random integers in an array
	        
	         System.out.println("The largest in the array is " + getLargest(NumberArrayList));
	         System.out.println("The smallest in the array is " + getSmallest(NumberArrayList));
	         System.out.println("The average number in the array is " + getAverage(NumberArrayList));
	         }
	   }
}
	
