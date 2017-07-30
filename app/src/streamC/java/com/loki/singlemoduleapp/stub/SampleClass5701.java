package com.loki.singlemoduleapp.stub;

public class SampleClass5701 {

    private SampleClass5702 sampleClass;

    public SampleClass5701(){
        sampleClass = new SampleClass5702();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}