package com.odeyalo.support.clients.filestorage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Dto response that returns information about image
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileInformationResponseDTO {
    private String fileId;
    private Long fileCreated;
    private Long size;
    private String type;
    private String url;
    private List<LinkResponse> links;
}
