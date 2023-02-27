package helpers;
import org.apache.logging.log4j.Logger;
import static helpers.ConsoleColors.*;
public class PrintColor {
    public static void printMessegeInYelow(String massege){
        System.out.println(YELLOW_BRIGHT + massege + RESET);
    }
    public static void printColorMessege(String massege, Logger logger, Level level){
        switch (level){
            case INFO:
                logger.info(GREEN + massege + RESET);
                break;
            case DEBUG:
                logger.debug(YELLOW + massege + RESET);
                break;
            case ERROR:
                logger.error(RED + massege + RESET);
                break;
        }
   }
}
