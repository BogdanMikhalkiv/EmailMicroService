package com.example.emailmicroservice.Models.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailRequest {
    String toAddress;
    String subject;
    String message;
}
