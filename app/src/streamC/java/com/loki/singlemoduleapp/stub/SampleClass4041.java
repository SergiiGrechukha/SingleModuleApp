package com.loki.singlemoduleapp.stub;

public class SampleClass4041 {

    private SampleClass4042 sampleClass;

    public SampleClass4041(){
        sampleClass = new SampleClass4042();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}