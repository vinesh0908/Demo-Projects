package com.swapi.swapiproject.excepion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Represents custom exception class for Starship api.
 *
 * @author Vinesh Kumar
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StarshipNotFoundException extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    /**
     * Represents StarshipNotFoundException.
     *
     * @param httpStatus
     * @param message
     */
    public StarshipNotFoundException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;

    }

    /**
     * Represents StarshipNotFoundException.
     *
     * @param httpStatus
     * @param message
     * @param cause
     */
    public StarshipNotFoundException(HttpStatus httpStatus, String message, Throwable cause) {
        super(message, cause);
        this.httpStatus = httpStatus;
        this.message = message;
    }

    /**
     * Represents StarshipNotFoundException.
     *
     * @param httpStatus
     * @param cause
     */
    public StarshipNotFoundException(HttpStatus httpStatus, Throwable cause) {
        super(cause);
        this.httpStatus = httpStatus;
    }
}
