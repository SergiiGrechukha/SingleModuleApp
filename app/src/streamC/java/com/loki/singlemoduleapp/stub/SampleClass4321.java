package com.loki.singlemoduleapp.stub;

public class SampleClass4321 {

    private SampleClass4322 sampleClass;

    public SampleClass4321(){
        sampleClass = new SampleClass4322();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}