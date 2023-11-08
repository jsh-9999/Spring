package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantitiy;

    public Item(){

    }
    public Item(String itemName, Integer price, Integer quantitiy) {
        this.itemName = itemName;
        this.price = price;
        this.quantitiy = quantitiy;
    }


}
