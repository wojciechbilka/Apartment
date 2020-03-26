package apartments;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Apartment {


    private String city;
    private double area;
    private double squarePrice;

    public double getFullPrice() {
        double result =squarePrice * area * 0.95;
        return BigDecimal.valueOf(result).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
    }
}
