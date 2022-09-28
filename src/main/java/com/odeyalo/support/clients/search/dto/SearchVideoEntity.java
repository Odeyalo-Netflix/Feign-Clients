package com.odeyalo.support.clients.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class SearchVideoEntity {
    private String id;
    private String name;
    private VideoType videoType;
    private String description;
    private String videoFileId;
    private String posterFileId;
    private LocalDate year;

    public enum VideoType {
        FILM, SERIAL, CARTOON, TRAILER, ANIME
    }
}
