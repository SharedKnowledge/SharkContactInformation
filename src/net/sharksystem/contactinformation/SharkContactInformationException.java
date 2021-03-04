package net.sharksystem.contactinformation;

import net.sharksystem.SharkException;

public class SharkContactInformationException extends SharkException {
    public SharkContactInformationException() {
        super();
    }
    public SharkContactInformationException(String message) {
        super(message);
    }
    public SharkContactInformationException(String message, Throwable cause) {
        super(message, cause);
    }
    public SharkContactInformationException(Throwable cause) {
        super(cause);
    }
}
