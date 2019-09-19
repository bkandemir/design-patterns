# Design Patterns

## Creational Patterns
  
  * ### Singleton Pattern
  
  When we need only one instance of an object, Singleton ensures that a class has only one instance and provide a global point of access to it
  
  There are various ways to design/code a singleton class.
  
     1 - Eager Initialization Method
     2 - Lazy Initialization Method
     3 - Lazy Initialization with double lock Method
  
  * ### Factory Pattern
  
  A Factory Pattern or Factory Method Pattern says that just define an **interface** or **abstract class** for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
     
     Factory Pattern promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.
     That means the code interacts solely with the resultant interface or abstract class,
     so that it will work with any classes that implement that interface or that extends that abstract class.
  
  <img width="1080" alt="Screen Shot 2019-09-13 at 09 27 10" src="https://user-images.githubusercontent.com/25486099/64841767-b833dd80-d608-11e9-8689-0597a7ec08c2.png">
  
## Structural Patterns
  * ### Decorator Pattern
    
     The decorator design pattern allows us to dynamically add functionality and behavior to an **object** without affecting the behavior of other existing objects in the same class. 
    
    Suppose that, there is an ice cream shop, which makes a different types of ice creams. There are many flavours of ice creams to select. Imagine that someone went there and ordered a chocolate ice cream and mint ice cream.
    So, There will be a Ice Cream interface which will be a base component interface for both the original object and decorator object.
    
    Then we'll have a BasicIceCream class which is the actual base ice cream which use to make the customer required flavour of ice cream.
    
    IceCreamDecorator is the abstract decorator for the subsequent concrete decorator classes, and lastly flavouredIcecreams(Chocolate,Mint..) which can be one of the concrete implementation of the decorator interface. This decorator class adds desired flavour decoration to the concrete ice cream. 
    
    Desired flavor(Chocolate,Mint..) is the additional state or feature in this particular instance.
    
        When there are large number of different combinations or options for an object and
        sub-classing is not the optimal solution Decorator Pattern can be used.
    
    <img width="1021" alt="Screen Shot 2019-09-12 at 10 42 19" src="https://user-images.githubusercontent.com/25486099/64764103-0d5cea00-d54a-11e9-8a0c-d851c3fe7ff2.png">
    
    
  * ### Adapter Pattern
      Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. The object that joins these unrelated interface is called an Adapter.
      
      Let's assume that we are travelling the world and we end up in US, assuming that you live in Turkey, these two countries have different types of wall sockets. So you'll need an **adapter**  in order to charge your electronics. So, adapter makes it so that interface A and interface B are totally not quite related with each other and an adapter comes in to facilitate that interaction that interface that should happen between those two.
      
      In below diagram, Client is implemented against the target interface which means the client only sees the target interface, you can see there in the target interface will have a method called request() and then we have an adapter which implements the target. Now the adapter here is composed with Adaptee, all the requests get delegated to the Adaptee, so that Adaptee is the one that will get all of those delegations from requests. So the idea here is that the Adaptee and the Client are supposed to connect but they can't connect because they are two different things. So we need some sort of an adapter.
Now this adapter here will connect to the target which will know exactly what to do in order to make Client and Adaptee connection possible.
      
      <img width="1062" alt="Screen Shot 2019-09-17 at 11 13 44" src="https://user-images.githubusercontent.com/25486099/65023807-4b884e00-d93c-11e9-9c2d-05da5606e7fa.png">

   * ### Facade Pattern
     Provides a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a higher-level interface that makes the subsystem easier to use.
     
     Suppose that we want to put together a computer system. Nowadays, a computer has a lot of different components so we have different subsystems that put together will create will make up what a computer is. So we'll have CPU, hard drive memory, monitor, mouse and so many other components that will need to come together in order for us to have an actual computer So if we wanted to actually create a computer we'll need to put together all of these components. Let's say we want to emulate a computer system in code. So that means we'll have to create a CPu class, hard drive class, memory class or class mouse class etc. You know this will have a lot of different subclasses that will need to put together in order for us to create this system with a computer simulation for say. We'll need to know about CPU , hard drive to do things we need to know by memory allocation. So the facade pattern provides a simplified interface to a larger body of code or system.
Right so we put together under one umbrella all of the system that needs to be abstracted out and we use the facade to communicate with that subsystem as opposed to Client having to know everything about all of this subsystem. So now if you want to for instance put together the computer we just call the computer facade.
     
     <img width="1039" alt="Screen Shot 2019-09-17 at 13 34 55" src="https://user-images.githubusercontent.com/25486099/65034589-0241f980-d950-11e9-8eac-07f506102881.png">
   
   
