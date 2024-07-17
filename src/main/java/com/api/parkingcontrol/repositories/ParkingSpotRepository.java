package com.api.parkingcontrol.repositories;
//Controller -> Service -> Repository

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//extends JpaRepository do SpringDATA.
//Dentro do <> o JpaRepository espera <model, identificador>
//Porque extender o JpaRepository ?
//O JpaRepository ja possui vareos metodos prontos para transacao com o banco de dados.
//O JpaRepository ja traz o @Repository com ele, enta fica a criterio do desenvolvedor a usar essa Annotation.

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartamentAndBlock(String apartament, String block);
}

