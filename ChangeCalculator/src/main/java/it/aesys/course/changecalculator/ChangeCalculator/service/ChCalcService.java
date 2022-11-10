package it.aesys.course.changecalculator.ChangeCalculator.service;

import it.aesys.course.changecalculator.ChangeCalculator.components.ChangeValueMapComponent;
import it.aesys.course.changecalculator.ChangeCalculator.components.exeptions.ComponentExeption;
import it.aesys.course.changecalculator.ChangeCalculator.service.exeption.ServiceExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ChCalcService {

    private ChangeValueMapComponent component;

    @Autowired
    public ChCalcService(ChangeValueMapComponent component) {
        this.component = component;
    }

    /**
     * Method to calc change value
     *
     * @param value
     * @param codeKey
     * @return
     */

    public BigDecimal change(BigDecimal value, String codeKey) throws ServiceExeption {

        try {
            return value.multiply(this.component.getValueChange(codeKey));
        } catch (ComponentExeption ce) {
            ServiceExeption e = new ServiceExeption(ce);
            throw e;
        }
    }

    public void addValue(String currency, BigDecimal changeTax ){
        this.component.addValueChange(currency, changeTax);
    }
}
