package com.uc.docker.util.mongo.generator;

import com.uc.docker.model.entity.SequenceId;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Component
@RequiredArgsConstructor
public class SequenceGenerator {
    private final MongoOperations mongoOperations;

    public long generateSequence(String seqName) {
        SequenceId counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                SequenceId.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;
    }
}
