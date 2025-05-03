package com.k2sworks.k2ssensors.device.management.domain.repository;

import com.k2sworks.k2ssensors.device.management.domain.model.Sensor;
import com.k2sworks.k2ssensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
