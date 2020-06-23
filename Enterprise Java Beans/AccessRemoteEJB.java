/**
    An EJB 
 */
package com.redhat.training.ejb;

public interface Calculator {

  public int add(int a, int b);
  public int multiply(int a, int b);
...
}


/**
    We use the EJB by pointing to it's package which is imported into the project. 

    From here we use @Remote to access the class "Calculater" and override and use it's methods.
 */
package com.redhat.training.ejb;

@Stateless
@Remote(Calculator.class)
public class CalculatorBean implements Calculator {

  @Override
  public int add(int a, int b) {
    return a + b;
  }

  @Override
  public int multiply(int a, int b) {
    return a * b;
  }
  ...
  }
...
}