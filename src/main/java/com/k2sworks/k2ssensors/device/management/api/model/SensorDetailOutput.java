package com.k2sworks.k2ssensors.device.management.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorDetailOutput {
    private SensorOutput sensor;
    private SensorMonitoringOuput monitoring;
}