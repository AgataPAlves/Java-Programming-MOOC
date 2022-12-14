
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class TodoList {
    
    private ArrayList<String> tasks;
    
    public TodoList(){
        this.tasks =  new ArrayList<>();
    }
    
    public void add(String task){
        tasks.add(task);
    }
    
    public void print(){
        for(String task: tasks){
            int taskNumber = tasks.indexOf(task) + 1;
            System.out.println(taskNumber + ": " + task);
        } 
    }
    
    public void remove(int number){
        tasks.remove(number - 1);
    }
}
