package com.noCountry.medicGuard.domain.dto.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPutEmployee {
    private String name;
    private String lastname;
    private String email;
}
