package intromethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    void addTodo(String caption){
        Todo ntd = new Todo(caption);
        todos.add(ntd);
    }

    void finishTodos(String caption){
        for(Todo todo: todos){
            if(todo.equals(caption)){
//                todos.remove(todo);
                todo.finish();
            }
        }
    }

    //egyszerre több tennivalót lehet befejezni
    void finishAllTodos(List<String> todosToFinish){
        for(int i = 0; i < todos.size(); i++){
            for(int j = 0; j < todosToFinish.size(); j++){
                if(todos.get(i).equals(todosToFinish.get(j))){
                    todos.get(i).finish();
                }
            }
        }
    }

    //visszaadja a befejezendő tennivalók neveit
    List<String> todosToFinish(){
        List<String> temp = new ArrayList<>();
        for(Todo td :todos){
            if(td.finished == true){
                temp.add(td.caption);
            }
        }
        return  temp;
    }

    // visszaadja a befejezett tennivalók számát
    int numberOfFinishedTodos(){
        int sum = 0;
        for(Todo td :todos){
            if(td.finished == false){
                sum += 1;
            }
        }
        return sum;
    }

    public String ListToString(){
        String temp = "";

        for(Todo td :todos){
            temp += td.getCaption() + " ";
        }

        return temp;
    }


}
