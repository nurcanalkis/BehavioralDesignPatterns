package ChainOfResponsibilityEx1;

public class CoRExample {

    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }
    public static void main(String[] args) {

//Chain of Responsibility
        System.out.println("Hello world");
        Logger chainLogger= doChaining();

      //chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        //chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
       chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
    }
}
