package com.example.emailmicroservice.Controller;

import com.example.emailmicroservice.Models.DTO.EmailRequest;
import com.example.emailmicroservice.Service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/email")
@AllArgsConstructor
public class EmailController {


    private final EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendSimpleEmail(
                emailRequest.getToAddress(),
                emailRequest.getSubject(),
                emailRequest.getMessage()
        );
        return ResponseEntity.ok(emailRequest);
    }



}
