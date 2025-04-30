package com.k2sworks.k2ssensors.device.management.api.controller;

import com.k2sworks.k2ssensors.device.management.api.model.SensorInput;
import com.k2sworks.k2ssensors.device.management.common.IdGenerator;
import com.k2sworks.k2ssensors.device.management.domain.model.Sensor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sensor create(@RequestBody SensorInput input) {
        return Sensor.builder()
                .id(IdGenerator.generateTSID())
                .name(input.getName())
                .ip(input.getIp())
                .location(input.getLocation())
                .protocol(input.getProtocol())
                .model(input.getModel())
                .enabled(false)
                .build();
    }

}