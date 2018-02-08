package bank;

public class InvalidBankOperationException extends RuntimeException {

    public enum ErrorCode {
        LOW_BALANCE, INVALID_AMOUNT, INVALID_ACCOUNTNUMBER;
    }

    private ErrorCode errorCode;

    public InvalidBankOperationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
