/**
    This is an Stateless EJB
 */
@Stateless
public class TodoBean {

  public void addTodo(TodoItem item) {
  ...
  }

  public void findTodo(int id) {
  ...
  }
  ...
  }
...
}

/**
    This is a different class which annotates and uses the EJB above. This class below can be anywhere in our project.
 */
public class TodoClient {

  @EJB                                      // Using TodoBean with annotation
  TodoBean todo;

  TodoItem item = new TodoItem();
  item.setDescription("Buy milk");
  item.setStatus("PENDING");

  //invoke EJB methods
  todo.addTodo(item);
...
}