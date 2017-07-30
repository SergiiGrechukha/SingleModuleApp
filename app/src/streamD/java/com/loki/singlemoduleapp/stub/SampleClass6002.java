package com.loki.singlemoduleapp.stub;

public class SampleClass6002 {

    private SampleClass6003 sampleClass;

    public SampleClass6002(){
        sampleClass = new SampleClass6003();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}