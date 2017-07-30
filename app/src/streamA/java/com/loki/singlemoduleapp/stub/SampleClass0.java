package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass0 {

    @Ignore
    private SampleClass1 sampleClass;

    public SampleClass0() {
        sampleClass = new stub.SampleClass1();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}