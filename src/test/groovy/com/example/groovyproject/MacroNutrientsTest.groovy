package com.example.groovyproject

class MacroNutrientsTest extends GroovyTestCase {
    
    void testCalories() {
        BigDecimal carbohydrate = 35.3, protein = 2.2, fat = 8.5
        MacroNutrients food = new MacroNutrients(carbohydrate, protein, fat)

        BigDecimal expectedCalories = 226.5
        assertEquals(expectedCalories, food.Calories())
    }

    void testGetCarbohydrate() {
        BigDecimal carbohydrate = 35.3, protein = 2.2, fat = 8.5
        MacroNutrients food = new MacroNutrients(carbohydrate, protein, fat)

        assertEquals(carbohydrate, food.getCarbohydrate())
    }

    void testGetProtein() {
        BigDecimal carbohydrate = 35.3, protein = 2.2, fat = 8.5
        MacroNutrients food = new MacroNutrients(carbohydrate, protein, fat)

        assertEquals(protein, food.getProtein())
    }

    void testGetFat() {
        BigDecimal carbohydrate = 35.3, protein = 2.2, fat = 8.5
        MacroNutrients food = new MacroNutrients(carbohydrate, protein, fat)

        assertEquals(fat, food.getFat())
    }
}
