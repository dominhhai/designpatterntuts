package patterns.chain_of_esponsiblity;

public class LoggerFactory {

	public static Logger getLogger() {
		Logger logger = new DebugLogger(Logger.DEBUG);
		Logger infoLogger = new InfoLogger(Logger.INFO);
		logger.setNext(infoLogger);
		Logger errLogger = new ErrorLogger(Logger.ERROR);
		infoLogger.setNext(errLogger);
		
		return logger;
	}
	
}
