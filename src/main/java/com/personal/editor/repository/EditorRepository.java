package com.personal.editor.repository;

import com.personal.editor.entity.EditorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EditorRepository extends MongoRepository<EditorEntity,String> {
}
