package com.br.breno.emailmicroservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
