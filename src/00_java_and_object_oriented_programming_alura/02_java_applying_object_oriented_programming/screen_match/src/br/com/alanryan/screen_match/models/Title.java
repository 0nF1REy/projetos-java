package br.com.alanryan.screen_match.models;

import br.com.alanryan.screen_match.utils.Utils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Title {
    // IDENTIFICAÇÃO
    private UUID id;
    private int publicId;
    private static final AtomicInteger publicIdCounter = new AtomicInteger(0);

    // ATRIBUTOS encapsulados
    private String title;
    private boolean includedInPlan;
    private double rating;
    private double sumRatings;
    private int releaseYear,
            totalRatings,
            durationInMinutes;

    // CONSTRUTOR
    public Title() {
        this.id = UUID.randomUUID();
        this.publicId = publicIdCounter.incrementAndGet();
    }

    // Método para exibir informações (usuário final)
    public void showTechnicalSheet() {
        Utils.print("ID público: " + publicId);
        Utils.print("Título do filme: " + title);
        Utils.print("Ano de lançamento: " + releaseYear);
        Utils.print("Incluído no plano: " + includedInPlan);
        Utils.print("Avaliação média: " + rating);
        Utils.print("Total de avaliações: " + totalRatings);
        Utils.print("Duração (min): " + durationInMinutes);
        Utils.print();
    }

    // Para debug / backend
    void logTechnicalSheet() {
        Utils.print("UUID interno: " + id);
        Utils.print("ID público: " + publicId);
        Utils.print("Título do filme: " + title);
        Utils.print("Ano de lançamento: " + releaseYear);
        Utils.print("Incluído no plano: " + includedInPlan);
        Utils.print("Avaliação média: " + rating);
        Utils.print("Total de avaliações: " + totalRatings);
        Utils.print("Duração (min): " + durationInMinutes);
        Utils.print();
    }

    // Método para avaliar
    public void rate(double score) {
        sumRatings += score;
        totalRatings++;
        rating = sumRatings / totalRatings;
    }

    // ========================================================
    // Getters - permitem acessar atributos de forma controlada
    // ========================================================
    public UUID getId() {
        return id;
    }

    public int getPublicId() {
        return publicId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // ========================================================
    // Setters - permitem alterar atributos de forma controlada
    // ========================================================
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}