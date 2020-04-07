package com.example.wolterskluwer.helpers.enums;

public enum Template {

    FIRST_SAMPLE("firstSample"),
    SECOND_SAMPLE("secondSample"),
    THIRD_SAMPLE("thirdSample");

    private final String templateName;

    Template(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }
}
