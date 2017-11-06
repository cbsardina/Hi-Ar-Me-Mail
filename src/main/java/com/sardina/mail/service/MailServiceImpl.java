package com.sardina.mail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sardina.mail.model.EmailObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

        helper.setText("Body", HTML);

        ClassPathResource imgFile = new ClassPathResource("images/hiAR_banner.png");
        helper.addInline("banner", imgFile);

        mailSender.send(message);
    }

    final String HTML = "<div class=\"container\"\n" +
            "        style=\"font-family: sans-serif;\n" +
            "              background-color: #dadde5;\n" +
            "              margin: 1em;\n" +
            "              line-height:1.6;\n" +
            "              padding: .5em;\"\n" +
            "  >\n" +
            "\n" +
            "  <!-- * * * 2 ULs * * * -->\n" +
            "  <div class=\"row\" style=\"display: flex;\">\n" +
            "    <!-- - - - - - CHRIS - - - - -  -->\n" +
            "    <ul class=\"col-xs-6\"\n" +
            "          style=\"list-style: none;\n" +
            "                padding: 0;\n" +
            "                width: 48%;\n" +
            "                margin: .5em 0;\"\n" +
            "          >\n" +
            "      <li style=\"text-align: center;\">\n" +
            "          <h2>Chris Sardina</h2>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"https://www.linkedin.com/in/chrissardina/\">Linkedin</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"mailto:cbsardina@gmail.com\">Email</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.github.com/cbsardina\">GitHub</a></h3>\n" +
            "      </li>\n" +
            "    </ul>\n" +
            "    <!-- - - - - -  MATT - - - - -  -->\n" +
            "    <ul class=\"col-xs-6\"\n" +
            "          style=\"list-style: none;\n" +
            "                padding: 0;\n" +
            "                width: 48%;\n" +
            "                margin: .5em 0;\">\n" +
            "      <li style=\"text-align: center;\">\n" +
            "          <h2>Matthew LePine</h2>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"https://www.linkedin.com/in/matthew-lepine-746a3a37/\">Linkedin</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"mailto:lepinem2002@gmail.com\">Email</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.github.com/lepinem\">GitHub</a></h3>\n" +
            "      </li>\n" +
            "    </ul>\n" +
            "  </div>\n" +
            "\n" +
            "  <!-- * * * BANNER * * * -->\n" +
            "  <div class=\"row\">\n" +
            "    <ul class=\"col-xs-12\"\n" +
            "          style=\"list-style: none;\n" +
            "                padding: 0;\n" +
            "                margin: .5em auto;\"\n" +
            "          >\n" +
            "      <li >\n" +
            "        <img style=\"width: 20%;\n" +
            "                  height:auto;\n" +
            "                  display: flex;\n" +
            "                  margin: .5em auto;\"\n" +
            "              src=\"cid:banner\"/>\n" +
            "      </li>\n" +
            "    </ul>\n" +
            "  </div>\n" +
            "\n" +
            "  <!-- * * * 2 UL's * * * -->\n" +
            "  <div class=\"row\" style=\"display: flex;\">\n" +
            "    <!-- - - - - - BRANDON - - - - -  -->\n" +
            "    <ul class=\"col-xs-6\"\n" +
            "          style=\"list-style: none;\n" +
            "                padding: 0;\n" +
            "                width: 48%;\n" +
            "                margin: .5em 0;\"\n" +
            "          >\n" +
            "      <li style=\"text-align: center;\">\n" +
            "          <h2>Brandon Aiton</h2>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.BrandonAiton.com\">Portfolio</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.linkedin.com/in/brandon-aiton-227833146\">Linkedin</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"mailto:brandonaiton@gmail.com\">Email</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.github.com/baiton\">GitHub</a></h3>\n" +
            "      </li>\n" +
            "    </ul>\n" +
            "\n" +
            "    <!-- - - - - - CHAD - - - - -  -->\n" +
            "    <ul class=\"col-xs-6\"\n" +
            "          style=\"list-style: none;\n" +
            "                padding: 0;\n" +
            "                width: 48%;\n" +
            "                margin: .5em 0;\">\n" +
            "      <li style=\"text-align: center;\">\n" +
            "          <h2>Chad Yates</h2>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.ChadYates.me\">Portfolio</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.linkedin.com/in/chad-yates-80939a89\">Linkedin</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"mailto:cayates1989@gmail.com\">Email</a></h3>\n" +
            "      </li>\n" +
            "      <li style=\"text-align: center\">\n" +
            "          <h3><a style=\"text-decoration: none;\" href=\"http://www.github.com/cayates\">GitHub</a></h3>\n" +
            "      </li>\n" +
            "    </ul>\n" +
            "  </div>\n" +
            "\n" +
            "</div>\n";


/** * * * * * * * *
     Visitor Logger
 */
    @Override
    public void logVisitor(EmailObject emailObject) throws IOException {
        String visitorString = "";
        ObjectMapper mapper = new ObjectMapper();
        File newVisitor = new File(LocalDateTime.now() + ".json");
            visitorString = mapper.writeValueAsString(emailObject);
        FileWriter newFile = new FileWriter(newVisitor);
            newFile.write(visitorString);
            newFile.close();
    }
}
