# Design Patterns

## Creational Patterns
## Structural Patterns
  * ### Decorator Pattern
    
     The decorator design pattern allows us to dynamically add functionality and behavior to an **object** without affecting the behavior of other existing objects in the same class. 
    
    Suppose that, there is an ice cream shop, which makes a different types of ice creams. There are many flavours of ice creams to select. Imagine that someone went there and ordered a chocolate ice cream and mint ice cream.
    So, There will be a Ice Cream interface which will be a base component interface for both the original object and decorator object then we'll have a BasicIceCream which is the actual base ice cream which use to make the customer required flavour of ice cream and IceCreamDecorator which is the abstract decorator for the subsequent concrete decorator classes, and lastly flavouredIcecreams(Chocolate,Mint..) which can be one of the concrete implementation of the decorator interface. This decorator class adds desired flavour decoration to the concrete ice cream. Desired flavor(Chocolate,Mint..) is the additional state or feature in this particular instance.
    
        When there are large number of different combinations or options for an object and
        sub-classing is not the optimal solution Decorator Pattern can be used.
    
    <img width="1021" alt="Screen Shot 2019-09-12 at 10 42 19" src="https://user-images.githubusercontent.com/25486099/64764103-0d5cea00-d54a-11e9-8a0c-d851c3fe7ff2.png">

## Behavioral Patterns
  * ### Strategy Pattern
    Used where you want to choose the algorithm to use at runtime. (also known as Policy Pattern)
    
    Let's assume that we have a payment system where different types of payment methods are available, for example it can be a 'paypal' or 'credit card'. First, let's create a Payment interface which will be implemented by our payment methods. 
    Then we'll create concrete implementation of methods that implements our interface.
    So, when we call desired method in our shoppingcart class it will require a paymentMethod. What this means is now we can       modify our program and choose whatever behavior we like at runtime.
    
    <img width="1014" alt="Screen Shot 2019-09-11 at 13 54 49" src="https://user-images.githubusercontent.com/25486099/64691810-48084900-d49c-11e9-928f-3cb2d01fa7cf.png">
    
  * ### Observer Pattern
    ODP defines a 1-to-many dependency between objects so that when one object changes its state, all of its dependents are       notified and updated automatically. In ODP, the object that watch on the state of another object are called **Observer** and the object that is being watched is called **Subject**.
    
    <img width="1053" alt="Screen Shot 2019-09-11 at 16 26 11" src="https://user-images.githubusercontent.com/25486099/64701663-daffae00-d4b1-11e9-98f6-aa8fd84bee50.png">
    
    ###### *References: javagists , journaldev
    

