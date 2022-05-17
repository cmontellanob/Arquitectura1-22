/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.flyweight;

/**
 *
 * @author Carlos
 */
public class Flyweight {

  private static final String colors[] = {"Red", "Orange", "Blue", "Yellow", "Pink"};

    public static void main(String[] args) {

        for (int i = 0; i < 200; ++i) {
            AngryBird angrybird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());

            angrybird.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
