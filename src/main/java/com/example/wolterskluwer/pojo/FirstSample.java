package com.example.wolterskluwer.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class FirstSample {

    @JsonProperty("data")
    private Data data;

    @JsonProperty("source")
    private String source;

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return
                "FirstSample{" +
                        "data = '" + data + '\'' +
                        ",source = '" + source + '\'' +
                        "}";
    }
}