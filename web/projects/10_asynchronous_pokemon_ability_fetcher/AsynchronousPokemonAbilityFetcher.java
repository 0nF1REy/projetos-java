import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.concurrent.CompletableFuture;

public class AsynchronousPokemonAbilityFetcher {

    private String pokemonName;

    public AsynchronousPokemonAbilityFetcher(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public CompletableFuture<String> fetch() {
        String urlString = "https://pokeapi.co/api/v2/pokemon/" + this.pokemonName;

        return CompletableFuture.supplyAsync(() -> {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URI(urlString).toURL().openConnection();
                connection.setRequestMethod("GET");

                if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    return "Erro ao buscar habilidades de " + this.pokemonName;
                }

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Extração simples de habilidades
                String jsonResponse = response.toString();
                String abilitiesSection = jsonResponse.split("\"abilities\"")[1].split("]")[0];
                String[] abilities = abilitiesSection.split("\\},\\{");

                StringBuilder abilitiesOutput = new StringBuilder("Habilidades do Pokémon " + this.pokemonName + ":\n");
                for (String ability : abilities) {
                    String abilityName = ability.split("\"name\":\"")[1].split("\"")[0];
                    abilitiesOutput.append("- ").append(abilityName).append("\n");
                }

                return abilitiesOutput.toString();
            } catch (Exception e) {
                return "Erro ao buscar habilidades de " + this.pokemonName + ": " + e.getMessage();
            }
        });
    }

    public static void main(String[] args) {
        String[] pokemons = {"ditto", "snorlax", "pikachu", "charmander"};

        // Usando CompletableFuture para buscar as habilidades de vários Pokémon simultaneamente
        CompletableFuture<?>[] futures = new CompletableFuture[pokemons.length];
        for (int i = 0; i < pokemons.length; i++) {
            AsynchronousPokemonAbilityFetcher fetcher = new AsynchronousPokemonAbilityFetcher(pokemons[i]);
            futures[i] = fetcher.fetch().thenAccept(result -> {
                System.out.println(result);
                System.out.println("--------------------------------");  // Linha separadora após cada Pokémon
            });
        }

        // Esperando todos os resultados
        System.out.println("");
        System.out.println("================================");
        System.out.println("Inicializando o programa...");
        System.out.println("--------------------------------");
        CompletableFuture.allOf(futures).join();

        // Exemplo para buscar um Pokémon específico
        System.out.println(new AsynchronousPokemonAbilityFetcher("ponyta").fetch().join());
        System.out.println("================================");
        System.out.println("");
    }
}
