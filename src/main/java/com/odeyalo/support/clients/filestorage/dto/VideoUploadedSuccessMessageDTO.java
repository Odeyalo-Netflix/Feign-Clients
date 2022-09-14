package com.odeyalo.support.clients.filestorage.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class VideoUploadedSuccessMessageDTO {
    private final  String eventId;
    private final String videoId;
    private final String fileId;
}
