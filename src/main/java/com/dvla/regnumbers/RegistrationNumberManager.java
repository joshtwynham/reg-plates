package com.dvla.regnumbers;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RegistrationNumberManager {
    List<RegistrationNumber> registrationNumbers;

    public int getTotalQuantityOfRegistrationNumbers() {
        return registrationNumbers.size();
    }

    public Optional<Integer> getVehicleIdFor(String registrationNumber) {
        for(RegistrationNumber regNumber : registrationNumbers) {
            if(regNumber.getValue().equals(registrationNumber)) {
                return Optional.of(regNumber.getVehicleId());
            }
        }
        return Optional.empty();
    }
}
