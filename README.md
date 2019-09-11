# Design Patterns

## Creational Patterns
## Structural Patterns
## Behavioral Patterns
  * ### Strategy Pattern
    Used to change the behavior of an algorithm at runtime. (also known as Policy Pattern)
    
    Let's assume that we have a payment system where different types of payment methods are available, for example it can be a 'paypal' or 'credit card'. First, let's create a Payment interface which will be implemented by our payment methods. 
    Then we'll create concrete implementation of methods that implements our interface.
    So, when we call desired method in our shoppingcart class it will require a paymentMethod. What this means is now we can       modify our program and choose whatever behavior we like at runtime.
    
    <img width="1014" alt="Screen Shot 2019-09-11 at 13 54 49" src="https://user-images.githubusercontent.com/25486099/64691810-48084900-d49c-11e9-928f-3cb2d01fa7cf.png">
    
  * ### Observer Pattern
    ODP defines a 1-to-many dependency between objects so that when one object changes its state, all of its dependents are       notified and updated automatically.
    
    <img width="1053" alt="Screen Shot 2019-09-11 at 16 26 11" src="https://user-images.githubusercontent.com/25486099/64701663-daffae00-d4b1-11e9-98f6-aa8fd84bee50.png">
    

