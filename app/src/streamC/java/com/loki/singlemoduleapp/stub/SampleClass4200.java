package com.loki.singlemoduleapp.stub;

public class SampleClass4200 {

    private SampleClass4201 sampleClass;

    public SampleClass4200(){
        sampleClass = new SampleClass4201();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}