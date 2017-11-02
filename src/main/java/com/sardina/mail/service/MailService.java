package com.sardina.mail.service;

import com.sardina.mail.model.EmailObject;

public interface MailService {

    void sendEmail(String visitorEmail) throws Exception;
}
