package CH2.TaskV2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String itemName;
    private int quantity;
    private int price;
}

