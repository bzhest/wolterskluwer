package com.example.wolterskluwer.helpers;

import com.example.wolterskluwer.helpers.enums.Template;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static java.lang.String.format;

public class MappingUtil {


    private static final String PATH_TO_JSON = "com/example/jsonSample/%s.json";

    public static <T> T getObjectFromJson(Class<T> clazz, Template template) {
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = format(PATH_TO_JSON, template.getTemplateName());

        try {
            return objectMapper.readValue(getTemplateContent(template), clazz);
        } catch (IOException e) {
            throw new RuntimeException("File: " + filePath + " can't be mapped on object " + clazz);
        }

    }

    public static String getTemplateContent(Template template) {
        try {
            return readJsonTemplate(template);
        } catch (RuntimeException exc) {
            throw new IllegalArgumentException(String.format("Cannot read template: %s", template.getTemplateName()), exc);
        }
    }

    private static String readJsonTemplate(Template template) {
        String filePath = String.format(PATH_TO_JSON, template.getTemplateName());
        InputStream inputStream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream(filePath);
        if (inputStream != null) {
            try {
                return IOUtils.toString(inputStream);
            } catch (Exception e) {
                throw new RuntimeException("Failed to read InputStream");
            }
        } else {
            throw new RuntimeException("InputStream is null for file: " + filePath);
        }

    }

}
