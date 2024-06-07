package com.example.robot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {
    public static void main(String[] args) {
        int[] pasos = {10, 5, -2};
        int[] coordenadas = obtenerCoordenadasFinales(pasos);
        System.out.println("Coordenadas finales: (x: " + coordenadas[0] + ", y: " + coordenadas[1] + ")");
    }

    public static int[] obtenerCoordenadasFinales(int[] pasos) {
        int x = 0;
        int y = 0;
        boolean enEjeY = true;

        for (int paso : pasos) {
            if (enEjeY) {
                y += paso;
            } else {
                x += paso;
            }
            enEjeY = !enEjeY;
        }

        return new int[]{x, y};
    }

}