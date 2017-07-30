package com.loki.singlemoduleapp.stub;

public class SampleClass4401 {

    private SampleClass4402 sampleClass;

    public SampleClass4401(){
        sampleClass = new SampleClass4402();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}