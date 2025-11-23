package com.alanryan.filejson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(vehicle);
        System.out.println("Veículo em JSON:");
        System.out.println(json);
    }
}
