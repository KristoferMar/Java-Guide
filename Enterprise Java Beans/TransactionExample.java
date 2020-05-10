/**
    This is an example of an EJB performing transactions.
 */     
@Stateless                                                                                  // This class is a stateless EJB.
@TransactionManagement(TransactionManagementType.BEAN)                                      // Mark this EJB as bean managed by using the @TransactionManagement(TransactionManagementType.BEAN) annotation.
public class BeanManagedEJB {

    @Inject
    private UserTransaction tx;                                                             // Inject a UserTransaction object. This is used for beginning, committing, and rolling back transactions in this EJB.

    public Integer saveOrder(Order order) {
      try {
            tx.begin();                                                                     // Begin a transaction.

            Integer orderId = createOrder(order);
            raisePurchaseOrder(orderId);

            sendEMail("Your order # " + orderId + "has been placed successfully..." );

            tx.commit();                                                                    // If all the methods execute successfully without any errors, commit the transaction.

            return orderId;
        } catch (Exception e) {
            tx.rollback();                                                                  // If there is an exception due to some failure, perform a rollback of the transaction.
            return null;
        }
...