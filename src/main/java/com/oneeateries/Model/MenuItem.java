/**
 * Project Name-   oneeateries
 * Project Author- rakshitsaini
 * Date- 02/05/21_2:22 AM
 * Description- POJO class for menu item
 **/
package com.oneeateries.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

@EqualsAndHashCode
@Getter @Setter
public class MenuItem implements Serializable {
    @Id
    private String itemID;
    private String itemName;
    private String description;
    private String price;

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemID='" + itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
