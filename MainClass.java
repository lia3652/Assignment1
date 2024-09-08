package ust.com.assignment1;

public class MainClass {
	
	public static void main(String[] args) {
        ToDoList toDoList = new ToDoList(5);
      
   
        toDoList.addTask("Complete Self Learning","06-09-2024");
        toDoList.addTask("Complete Assessment","07-09-2024");
        toDoList.addTask("Complete Assignments","08-09-2024");
        toDoList.addTask("Complete Java Coding Practice","09-09-2024");
        toDoList.addTask("Complete Java MCQ Practice","10-09-2024");
       
       
        System.out.println("List of Tasks:");
        
        toDoList.displayTasks();
        
        System.out.println();
        
        toDoList.addTask("Complete Java Debugging Practice","11-09-2024");

        System.out.println("\nRemove Task at index 2 :");
        toDoList.removeTask(2);
        
        System.out.println("\nList of Tasks after removal:");
        toDoList.displayTasks();
        
        System.out.println("\nRemove Task at index 6 :");
        toDoList.removeTask(6);
        
        
       
    }


}
