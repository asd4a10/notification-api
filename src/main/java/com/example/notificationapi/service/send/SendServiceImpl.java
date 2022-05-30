package com.example.notificationapi.service.send;

import com.example.notificationapi.feign.ClientFeign;
import com.example.notificationapi.model.ClientDTO;
import com.example.notificationapi.model.CommentDTO;
import com.example.notificationapi.model.MerchDTO;
import com.example.notificationapi.service.email.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SendServiceImpl implements SendService{

    @Autowired
    EmailService emailService;

    @Autowired
    ClientFeign clientFeign;

    @Override
    public void sendMerch(MerchDTO merchDTO) {
        String toMail=merchDTO.getEmail(), subject="You created a New Merch", body="Hello Sir"+merchDTO.getBrandName();
        emailService.sendEmail(toMail, subject, body);
//        emailService.sendEmail("amanzholov000@gmail.com", subject, body);
    }

    @Override
    public void sendComment(CommentDTO commentDTO) {
        String subject=commentDTO.getUserId()+" replied to your comment", body="Hello Sir"+commentDTO.getText();
        emailService.sendEmail(commentDTO.getEmail(), subject, body);
        //test
//        emailService.sendEmail("amanzholov000@gmail.com", subject, body);

    }
}
