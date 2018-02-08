package intromethods;

public class TodoListMain {
    public static void main(String[] args) {


        TodoList tdl01 = new TodoList();
        tdl01.addTodo("cica");
        tdl01.addTodo("nemcica");
        tdl01.addTodo("fakk");

        for(int i = 0; i < tdl01.getTodos().size(); i++){
            System.out.println(tdl01.getTodos().get(i).caption+" "+tdl01.getTodos().get(i).finished);
        }

        System.out.println();
        tdl01.getTodos().get(0).finish();

        for(int i = 0; i < tdl01.getTodos().size(); i++){
            System.out.println(tdl01.getTodos().get(i).caption+" "+tdl01.getTodos().get(i).finished);
        }

        System.out.println();

        System.out.println(tdl01.numberOfFinishedTodos());
        System.out.println(tdl01.todosToFinish());

        System.out.println(tdl01.ListToString());

        String name = null;
        if("".equals(name)){ // ha ez null akkor a logikai vissza false;
            System.out.println("cucc");
        }

    }
}
