package com.swapi.swapiproject.excepion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Represents custom exception class for Starship api.
 *
 * @author Vinesh Kumar
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StarshipAlreadyExistsException extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    /**
     * Represents StarshipAlreadyExistsException.
     *
     * @param httpStatus
     * @param message
     */
    public StarshipAlreadyExistsException(HttpStatus httpStatus, String message) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }

    /**
     * Represents StarshipAlreadyExistsException.
     *
     * @param httpStatus
     * @param message
     * @param cause
     */
    public StarshipAlreadyExistsException(HttpStatus httpStatus, String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.httpStatus = httpStatus;
    }

    /**
     * Represents StarshipAlreadyExistsException.
     *
     * @param httpStatus
     * @param cause
     */
    public StarshipAlreadyExistsException(HttpStatus httpStatus, Throwable cause) {
        super(cause);
        this.httpStatus = httpStatus;
    }
}
