/**
 * Project Name-   oneeateries
 * Project Author- rakshitsaini
 * Date- 02/05/21_2:22 AM
 * Description- POJO class for menu item
 **/
package com.example.oneeateries.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter @Setter
public class MenuItem {
    @Id
    private String _itemID;
    private String itemName;
    private String description;
    private String price;

    @Override
    public String toString() {
        return "MenuItem{" +
                "_itemID='" + _itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
