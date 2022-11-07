package org.joonfluence.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserEntity {
    private String id;
    private String name;
    private String phone;
    private String address;
}
