/**
 * Class: Water
 * Represents different qualities of water in the game.
 * Lower-quality water has a higher chance of causing sickness when consumed.
 * 
 * Author: Payson Briggs
 * Course: CSE 201 Spring 2024
 * Written: November 3rd, 2024
 */

import java.util.Random;

public class Water {
    private final String quality; // Quality of the water (e.g., "High", "Medium", "Low")
    private double sicknessProbability; // Chance of sickness when consumed

    /**
     * Constructor for Water class.
     * Sets the water quality and calculates the sickness probability.
     * 
     * @param quality The quality level of the water.
     */
    public Water(String quality) {
        this.quality = quality;
        setSicknessProbability();
    }

    /**
     * Sets the probability of sickness based on the quality of water.
     */
    private void setSicknessProbability() {
        switch (quality.toLowerCase()) {
            case "high":
                sicknessProbability = 0.05; // 5% chance of sickness
                break;
            case "medium":
                sicknessProbability = 0.20; // 20% chance of sickness
                break;
            case "low":
                sicknessProbability = 0.50; // 50% chance of sickness
                break;
            default:
                sicknessProbability = 0.0; // Unknown quality
                break;
        }
    }

    /**
     * @return The quality of the water.
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @return The probability of sickness associated with this water quality.
     */
    public double getSicknessProbability() {
        return sicknessProbability;
    }

    /**
     * Determines if drinking this water will cause sickness.
     * 
     * @return true if drinking causes sickness, false otherwise.
     */
    public boolean causesSickness() {
        Random rand = new Random();
        return rand.nextDouble() < sicknessProbability;
    }
}
