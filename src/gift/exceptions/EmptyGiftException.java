package gift.exceptions;

import java.lang.RuntimeException;

/**
 * Exception raised in case if gift weight is equal to zero.
 */

public class EmptyGiftException extends RuntimeException {

    public EmptyGiftException (String message) {
        super (message);
    }
}