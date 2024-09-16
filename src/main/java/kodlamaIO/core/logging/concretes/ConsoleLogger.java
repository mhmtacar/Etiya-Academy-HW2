package kodlamaIO.core.logging.concretes;

import kodlamaIO.core.logging.abstracts.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
