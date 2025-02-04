package com.api.parkingmeter.application.usecase.fixture;

import com.api.parkingmeter.application.domain.Vehicle;
import java.util.List;

public class CreateVehicleTestFixture {

  private static final String LICENSE_PLATE = "AAA0000";
  private static final String OWNER_NAME = "John Doe";

  public static Vehicle validVehicleGatewayResponse() {
    return Vehicle.builder()
        .id(1)
        .licensePlate(LICENSE_PLATE)
        .ownerName(OWNER_NAME)
        .parkingSessions(List.of())
        .build();
  }
}
