package io.github.amings.mingle.svc.exception;

/**
 * @author Ming
 */
public class ReqBodyNotJsonFormatException extends RuntimeException {

    public ReqBodyNotJsonFormatException(String message) {
        super(message);
    }
}
