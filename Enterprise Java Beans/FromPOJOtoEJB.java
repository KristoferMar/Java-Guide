// The following is a POJO
public class TodoBean {

  public void addTodo(TodoItem item) {
  ...
  }

  public void findTodo(int id) {
  ...
  }

  public void updateTodo(TodoItem item) {
  ...
  }

  public void deleteTodo(int id) {
  ...
  }
}

// We convert this POJO to an stateless EJB by doing the following 
@Stateless
public class TodoBean {
...
}

// We convert this POJO to a stateful EJB by doing the following 
@Stateful
public class TodoBean {
...
}

// We convert this POJO to a singleton EJB by doing the following 
@Singleton
public class TodoBean {
...
}


// This is a singleton EJB which is initialized for application startup and uses the init() method to setup its initial state.
@Singleton
@Startup
public class TodoBean {

  @PostConstruct
  public void init() {
    // do some initialization
  }
...
}