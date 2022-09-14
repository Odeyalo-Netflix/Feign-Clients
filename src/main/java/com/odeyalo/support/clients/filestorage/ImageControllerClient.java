package com.odeyalo.support.clients.filestorage;

import com.odeyalo.support.clients.configuration.FileUploadFeignClientConfiguration;
import com.odeyalo.support.clients.filestorage.dto.FileInformationResponseDTO;
import com.odeyalo.support.clients.filestorage.dto.SuccessUploadImageResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "image-controller-client",
        url = "${app.clients.filestorage.image.urls.domain}", configuration = {
        FileUploadFeignClientConfiguration.class
})
public interface ImageControllerClient {

    @GetMapping(value = "/info/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<FileInformationResponseDTO> getImageInfoById(@PathVariable("id") String imageId);

    @GetMapping(value = "/{id}",
            produces = {MediaType.IMAGE_PNG_VALUE,
                    MediaType.IMAGE_GIF_VALUE,
                    MediaType.IMAGE_JPEG_VALUE})
    Resource getImageById(@PathVariable("id") String imageId);

    @PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<SuccessUploadImageResponseDTO> saveImage(@RequestPart(name = "file") MultipartFile file);

    @GetMapping(value = "/resize", produces = {MediaType.IMAGE_PNG_VALUE,
            MediaType.IMAGE_GIF_VALUE,
            MediaType.IMAGE_JPEG_VALUE})
    Resource resizeImage(@RequestParam String imageId, @RequestParam Integer height, @RequestParam Integer width);

    @DeleteMapping("/delete/{imageId}")
    ResponseEntity<?> deleteImage(@PathVariable String imageId);
}
