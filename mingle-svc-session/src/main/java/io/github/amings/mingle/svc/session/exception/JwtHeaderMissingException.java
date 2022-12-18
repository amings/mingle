package io.github.amings.mingle.svc.session.exception;

/**
 * @author Ming
 */
public class JwtHeaderMissingException extends RuntimeException {

    public JwtHeaderMissingException(String message) {
        super(message);
    }
}
