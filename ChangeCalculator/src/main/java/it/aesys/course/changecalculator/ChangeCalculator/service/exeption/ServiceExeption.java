package it.aesys.course.changecalculator.ChangeCalculator.service.exeption;

public class ServiceExeption extends Exception{

    public ServiceExeption() {
    }

    public ServiceExeption(Throwable cause) {
        super(cause);
    }

    public ServiceExeption(String message) {
        super(message);
    }

    public ServiceExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ServiceExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
