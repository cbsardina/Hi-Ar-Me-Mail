package com.sardina.mail.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sardina.mail.model.EmailObject;
import com.sardina.mail.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailController {

    @Autowired
    private MailServiceImpl mailService;

    private ObjectMapper mapper = new ObjectMapper();

    @PostMapping("/send_simple_email")
    @ResponseBody
    String sendEmailInline(@RequestBody String json) throws Exception {
        EmailObject message = mapper.readValue(json, EmailObject.class);
        try {
            mailService.sendEmail(message.getVisitorEmail());
            mailService.logVisitor(message);
            return "Email Sent";
        } catch (Exception ex) {
            return "Error Sending Email: " + ex;
        }
    }
}
