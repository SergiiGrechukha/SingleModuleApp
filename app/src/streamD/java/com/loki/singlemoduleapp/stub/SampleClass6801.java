package com.loki.singlemoduleapp.stub;

public class SampleClass6801 {

    private SampleClass6802 sampleClass;

    public SampleClass6801(){
        sampleClass = new SampleClass6802();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}