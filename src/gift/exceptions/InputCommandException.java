package gift.exceptions;

import java.lang.Exception;

/**
 * Created by ekaterinabut on 10/21/15.
 */

public class InputCommandException extends Exception {
    public InputCommandException () {
    }

    public InputCommandException (String message) {
        super (message);
    }

    public InputCommandException (Throwable cause) {
        super (cause);
    }

    public InputCommandException (String message, Throwable cause) {
        super (message, cause);
    }
}

