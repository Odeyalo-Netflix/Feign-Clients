package com.odeyalo.support.clients.filestorage;

import com.odeyalo.support.clients.filestorage.dto.SuccessUploadImageResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "image-controller-client",
        url = "${app.clients.filestorage.image.urls.domain}")
public interface ImageControllerClient {

    @GetMapping(value = "/{id}", produces = {MediaType.IMAGE_PNG_VALUE,
            MediaType.IMAGE_GIF_VALUE,
            MediaType.IMAGE_JPEG_VALUE})
    Resource getImageById(@PathVariable("id") String imageId);

    @PostMapping("/save")
    ResponseEntity<SuccessUploadImageResponseDTO> saveImage(@RequestPart MultipartFile file);

    @GetMapping(value = "/resize", produces = {MediaType.IMAGE_PNG_VALUE,
            MediaType.IMAGE_GIF_VALUE,
            MediaType.IMAGE_JPEG_VALUE})
    Resource resizeImage(@RequestParam String imageId, @RequestParam Integer height, @RequestParam Integer width);
}
