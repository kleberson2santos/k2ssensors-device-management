package com.k2sworks.k2ssensors.device.management;

import io.hypersistence.tsid.TSID;
import org.junit.jupiter.api.Test;

class TSIDTest {

    @Test
    void shouldGenerateTSID() {

        TSID tsid = IdGenerator.generateTSID();

        System.out.println(tsid);
        System.out.println(tsid.toLong());
        System.out.println(tsid.getInstant());


    }
}
