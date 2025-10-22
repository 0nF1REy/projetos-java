package br.com.alanryan.screen_match.calculations;

import br.com.alanryan.screen_match.utils.Utils;

public class RecommendationFilter {

    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            Utils.print("Está entre os preferidos do momento");
        } else if (classifiable.getClassification() >= 2) {
            Utils.print("Muito bem avaliado no momento!");
        } else {
            Utils.print("Coloque na sua lista para assistir depois");
        }
    }
}