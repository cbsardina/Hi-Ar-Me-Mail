package com.sardina.mail.service;

import com.sardina.mail.model.EmailObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;


    @Override
    public void sendEmail(String visitorEmail) throws Exception {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(visitorEmail);
        helper.setSubject("Thank you for visiting hi-AR-me!");

        helper.setText("Body", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>Thank You Email</title>\n" +
                "  </head>\n" +
                "  <body style=\"font-family: sans-serif;background-color: #fff;line-height: 1.6;margin: 2em;display: flex;align-items: center; flex-direction: column;\">\n" +
                "    <div class=\"\">\n" +
                "        <img src=\"cid:banner\" style=\"max-width: 60%;height: auto; margin: 1em auto;\"/>\n" +
                "    </div>\n" +
                "    <div style=\"background-color: #f4f5f7;display: flex;justify-content: center;flex-direction: column;align-items: center;min-width: 100%;height: auto;margin: .5em;padding: .5em\">\n" +
                "      <div style=\"display: flex;justify-content: center;flex-direction: row;background-color: #dadde5;min-width: 100%;height: auto;margin: .5em\">\n" +
                "        <div style=\"display: flex;align-items: flex-start;width: 90%;margin: .5em;padding: .5em\">\n" +
                "          <ul style=\"align-items: center;\n" +
                "          list-style: none;\n" +
                "          margin: .5em;\n" +
                "          padding: .5em;  width: 24%;\">\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h1>Chris Sardina</h1>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"https://www.linkedin.com/in/chrissardina/\">Linkedin</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"mailto:cbsardina@gmail.com\">Email</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.github.com/cbsardina\">GitHub</a></h2>\n" +
                "            </li>\n" +
                "          </ul>\n" +
                "          <ul style=\"align-items: center;\n" +
                "          list-style: none;\n" +
                "          margin: .5em;\n" +
                "          padding: .5em;  width: 24%;\">\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h1>Matthew LePine</h1>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"https://www.linkedin.com/in/matthew-lepine-746a3a37/\">Linkedin</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"mailto:lepinem2002@gmail.com\">Email</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.github.com/lepinem\">GitHub</a></h2>\n" +
                "            </li>\n" +
                "          </ul>\n" +
                "          <ul style=\"align-items: center;\n" +
                "          list-style: none;\n" +
                "          margin: .5em;\n" +
                "          padding: .5em;  width: 24%;\">\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h1>Brandon Aiton</h1>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.BrandonAiton.com\">Portfolio</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.linkedin.com/in/brandon-aiton-227833146\">Linkedin</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"mailto:brandonaiton@gmail.com\">Email</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.github.com/baiton\">GitHub</a></h2>\n" +
                "            </li>\n" +
                "          </ul>\n" +
                "          <ul style=\"align-items: center;\n" +
                "          list-style: none;\n" +
                "          margin: .5em;\n" +
                "          padding: .5em; width: 24%;\">\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h1>Chad Yates</h1>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.ChadYates.me\">Portfolio</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.linkedin.com/in/chad-yates-80939a89\">Linkedin</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"mailto:cayates1989@gmail.com\">Email</a></h2>\n" +
                "            </li>\n" +
                "            <li style=\"text-align: center\">\n" +
                "                <h2><a style=\"text-decoration: none;\" href=\"http://www.github.com/cayates\">GitHub</a></h2>\n" +
                "            </li>\n" +
                "          </ul>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>\n");

        ClassPathResource imgFile = new ClassPathResource("images/hiAR_banner.png");
        helper.addInline("banner", imgFile);

        mailSender.send(message);
    }

}
