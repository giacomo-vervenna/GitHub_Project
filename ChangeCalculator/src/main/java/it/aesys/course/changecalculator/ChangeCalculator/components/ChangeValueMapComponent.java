package it.aesys.course.changecalculator.ChangeCalculator.components;

import it.aesys.course.changecalculator.ChangeCalculator.components.exeptions.ComponentExeption;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class ChangeValueMapComponent {

    private final Map<String, BigDecimal> mapChange = new HashMap<>();

    public ChangeValueMapComponent() {
        mapChange.put("eur-usd", new BigDecimal(1.5));
        mapChange.put("usd-eur", new BigDecimal(0.5));
        mapChange.put("eur-chf", new BigDecimal(0.3));
    }

    public BigDecimal getValueChange(String key) throws ComponentExeption {
        if (mapChange.containsKey(key))
            return mapChange.get(key);
        throw new ComponentExeption("Value not found");
    }

    public BigDecimal addValueChange(String key, BigDecimal change) {
       return mapChange.put(key, change);
    }

}