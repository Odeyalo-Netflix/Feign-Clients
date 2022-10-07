package com.odeyalo.support.clients.filestorage.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class VideoFileInformationResponseDTO extends FileInformationResponseDTO {
    private List<ResizedVideoFileResponseDTO> videos;

    public VideoFileInformationResponseDTO(FileInformationResponseDTO dto, List<ResizedVideoFileResponseDTO> videos) {
        super(dto.getFileId(), dto.getFileCreated(), dto.getSize(), dto.getType(), dto.getUrl(), dto.getLinks());
        this.videos = videos;
    }
}
