package com.odeyalo.support.clients.notification;

import com.odeyalo.support.clients.notification.dto.EmailMessageDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification-sender",
        url = "${app.clients.notifications.urls.domain}" )
public interface NotificationSenderClient {

    @PostMapping("/send")
    ResponseEntity<?> sendMail(@RequestBody EmailMessageDTO dto);

}