## Behavioral Patterns
  * ### Command Pattern
    The Command Pattern encapsulates a request as an object (Game Card) thereby letting you parameterize other objects with different requests, queues or log requests.
    
    To understand command design pattern we should understand the associated key terms like client, command, command implementation, invoker, receiver.

        1 - Command is an interface with execute method. It is the core of contract.
        2 - A client creates an instance of a command implementation and associates it with a receiver.
        3 - An invoker instructs the command to perform an action.
        4 - A Command implementation’s instance creates a binding between the receiver and an action.
        5 - Receiver is the object that knows the actual steps to perform the action.
    
    In Command Pattern, the request is send to the invoker and invoker pass it to the encapsulated command object.
  Command object passes the request to the appropriate method of Receiver to perform the specific action.
    
   <img width="1092" alt="Screen Shot 2019-09-16 at 15 11 09" src="https://user-images.githubusercontent.com/25486099/64956874-48d21e00-d894-11e9-8abf-935a9e65526e.png">
  
  * ### Strategy Pattern
    Used where you want to choose the algorithm to use at runtime. (also known as Policy Pattern)
    
    Let's assume that we have a payment system where different types of payment methods are available, for example it can be a 'paypal' or 'credit card'. First, let's create a Payment interface which will be implemented by our payment methods. 
    Then we'll create concrete implementation of methods that implements our interface.
    So, when we call desired method in our shoppingcart class it will require a paymentMethod. What this means is now we can       modify our program and choose whatever behavior we like at runtime.
    
    <img width="1014" alt="Screen Shot 2019-09-11 at 13 54 49" src="https://user-images.githubusercontent.com/25486099/64691810-48084900-d49c-11e9-928f-3cb2d01fa7cf.png">
    
  * ### Observer Pattern
    ODP defines a 1-to-many dependency between objects so that when one object changes its state, all of its dependents are       notified and updated automatically. In ODP, the object that watch on the state of another object are called **Observer** and the object that is being watched is called **Subject**.
    
    <img width="1053" alt="Screen Shot 2019-09-11 at 16 26 11" src="https://user-images.githubusercontent.com/25486099/64701663-daffae00-d4b1-11e9-98f6-aa8fd84bee50.png">
    
  * ### Template Pattern
    Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.
    
    Let's suppose that you are in the game development business. Build mobile games video games console games etc. Client Number one says please create a football game, console game or a mobile game game and their client asks you to create a hockey game. The other one comes back and say hey, create a basketball game. 
    
    One thing we start noticing real quick is that certain methods or certain properties are pretty much the same regardless of which kind of games that you'll be creating. For instance for football game you have initialize. You have start play. So those are the basics. And for hockey game again you have initialize games, start play. Now if you start putting together the higher key code or the classes hierarchy of all your games you noticed this is not a good strategy because this gets very redundant. 
      
    So, abstract out the main components for all games so that any other class other game that I create will inherit or implement for them or abstract class game. Now each game football game may want to initialize it differently or the start may be a little bit different. So the template method pattern essentially what it does it encapsulates algorithm so that each subclass it's able to tweak if it needs certain properties or certain functions that it needs certain properties or the way it does things.
    
    <img width="790" alt="Screen Shot 2019-09-17 at 16 51 24" src="https://user-images.githubusercontent.com/25486099/65047634-72aa4400-d96b-11e9-846d-2ba8d3253292.png">
    
    * ### Iterator Pattern
      Iterator pattern provides a way to access the elements of an aggregate object without exposing its underlying represenation.
      
      Suppose that we have a store1 and store2. Both stores have inventories. but one of them stores it in arraylist while another one is storing in array. Let's say store1 is doing so well so they've decided to merge. The problem is when they merge their inventories were different. So deveopers decide that to get data from different store they created different for loops. When a new store is needed we need to implement differnt loops and etc. Well the solution is to create or use an iterator. An iterator is an interface that we can use to create different types of iterators that will encapsulate the way we interact the way we iterate through a collection of objects. What this means is now if we have a inventory1 we could have also have even inventory2 which will then implement the iterator interface as it can see at the top there.
      Right now all we have to do is just use the inventory1 which will know exactly how to get objects how to get the products from our inventory1. Same thing we can use to have inventory to do the same to get the inventory for our store2. So now we've abstracted we've encapsulated the way we iterate through our collection of objects.
      
      <img width="776" alt="Screen Shot 2019-09-19 at 13 53 51" src="https://user-images.githubusercontent.com/25486099/65239470-b9bd4400-dae7-11e9-8e58-a992062ddd5f.png">

      
    
    ###### *References: javagists , journaldev
    

