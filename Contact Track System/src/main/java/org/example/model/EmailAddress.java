package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@AllArgsConstructor
@Getter
@Setter
public class EmailAddress {
    private long emailId;
    private String address;
    private String label;
}
