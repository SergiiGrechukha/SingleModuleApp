package com.loki.singlemoduleapp.stub;

public class SampleClass4710 {

    private SampleClass4711 sampleClass;

    public SampleClass4710(){
        sampleClass = new SampleClass4711();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}