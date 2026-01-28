package com.example.emailmicroservice.Service;

public interface EmailService {
    void sendSimpleEmail(String toAddress, String subject, String message);

}
