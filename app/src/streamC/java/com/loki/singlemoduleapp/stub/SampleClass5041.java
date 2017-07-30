package com.loki.singlemoduleapp.stub;

public class SampleClass5041 {

    private SampleClass5042 sampleClass;

    public SampleClass5041(){
        sampleClass = new SampleClass5042();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}