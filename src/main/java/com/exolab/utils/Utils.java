package com.exolab.utils;

import com.exolab.dto.AreaDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.Document;

import java.io.File;
import java.util.List;

public class Utils {

    public Document createDocument(String... args) {
        Document document = new Document();
        for (String s : args) {
            document.append(s, "$" + s);
        }
        return document;
    }



}
