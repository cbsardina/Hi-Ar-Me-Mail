package com.sardina.mail.service;

import com.sardina.mail.model.EmailObject;

import java.io.IOException;

public interface MailService {

    void sendEmail(String visitorEmail) throws Exception;
    void logVisitor(EmailObject emailObject) throws IOException;

}
