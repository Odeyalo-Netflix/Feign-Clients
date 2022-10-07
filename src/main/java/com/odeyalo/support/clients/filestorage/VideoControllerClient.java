package com.odeyalo.support.clients.filestorage;

import com.odeyalo.support.clients.configuration.FileUploadFeignClientConfiguration;
import com.odeyalo.support.clients.filestorage.dto.FileInformationResponseDTO;
import com.odeyalo.support.clients.filestorage.dto.SuccessUploadVideoResponseDTO;
import com.odeyalo.support.clients.filestorage.dto.VideoFileInformationResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.support.ResourceRegion;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "video-controller-client",
        url = "${app.clients.filestorage.video.urls.domain}",
        configuration = FileUploadFeignClientConfiguration.class)
public interface VideoControllerClient {

    @GetMapping(value = "/watch", produces = "application/octet-stream")
    ResponseEntity<ResourceRegion> streamVideo(@RequestParam String videoId, @RequestHeader(name = "range", required = false) String range);

    @GetMapping(value = "/info/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<VideoFileInformationResponseDTO> infoAboutVideoFile(@PathVariable String id);

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<SuccessUploadVideoResponseDTO> saveVideo(@RequestPart(name = "video") MultipartFile file);

    @DeleteMapping("/delete/{videoId}")
    ResponseEntity<?> deleteVideo(@PathVariable String videoId);
}
