package com.odeyalo.support.clients.filestorage;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "image-controller-client",
        url = "${app.clients.filestorage.image.urls.domain}")
public interface ImageControllerClient {

    @GetMapping(value = "/", produces = {MediaType.IMAGE_PNG_VALUE,
            MediaType.IMAGE_GIF_VALUE,
            MediaType.IMAGE_JPEG_VALUE})
    Resource getImageById(@RequestParam("id") String imageId);

    @GetMapping(value = "/poster", produces = {MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE})
    Resource getPoster(@RequestParam String posterId);

    @PostMapping("/save")
    ResponseEntity<?> saveImage(@RequestPart MultipartFile file, @RequestParam(required = false) String userId);

    @PostMapping("/save/poster")
    ResponseEntity<?> savePoster(@RequestPart MultipartFile file, String posterId);

    @GetMapping(value = "/resize", produces = {MediaType.IMAGE_PNG_VALUE,
            MediaType.IMAGE_GIF_VALUE,
            MediaType.IMAGE_JPEG_VALUE})
    Resource resizeImage(@RequestParam String imageId, @RequestParam Integer height, @RequestParam Integer width);

    @GetMapping("/users")
    ResponseEntity<?> getAllImagesByUserId(@RequestParam String userId);
}
