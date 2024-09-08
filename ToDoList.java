package ust.com.assignment1;

public class ToDoList {
	

	private Task[] tasks;
	private int taskcount;
	

	public Task[] getTasks() {
		return tasks;
	}


	public ToDoList(int size) {
		tasks=new Task[size];
		taskcount=0;
	}


	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}


	
	
	public void addTask(String description,String duedate)
	{
		
		if(taskcount<tasks.length)
		{
			tasks[taskcount]=new Task(description,duedate);
			taskcount++;
		}
		else {
            System.out.println("To-Do List is full. Not possible to  add more tasks.");
		
	}
	}
	
	public void removeTask(int index)
	{
		
		if(index>=0 && index<taskcount)
		{
			for(int i=index;i<taskcount-1;i++)
			{
				tasks[i]=tasks[i+1];
			}
			
			--taskcount;
			
			tasks[taskcount]=null; //Remove the last element
		}
		
		else
		{
			System.out.println("Invalid index entered. Not possible to remove task.");
		}
		
	}
	
	
	public void displayTasks()
	{
		if(taskcount==0)
			System.out.println("Task List is empty to be displayed");
		else
		{
			for(int i=0;i<taskcount;i++) {
				System.out.println("Task"+(i+1)+" : "+tasks[i]);
			}
			}
		}
	}
	
	
	
	

