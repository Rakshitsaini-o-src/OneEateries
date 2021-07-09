/*
 * Project Name-   OneEateries
 * Project Author- rakshitsaini
 * Date- 03/06/21_12:50 AM
 * Description-
 */
package com.oneeateries.Model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
@Getter@Setter
public class Corporation implements Serializable {
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
