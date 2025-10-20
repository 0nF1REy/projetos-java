package br.com.alanryan.screen_match.calculations;

import br.com.alanryan.screen_match.models.Title;
import br.com.alanryan.screen_match.utils.Utils;

public class TimeCalculator {
    private int totalTime = 0;

    public void includes(Title title) {
        Utils.print("Adicionando duração em minutos de: " + title);
        this.totalTime += title.getDurationInMinutes();
    }

    public int getTotalTime() {
        return this.totalTime;
    }
}