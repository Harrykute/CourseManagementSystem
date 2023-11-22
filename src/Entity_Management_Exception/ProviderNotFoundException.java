package Entity_Management_Exception;

public class ProviderNotFoundException extends Exception{

    private String message;

    public ProviderNotFoundException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}
