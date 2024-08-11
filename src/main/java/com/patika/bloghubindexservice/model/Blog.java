package com.patika.bloghubindexservice.model;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Blog {

    private Long id;

    private String title;

    private String text;

    private LocalDateTime createdDate;

    private Long likeCount;

}
