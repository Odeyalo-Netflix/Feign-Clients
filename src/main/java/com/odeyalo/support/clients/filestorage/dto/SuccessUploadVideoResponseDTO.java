package com.odeyalo.support.clients.filestorage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SuccessUploadVideoResponseDTO {
    private String videoId;
    private List<LinkResponse> links;
}
