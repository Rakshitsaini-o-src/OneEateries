/**
 * Project Name-   oneeateries
 * Project Author- rakshitsaini
 * Date- 01/05/21_9:43 PM
 * Description- POJO Class for A Restaurant
 **/
package com.oneeateries.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
@Getter @Setter
public class Restaurant implements Serializable {
    @Id
    private String restaurantId;
    private String restaurantName;
    private String menuName;
    private List<MenuItem> menuItem;

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId='" + restaurantId + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuItem=" + menuItem +
                '}';
    }
}
