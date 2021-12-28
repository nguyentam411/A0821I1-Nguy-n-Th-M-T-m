package bankaccount.exception;

public class NotFoundBankAccountException extends Throwable {
    public NotFoundBankAccountException(String message){
        super(message);
    }
}
