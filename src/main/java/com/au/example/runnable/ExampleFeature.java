package com.au.example.runnable;

import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeForeignAccess;

import static com.au.example.runnable.ManualFfi.PRINTF_FUNCTION_DESCRIPTOR;

public class ExampleFeature  implements Feature {

    @Override
    public void duringSetup(DuringSetupAccess access) {
        RuntimeForeignAccess.registerForDowncall(PRINTF_FUNCTION_DESCRIPTOR);
    }

}
