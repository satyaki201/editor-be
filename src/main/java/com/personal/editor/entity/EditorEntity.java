package com.personal.editor.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("zipstore")
@Data
public class EditorEntity {
    @Id
    public String id;
    private byte[] file;
    private String userId;
    private boolean forEvaluation;
    private Integer language;
    private Double score;
}

