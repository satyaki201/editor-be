package com.personal.editor.controller;

import com.personal.editor.api.EditorApi;
import com.personal.editor.model.Template;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/editor")
public class EditorController implements EditorApi {
    @Override
    public ResponseEntity<Template> getTemplate(String problemNo) {
        return null;
    }
}
