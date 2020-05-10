/**
    Transactions are both used on class level and on method level.
 */
@Stateless
public class TodoEJB {

  @TransactionAttribute(TransactionAttributeType.REQUIRED)
  public void createTodo(TodoItem item) {
    ...
  }

  @TransactionAttribute(TransactionAttributeType.NEVER)
  public List<TodoItem> listTodos() {
    ...
  }

  @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
  public void logCreateTodo(TodoItem item) {
    ...
  }