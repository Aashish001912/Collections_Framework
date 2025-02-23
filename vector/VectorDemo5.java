package com.aashish.vector;

import java.util.Scanner;
import java.util.Vector;

import javax.security.auth.callback.ChoiceCallback;

public class VectorDemo5
{
  public static void main(String[] args) 
  {
	Vector<String> toDoList=new Vector<>();
	Scanner sc=new Scanner(System.in);
	
	int Choice;
	do
	{
		System.out.println("To Do List Menu:");
		System.out.println("1. Add Task");
		System.out.println("2. View Tasks");
		System.out.println("3. Mark Task as Completed");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		
		Choice=sc.nextInt();
		sc.nextLine();
		switch (Choice) 
		{
		case 1:
		    //Add task
			System.out.println("Enter the task description:");
			String task=sc.nextLine();
			toDoList.add(task);
			System.out.println("Task add sucessfully!\n");
			break;
		case 2:
			//View task
			System.out.println("To do list");
			for(int i=0;i<toDoList.size();i++)
			{
				System.out.println((i+1)+"."+toDoList.get(i));
			}
			System.out.println();
			break;
		case 3:
			//Mark Task as completed
			System.out.print("Enter task number to mark as completed: ");
			int taskNumber = sc.nextInt(); //1
			if (taskNumber >= 1 && taskNumber <= toDoList.size())
			{
			String completedTask = toDoList.remove(taskNumber - 1);
			System.out.println("Task marked as completed: " + completedTask + "\n");
			}
			else {
				System.out.println("Invalid task number!\n");
				}
			break;
		case 4:
			System.out.println("Exting to do list application good bye");
			break;

			
		default:
			System.out.println("Invalid choice.pls enter a valid option");
		}
	}
	while(Choice!=4);
	sc.close();
  }
}
