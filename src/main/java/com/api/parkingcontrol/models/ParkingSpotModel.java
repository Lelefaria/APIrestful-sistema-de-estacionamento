package com.api.parkingcontrol.models;


import jakarta.persistence.*;

import java.io.Serializable; //O Serializable em Java é uma interface que permite que objetos sejam convertidos em uma forma que pode ser facilmente armazenada e transmitida que converte Onjetos em Bytes.
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
//Ajuda a mapear objetos para registrar no banco de dados e uma entidade é uma classe Java que representa uma tabela em um banco de dados.
@Table(name = "TB_PARKING_SPOT") //Cria uma tabela com um nome que é implemetada no banco de dados


public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L; //serialVersionUID é um controle das conversoes feita pela JVM.

    @Id //Tonda Entiy precisa de um identificador.
    @GeneratedValue(strategy = GenerationType.AUTO) //GenerationType.AUTO faz o Id ser gerado de fora automatica.
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    //nullable false. Significa que esse campo nao pode ser nulo e que precisa de um valor para ser salvo.
    private String parkingSpotNumber; //Numero da vaga.
    @Column(nullable = false, unique = true, length = 7)
    //unique true. Significa que e um campo unico e que so pode ser preechido com apenas uma unica vaga.
    private String licensePlateCar; //Placa do carro.
    @Column(nullable = false, length = 70) //length. Delimita o numero de caracteres.
    private String brandCar; //Marca do Carro.
    @Column(nullable = false, length = 70)
    private String modelCar; //Modelo do Carro.
    @Column(nullable = false, length = 70)
    private String colorCar; //Cor do Carro.
    @Column(nullable = false)
    private LocalDateTime registrationDate; //Data de Registro.
    @Column(nullable = false, length = 130)
    private String responsibleName; //Nome do Responsavel.
    @Column(nullable = false, length = 30)
    private String apartament; //Apartamento
    @Column(nullable = false, length = 30)
    private String block; //Bloco ou Torres.

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
