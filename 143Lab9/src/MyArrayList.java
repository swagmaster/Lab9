import java.util.*;
import java.util.Comparator;

/**
 * This class implements multiple sort algorithms to be used with ints, chars, and Stings.
 * Bubble sort, Selection sort, and Insertion sorts are implemented here
 * 
 * @author Adam Atienza
 * @version (CSSSKL 143)
 */
 
public class MyArrayList implements Comparable<MyArrayList>{
   
    // instance data
    protected int[] IntList;
    protected char[] CharList;
    protected String[] StringList;
    
     // constructor will build all 3 arrays here
    public MyArrayList() {
        this.IntList = new int[10];
        this.CharList = new char[10];
        this.StringList = new String[5];
        
        // fill all 3 arrays with data
        for(int i = 0; i < IntList.length; i++) {
            IntList[i] = (int) (Math.random()*52);
       }
	   
       // Populate char array
       for(int i = 0; i < CharList.length; i++) {
           
          Random random = new Random();
          CharList[i] = (char)(random.nextInt(26) + 'a');
       }
	   
       // Populate String array
       StringList[0] = "joe";
       StringList[1] = "mark";
       StringList[2] = "abbey";
       StringList[3] = "tony";
       StringList[4] = "kevin";    
    }
    
    public int compareTo(MyArrayList other) {
    	if(this.IntList[0] < other.IntList[0]) {
			System.out.println("compareTo() is returning -1, array[0] < other[0]"); 
			return -1;
		} else if(this.IntList[0] > other.IntList[0]) {
			System.out.println("compareTo() is returning 1, array[0] > other[0]");
			return 1;
		} else {
			System.out.println("compareTo() is returning 0, array[0] != other[0] ");
			return 0;
		}
    }

    
    public void intBubbleSort() {
     // Implement your sort, call a helper swap method 
    	for (int i = 0; i < IntList.length-1; i++) {
			for (int j = 0; j < IntList.length-i-1; j++) {
				if (IntList[j] > IntList[j + 1]) { 
					swapInts(IntList, j);
				} 
			}
		}
    }
        
    
    public void CharBubbleSort() {
       // Implement your sort, call a helper swap method 
    	for (int i = 0; i < CharList.length-1; i++) {
			for (int j = 0; j < CharList.length-i-1; j++) {
				if (CharList[j] > CharList[j+1]) { 
					swapChars(CharList,j);
				} 
			}
		}
            
    }
    
    public void stringBubbleSort() {
       // Implement your sort, call a helper swap method 
    	for (int i = 0; i < StringList.length - 1; i++) {
    		for (int j = 0; j< StringList.length - 1; i++) {
    			if (StringList[j].compareToIgnoreCase(StringList[j+1]) > 0) { 
					swapStrings(StringList,j);
				} 
    		}
    	}
    }


    public void swapInts(int[] intList, int j) { 
       // code for swapping ints
    	int temp = intList[j]; 
		intList[j] = intList[j+1]; 
		intList[j+1] = temp;
    }
    
    public void swapChars(char[] charList, int j) { 
        // code for swapping chars 
    	char temp = charList[j]; 
		charList[j] = charList[j+1]; 
		charList[j+1] = temp;
    }
    
    public void swapStrings(String[] stringList, int j) { 
        // code for swapping Strings 
    	String temp = stringList[j]; 
		stringList[j] = stringList[j+1]; 
		stringList[j+1] = temp;
    }
    
    //selection sort for ints
    public void selectionSort() {
        // Implement your sort, call swapSelection(int[] intList, int i, int nextMin) 
    	for(int i = 0; i < IntList.length - 1; i++) {
    		int min = i;
    		for(int j = i + 1; j < IntList.length; j++) {
    			if(IntList[j] < IntList[min]) {
    				swapSelection(IntList, i, min);
    			}
    		}
    	}
    	
    }
    
    //selection sort for Strings
    public void stringSelectionSort() {
       // Implement your sort, call swapSelectionStrings(String[] StringList, int i)
	   // and findSmallest(IntList, i, IntList.length) from your method
    	for(int i = 0; i < StringList.length - 1; i++) {
    		int min = i;
    		for(int j = i + 1; j < StringList.length; j++) {
    			findSmallest(IntList, i, IntList.length);
    			if(IntList[j] < IntList[min]) {
    				swapSelectionStrings(StringList, i);
    			}
    		}
    	}
    }
    
    public void swapSelection(int[] intList, int i, int nextMin) { 
        // Your code here to swap int values
    	int temp = IntList[nextMin]; 
        IntList[nextMin] = IntList[i]; 
        IntList[i] = temp; 
    }
    
    public void swapSelectionStrings(String[] StringList, int i) { 
         // Your code here to swap values
    	String temp = StringList[i]; 
		StringList[i] = StringList[i+1]; 
		StringList[i+1] = temp;
    }
    
    
    
    public int findSmallest(int[] arr, int begin, int end) {
        //returns the index of the smallest element
        int minIndex = begin;       //hint
        for(int i = begin; i < end ; i++) {
            if(arr[begin - 1] < arr[begin]) {
                minIndex = begin;
            } else 
                minIndex = begin - 1;
        }
        return minIndex;
    }
    
    //Insertion Sort 
    public void insertionSort() {
	
		for(int i = 0; i < IntList.length - 1; i++) {
            //note -1 above since we’re dealing with neighbors (a, a+1)
            int current = IntList[i];
            //int hole = i;
            
            while( i > 0 && IntList[i - 1] > current ) { //while “out of place”
                  //slide data to the left moving the “hole” left
            	IntList[i + 1] = IntList[i];
            	i--;
            }  
            IntList[i + 1] = current;
            
        }  
    } 
} 

    

