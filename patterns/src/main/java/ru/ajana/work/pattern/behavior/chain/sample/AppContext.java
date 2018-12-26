package ru.ajana.work.pattern.behavior.chain.sample;

/**
 * @author Andrey Kharintsev on 26.12.2018
 */
public class AppContext {

  public static void main(String[] args) {
    // Build the chain of responsibility
    Logger logger, logger1, logger2;
    logger = new StdoutLogger(Logger.DEBUG);
    logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
    logger2 = logger1.setNext(new StderrLogger(Logger.ERR));

    // Handled by StdoutLogger
    logger.message("Entering function y.", Logger.DEBUG);

    // Handled by StdoutLogger and EmailLogger
    logger.message("Step1 completed.", Logger.NOTICE);

    // Handled by all three loggers
    logger.message("An error has occurred.", Logger.ERR);
  }
  /*
The output is:
   Writing to stdout:   Entering function y.
   Writing to stdout:   Step1 completed.
   Sending via e-mail:  Step1 completed.
   Writing to stdout:   An error has occurred.
   Sending via e-mail:  An error has occurred.
   Writing to stderr:   An error has occurred.
*/
}
