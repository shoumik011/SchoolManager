
import java.util.*;

/**
 * This class manages employees in a school and their lists/sets.
 * Your implementation of this class or methods should not contains:
 * 1. System.out.println statements. Instead, you need to return the result. 
 * 2. Scanner operations(e.g., input.nextInt()). Instead, refer to the input parameters of this method.
 */

public class SchoolManager {
	
		// TODO: Your implementation starts here
		/*  Your implementation starts here
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
	
	private MyList overtimeList;
    private MySet seminarRegistrationList;

    public SchoolManager() {
        overtimeList = new MyList();
        seminarRegistrationList = new MySet();
    }

    public void addToOvertimeList(Employee employee) {
        overtimeList.add(employee);
    }

    public void addToSeminarRegistrationList(Employee employee) {
        seminarRegistrationList.add(employee);
    }
    
    public int getOvertimeEmployeeCount() {
        return overtimeList.getSize();
    }

    public int getSeminarRegistrationsCount() {
        return seminarRegistrationList.getSize();
    }

    public String displayOvertimeList() {
    	if (overtimeList.isEmpty()) {
            return "Overtime List: No employees in the overtime list.";
        } else {
            return "Overtime List: " + overtimeList.toString();
        }
    }

    public String displaySeminarRegistrationList() {
    	if (seminarRegistrationList.isEmpty()) {
            return "Registration List: No employees in the registration list.";
        } else {
            return "Registration List: " + seminarRegistrationList.toString();
        }
    }

	

}

/**
 * 
 * This class represents an employee in the school management system.
 * Your implementation of this class or methods should not contains:
 * 1. System.out.println statements. Instead, you need to return the result. 
 * 2. Scanner operations(e.g., input.nextInt()). Instead, refer to the input parameters of this method.
 */
class Employee {

	
		// TODO: Your implementation starts here
		/* 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
	 private String name;
	    private int age;
	    private String employeeId;

	    public Employee(String name, int age, String employeeId) {
	        this.name = name;
	        this.age = age;
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(String employeeId) {
	        this.employeeId = employeeId;
	    }
	    
	    @Override
	    public String toString() {
	        return "{" + name + " (ID: " + employeeId + ")}";
	    }

	    @Override
	    public int hashCode() {
	        return employeeId.hashCode();
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Employee employee = (Employee) obj;
	        return employeeId.equals(employee.employeeId);
	    }


	

}

/**
 * 
 * This class represents a container that stores objects in an array-like
 * structure. Your implementation of this class or methods should not contains:
 * 1. System.out.println statements. Instead, you need to return the result. 
 * 2. Scanner operations(e.g., input.nextInt()). Instead, refer to the input parameters of this method.
 */
class Container {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	/**
	 * The initial size of the container.
	 */
	protected final int INITIAL_SIZE = 10;

	/**
	 * The array that holds the objects.
	 */
	protected Object[] list;

	/**
	 * The number of elements currently stored in the container.
	 */
	protected int size;

	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	 public Container() {
	        list = new Object[INITIAL_SIZE];
	        size = 0;
	    }

	    protected void expandCapacity() {
	        int newCapacity = list.length * 2;
	        Object[] newArray = new Object[newCapacity];
	        System.arraycopy(list, 0, newArray, 0, size);
	        list = newArray;
	    }

	    public void add(Object obj) {
	        if (size == list.length) {
	            expandCapacity();
	        }
	        list[size++] = obj;
	    }
	    public Object remove(Object obj) {
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(obj)) {
	                Object removedObj = list[i];
	                System.arraycopy(list, i + 1, list, i, size - i - 1);
	                list[--size] = null;
	                return removedObj;
	            }
	        }
	        return null;
	    }

	    public int getSize() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }
	    
	    public boolean contains(Object obj) {
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(obj)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public int countOccurrences(Object obj) {
	        int count = 0;
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(obj)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    @Override
	    public String toString() {
	        StringBuilder result = new StringBuilder("[");
	        for (int i = 0; i < size; i++) {
	            result.append(list[i]);
	            if (i < size - 1) {
	                result.append(", ");
	            }
	        }
	        result.append("]");
	        return result.toString();
	    }
	    
}

/**
 * This class simulates an ArrayList concept, where you can add unlimited number
 * of elements to the list.
 */
class MyList extends Container {

	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	 public MyList() {
	        super();
	    }

	    @Override
	    public void add(Object obj) {
	        super.add(obj);
	    }

	    @Override
	    public Object remove(Object obj) {
	        return super.remove(obj);
	    }

	    public Object get(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
	        }
	        return list[index];
	    }
	
}

/**
 * This class simulates a custom set that stores unique elements.
 */
class MySet extends Container {
	

	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	 @Override
	    public void add(Object obj) {
	        if (!contains(obj)) {
	            super.add(obj);
	        }
	    }

	    @Override
	    public Object remove(Object obj) {
	        return super.remove(obj);
	    }
}
