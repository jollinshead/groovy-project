package com.example.groovyproject

class MacroNutrients {
    private BigDecimal carbohydrate, protein, fat

    MacroNutrients(BigDecimal carbohydrate, protein, fat) {
        this.carbohydrate = carbohydrate
        this.fat = fat
        this.protein = protein
    }

    BigDecimal Calories() {
        return (fat * 9) + ((protein + carbohydrate) * 4)
    }

    BigDecimal getCarbohydrate() {
        return carbohydrate
    }

    BigDecimal getProtein() {
        return protein
    }

    BigDecimal getFat() {
        return fat
    }
}
