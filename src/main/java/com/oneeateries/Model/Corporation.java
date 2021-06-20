/*
 * Project Name-   OneEateries
 * Project Author- rakshitsaini
 * Date- 03/06/21_12:50 AM
 * Description-
 */
package com.oneeateries.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter@Setter
public class Corporation {
    @Id
    private String corporationId;
    private String corporationName;

    @Override
    public String toString() {
        return "Corporation{" +
                "corporationId='" + corporationId + '\'' +
                ", corporationName='" + corporationName + '\'' +
                '}';
    }
}
