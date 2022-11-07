package com.uc.docker.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
@Getter@Setter
public class SequenceId {

    @Id
    private String id;

    private long seq;
}
