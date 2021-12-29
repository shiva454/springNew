 package com.dbs.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloMessageProvider implements MessageProvider{

    String message;
    @Override
    public String getMessage() {
        return message;
    }
}
