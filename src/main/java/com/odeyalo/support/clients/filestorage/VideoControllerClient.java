package com.odeyalo.support.clients.filestorage;

import com.odeyalo.support.clients.configuration.FileUploadFeignClientConfiguration;
import com.odeyalo.support.clients.filestorage.dto.SuccessUploadVideoResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "video-controller-client",
        url = "${app.clients.filestorage.video.urls.domain}",
        configuration = FileUploadFeignClientConfiguration.class)
public interface VideoControllerClient {

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<SuccessUploadVideoResponseDTO> saveVideo(@RequestPart(name = "video") MultipartFile file);
}
