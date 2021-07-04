package jaz.s20156.jazs20156nbp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Course not found")
public class NotFoundException extends RuntimeException {
}
