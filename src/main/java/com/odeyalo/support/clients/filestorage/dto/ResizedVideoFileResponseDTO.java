package com.odeyalo.support.clients.filestorage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResizedVideoFileResponseDTO {
    private VideoResolution resolution;
    private List<LinkResponse> links;
}
