package com.example.wolterskluwer.helpers;

import java.util.regex.Pattern;

public enum Patterns {

    EMAIL_VALUE(Pattern.compile("^(.*)@wolterskluwer.com$")),
    PHONE_NUMBER_VALUE(Pattern.compile("^\\d{1}-\\d{3}-\\d{3}-\\d{4}$")),
    USER_ID(Pattern.compile("(^\\d{7})$"));


    private Pattern valuePattern;

    Patterns(Pattern valuePattern) {
        this.valuePattern = valuePattern;
    }

    public Pattern getValuePattern() {
        return valuePattern;
    }
}
