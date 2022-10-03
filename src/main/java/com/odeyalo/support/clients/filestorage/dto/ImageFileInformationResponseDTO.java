package com.odeyalo.support.clients.filestorage.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class ImageFileInformationResponseDTO extends FileInformationResponseDTO {
    private List<ResizedImageResponseDTO> resizedImages;

    public ImageFileInformationResponseDTO(FileInformationResponseDTO dto, List<ResizedImageResponseDTO> resizedImages) {
        super(dto.getFileId(), dto.getFileCreated(), dto.getSize(), dto.getType(), dto.getUrl(), dto.getLinks());
        this.resizedImages = resizedImages;
    }
}
