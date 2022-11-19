package it.aesys.course.changecalculator.ChangeCalculator.components.exeptions;

public class ComponentExeption extends Exception{
    public ComponentExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ComponentExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ComponentExeption(Throwable cause) {
        super(cause);
    }

    public ComponentExeption() {
    }

    public ComponentExeption(String message) {
        super(message);
    }
}
