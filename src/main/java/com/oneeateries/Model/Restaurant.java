/**
 * Project Name-   oneeateries
 * Project Author- rakshitsaini
 * Date- 01/05/21_9:43 PM
 * Description- POJO Class for A Restaurant
 **/
package com.oneeateries.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.util.List;


@Getter @Setter
@AllArgsConstructor
public class Restaurant {
    @Id
    private String restaurantId;
    private String restaurantName;
    private String menuId;
    private String menuName;
    private List<MenuItem> menuItem;

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId='" + restaurantId + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuItem=" + menuItem +
                '}';
    }
}
