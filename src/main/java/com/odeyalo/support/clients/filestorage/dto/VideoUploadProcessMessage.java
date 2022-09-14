package com.odeyalo.support.clients.filestorage.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoUploadProcessMessage {
    private UploadStatus status;
    private SuccessUploadVideoResponseDTO dto;
    private String message;

    public VideoUploadProcessMessage(UploadStatus status) {
        this.status = status;
    }

    public VideoUploadProcessMessage(UploadStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public VideoUploadProcessMessage(UploadStatus status, SuccessUploadVideoResponseDTO dto) {
        this.status = status;
        this.dto = dto;
    }

    public VideoUploadProcessMessage(UploadStatus status, SuccessUploadVideoResponseDTO dto, String message) {
        this.status = status;
        this.dto = dto;
        this.message = message;
    }
}
