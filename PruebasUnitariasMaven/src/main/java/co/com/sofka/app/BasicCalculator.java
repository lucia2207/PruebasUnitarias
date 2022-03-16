package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.InvalidParameterException;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long suma(Long number1, Long number2){
        logger.info( "sumar {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long resta(Long number1, Long number2){
        logger.info( "restar {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiplicacion(Long number1, Long number2){
        logger.info( "multiplicar {} * {}", number1, number2);
        return number1 * number2;
    }

    public Long division(Long number1, Long number2){
        logger.info( "dividir {} / {}", number1, number2);
        if(number2 == 0)
            throw new InvalidParameterException("No es divisible entre 0");
        return number1 / number2;
    }
}
