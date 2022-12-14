import ChainOfResponsibilityEx1.ConsoleBasedLogger;
import ChainOfResponsibilityEx1.DebugBasedLogger;
import ChainOfResponsibilityEx1.ErrorBasedLogger;
import ChainOfResponsibilityEx1.Logger;
import CommandEx1.*;
import CommandEx2.*;

import InterpreterEX1.InfixToPostfixPattern;
import InterpreterEx2.AndExpression;
import InterpreterEx2.Expression;
import InterpreterEx2.OrExpression;
import InterpreterEx2.TerminalExpression;
import IteratorEx1.NotificationBar;
import IteratorEx1.NotificationCollection;
import MediatorEx1.ApnaChatRoom;
import MediatorEx1.ApnaChatRoomImpl;
import MediatorEx1.User1;
import MediatorEx1.User2;
import MediatorEx2.ATCMediator;
import MediatorEx2.Flight;
import MediatorEx2.IATCMediator;
import MediatorEx2.Runway;
import MementoEx1.Caretaker;
import MementoEx1.Originator;
import MementoEx2.Article;
import MementoEx2.ArticleMemento;
import ObserverEx1.EventSource;
import ObserverEx1.ResponseHandler1;
import ObserverEx1.ResponseHandler2;
import ObserverEx2.Gates;
import ObserverEx2.Lighting;
import ObserverEx2.SensorSystem;
import ObserverEx2.Surveillance;

import java.util.Arrays;
import java.util.List;

public class MainClass {

    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }


    public static void main(String[] args) {
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








    }
}
