import ChainOfResponsibilityEx1.ConsoleBasedLogger;
import ChainOfResponsibilityEx1.DebugBasedLogger;
import ChainOfResponsibilityEx1.ErrorBasedLogger;
import ChainOfResponsibilityEx1.Logger;

import State1.ContextState1;
import State1.StartState;
import State1.StopState;
import State2.Controller;
import Strategy01.Addition;
import Strategy01.Context;
import Strategy01.Multiplication;
import Strategy01.Subtraction;
import Strategy2.CreditCardStrategy;
import Strategy2.Item;
import Strategy2.PaypalStrategy;
import Strategy2.ShoppingCart;
import Template1.Chess;
import Template1.Game;
import Template1.Soccer;
import Template2.GlassHouse;
import Template2.HouseTemplate;
import Template2.WoodenHouse;
import Visitor1.*;
import Visitor2.Computer;
import Visitor2.ComputerPart;
import Visitor2.ComputerPartDisplayVisitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    static Controller controller;
    public static void state2demo(String con) {
        controller = new Controller();
        //the following trigger should be made by the user
        if(con.equalsIgnoreCase("management"))
            controller.setManagementConnection();
        if(con.equalsIgnoreCase("sales"))
            controller.setSalesConnection();
        if(con.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }

    //returns the total service charge of all the vehicles that are gone under full service
    private static int calculateTotal(Vehicle[] vehicles) {
        VehicleInspector inspector = new VehicleInspection();
        int total = 0;
        for(Vehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
    /*
       //Chain of Responsibility
        System.out.println("Hello world");
        Logger chainLogger= doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");

     */



/*

        //Command example 1
        Document doc = new Document();
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();

 */
/*
        //Command example 2
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();

 */
        /*

        //MEMENTO Ex1
        Originator originator = new Originator();

        Caretaker careTaker = new Caretaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Third saved State: " + originator.getState());


*/

/*
        //Memento Ex2
        //Main as caretaker
        Article article = new Article(1, "My Article");
        article.setContent("ABC");    //original content
        System.out.println(article);

        ArticleMemento memento = article.createMemento(); //created immutable memento

        article.setContent("123");    //changed content
        System.out.println(article);

        article.restore(memento);   //UNDO change
        System.out.println(article);  //original content

 */



/*
       //ITERATOR
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();

 */




/*


        //OBSERVER
        System.out.println("Enter Text >");

        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource();

        // create first observer
        final ResponseHandler1 responseHandler1 = new ResponseHandler1();

        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler1);


        // create second observer
        final ResponseHandler2 responseHandler2 = new ResponseHandler2();

        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler2);

        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
        */




    /*
        //Observer Ex2 Alarm System
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();

     */
/*
        //MEDIATOR EX1 Chat
        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setname("Nurcan Alkis");
        u1.sendMsg("Hi Nurcan! how are you?");


        User2 u2=new User2(chat);
        u2.setname("Fatih Bayhan");
        u2.sendMsg("I am Fine ! You tell?");

 */

/*


        //MEDIATOR EX2 FLIGHT
        IATCMediator atcMediator = new ATCMediator();

        Flight sparrow101 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);
        atcMediator.registerFlight(sparrow101);
        atcMediator.registerRunway(mainRunway);
        sparrow101.getReady();
        mainRunway.land();
        sparrow101.land();

 */



/*
        //INTERPRETER EX1
        String infix = "a*d*c+e";

        InfixToPostfixPattern ip=new InfixToPostfixPattern();

        String postfix = ip.conversion(infix);
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + postfix);

 */



/*

        //Interpreter EX2
        Expression person1 = new TerminalExpression("Nurcan");
        Expression person2 = new TerminalExpression("Fatih");
        Expression isSingle = new OrExpression(person1, person2);

        Expression leyla = new TerminalExpression("leyla");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(leyla, committed);

        System.out.println(isSingle.interpreter("Nurcan"));
        System.out.println(isSingle.interpreter("Fatih"));
        System.out.println(isSingle.interpreter("Nurcan Fatih"));

        System.out.println(isCommitted.interpreter("Committed, leyla"));
        System.out.println(isCommitted.interpreter("Single, Leyla"));

 */
/*
//STRATEGY1
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first value: ");
        float value1=Float.parseFloat(br.readLine());
        System.out.print("Enter the second value: ");
        float value2=Float.parseFloat(br.readLine());

        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(value1, value2));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));

 */


/*
        //STRATEGY2
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "1234"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Nurcan Alkis", "1234567890123456", "786", "12/15"));

 */

/*
        //State ex1
        ContextState1 context = new ContextState1();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

 */

/*

        //State02 example
        String accounting="accounting";
        String sales="Sales";
        String management="Management";
        state2demo(accounting);
        System.out.println("------------------");
        state2demo(sales);
        System.out.println("------------------");

        state2demo(management);

 */
/*
    //TEmplate 1
        Game chess=new Chess();
        chess.play();
        Game soccer=new Soccer();
        soccer.play();

 */


/*

        //Template 2
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();

 */




/*
    //Visitor1

        Vehicle[] vehicles = new Vehicle[]{
                new Car("Black", 2010),
                new Van(5000, 6),
                new Motorbike(100, "TVS")
        };
        int totalCost = calculateTotal(vehicles);
        System.out.println("Total Service Charge: " + totalCost);

 */





        //Visitor2

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());





    }
}
