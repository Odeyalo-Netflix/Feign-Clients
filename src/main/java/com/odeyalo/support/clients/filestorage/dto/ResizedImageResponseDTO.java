package com.odeyalo.support.clients.filestorage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class ResizedImageResponseDTO {
    private String id;
    private Integer width;
    private Integer height;
    private List<LinkResponse> links;
}
