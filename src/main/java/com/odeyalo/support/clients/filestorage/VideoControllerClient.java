package com.odeyalo.support.clients.filestorage;

import com.odeyalo.support.clients.filestorage.dto.SuccessUploadVideoResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "video-controller-client",
        url = "${app.clients.filestorage.video.urls.domain}")
public interface VideoControllerClient {

    @PostMapping("/upload")
    ResponseEntity<SuccessUploadVideoResponseDTO> saveVideo(@RequestParam String videoId, @RequestPart(name = "video") MultipartFile file);
}
