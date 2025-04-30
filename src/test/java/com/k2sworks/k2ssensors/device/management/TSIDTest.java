package com.k2sworks.k2ssensors.device.management;

import com.k2sworks.k2ssensors.device.management.common.IdGenerator;
import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TSIDTest {

    @Test
    void shouldGenerateTSID() {

        TSID tsid = IdGenerator.generateTSID();

        java.time.Instant now = java.time.Instant.now();
        long tsidMinute = tsid.getInstant().getEpochSecond() / 60;
        long nowMinute = now.getEpochSecond() / 60;

        Assertions.assertThat(Math.abs(tsidMinute - nowMinute)).isLessThanOrEqualTo(1);

    }
}
