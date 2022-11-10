package it.aesys.course.changecalculator.ChangeCalculator.controller;

import it.aesys.course.changecalculator.ChangeCalculator.service.ChCalcService;
import it.aesys.course.changecalculator.ChangeCalculator.service.exeption.ServiceExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@RestController
@RequestMapping("/change")
public class ChCalcController {

    private ChCalcService service;

    @Autowired
    public ChCalcController(ChCalcService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<BigDecimal> calc(BigDecimal value, String changeCodeKey) throws ServiceExeption {
        try {
            return ResponseEntity.ok(this.service.change(value, changeCodeKey));
        } catch (ServiceExeption se) {
            return ResponseEntity.badRequest().body(new BigDecimal(0));
        }
    }
    @PostMapping
    public String addCurrencyTaxChange(String currency, BigDecimal changeTax) throws ServiceExeption {
        try {
            this.service.addValue(currency, changeTax);
        } catch (IllegalArgumentException iae){
            throw new ServiceExeption("Set a currency and a tax change");
        }
        return "Currency change tax added";
    }
}
