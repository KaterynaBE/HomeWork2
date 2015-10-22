package gift.exceptions;

import java.lang.Exception;

/**
 * Created by ekaterinabut on 10/21/15.
 */

public class EmptyGiftException extends Exception {
    public EmptyGiftException () {
    }

    public EmptyGiftException (String message) {
        super (message);
    }

    public EmptyGiftException (Throwable cause) {
        super (cause);
    }

    public EmptyGiftException (String message, Throwable cause) {
        super (message, cause);
    }
}