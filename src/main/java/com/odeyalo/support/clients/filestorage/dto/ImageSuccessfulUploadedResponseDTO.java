package com.odeyalo.support.clients.filestorage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageSuccessfulUploadedResponseDTO {
    private String imageId;
    private List<LinkResponse> links;
}
