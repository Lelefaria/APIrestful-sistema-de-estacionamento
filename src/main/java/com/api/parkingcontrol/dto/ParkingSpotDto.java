package com.api.parkingcontrol.dto;

import jakarta.validation.constraints.NotBlank; //NotBlank faz Validacoes.
import jakarta.validation.constraints.Size;

public class ParkingSpotDto {

    @NotBlank //Verifica se o campo nao e nulo, se a string esta vazia
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7) //Limita a quantidade de Caracters
    private String licensePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String modelCar;
    @NotBlank
    private String colorCar;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartament;
    @NotBlank
    private String block;


    public @NotBlank String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(@NotBlank String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public @NotBlank @Size(max = 7) String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(@NotBlank @Size(max = 7) String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public @NotBlank String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(@NotBlank String brandCar) {
        this.brandCar = brandCar;
    }

    public @NotBlank String getModelCar() {
        return modelCar;
    }

    public void setModelCar(@NotBlank String modelCar) {
        this.modelCar = modelCar;
    }

    public @NotBlank String getColorCar() {
        return colorCar;
    }

    public void setColorCar(@NotBlank String colorCar) {
        this.colorCar = colorCar;
    }

    public @NotBlank String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(@NotBlank String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public @NotBlank String getApartament() {
        return apartament;
    }

    public void setApartament(@NotBlank String apartament) {
        this.apartament = apartament;
    }

    public @NotBlank String getBlock() {
        return block;
    }

    public void setBlock(@NotBlank String block) {
        this.block = block;
    }
}
