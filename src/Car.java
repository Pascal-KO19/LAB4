import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Car {

    @ToString.Include
    private String model;

    @ToString.Include
    @EqualsAndHashCode.Include
    private String brand;

    @ToString.Include
    private int year;

    @ToString.Include
    private double price;

    @ToString.Include
    private String color;

    private int quantity;
}