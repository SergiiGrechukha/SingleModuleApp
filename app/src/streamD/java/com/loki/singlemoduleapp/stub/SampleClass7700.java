package com.loki.singlemoduleapp.stub;

public class SampleClass7700 {

    private SampleClass7701 sampleClass;

    public SampleClass7700(){
        sampleClass = new SampleClass7701();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}