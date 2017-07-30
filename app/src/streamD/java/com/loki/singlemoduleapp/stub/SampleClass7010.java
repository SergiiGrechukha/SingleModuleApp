package com.loki.singlemoduleapp.stub;

public class SampleClass7010 {

    private SampleClass7011 sampleClass;

    public SampleClass7010(){
        sampleClass = new SampleClass7011();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}