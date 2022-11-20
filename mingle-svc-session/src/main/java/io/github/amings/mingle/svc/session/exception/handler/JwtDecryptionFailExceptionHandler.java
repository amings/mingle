package io.github.amings.mingle.svc.session.exception.handler;

import io.github.amings.mingle.svc.exception.handler.abs.AbstractExceptionHandler;
import io.github.amings.mingle.svc.handler.SvcResModelHandler;
import io.github.amings.mingle.svc.session.exception.JwtDecryptionFailException;
import io.github.amings.mingle.svc.session.utils.SessionCodeFiled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ming
 */

@Slf4j
@Component
public class JwtDecryptionFailExceptionHandler extends AbstractExceptionHandler<JwtDecryptionFailException> {

    @Override
    public ResponseEntity<SvcResModelHandler> handle(JwtDecryptionFailException ex) {
        return build(SessionCodeFiled.MGS22);
    }

}
