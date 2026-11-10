package Exercism.MiniPeopleGarden;

import java.util.*;

public class Garden {

    private final Scanner sc = new Scanner(System.in);
    private final Map<String, String> seeds = Map.ofEntries(
            Map.entry("G", "Grass"),
            Map.entry("C", "Clover"),
            Map.entry("R", "Radish"),
            Map.entry("V", "Violet")
    );
    private String[] names;
    private Map<String, List<String>> distribution;

    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void inputNames() {
        while (true) {
            System.out.println("Enter names separated by spaces:");
            String input = sc.nextLine();
            names = Arrays.stream(input.split("\\s+"))
                    .filter(name -> !name.isBlank())
                    .map(Garden::capitalize)
                    .toArray(String[]::new);
            Arrays.sort(names);

            Set<String> uniqueNames = new HashSet<>(Arrays.asList(names));

            if (uniqueNames.size() == names.length) {
                break;
            }

            System.out.println("Names must be unique. Please try again.");
        }
    }

    public void distributeSeeds() {
        List<String> plantList = new ArrayList<>(seeds.values());
        Random random = new Random();

        Map<String, List<String>> dist = new LinkedHashMap<>();

        for (String name : names) {
            List<String> randomPlants = new ArrayList<>();

            for (int i = 0; i < 4; i++) {
                int randomIndex = random.nextInt(plantList.size());
                randomPlants.add(plantList.get(randomIndex));
            }
            dist.put(name, randomPlants);
        }
        distribution = dist;
    }

    public void showNames() {
        System.out.println(Arrays.toString(names));
    }

    public void getSeedsByName() {

        while (true) {
            System.out.println("Enter name to show seeds:");
            String name = sc.nextLine();

            if (name.isBlank()) {
                break;
            }

            String formattedName = capitalize(name);

            if (distribution.containsKey(formattedName)) {
                List<String> plants = distribution.get(formattedName);
                System.out.println(formattedName + " has such plants: " + plants);
            } else {
                System.out.println("Human with name \"" + formattedName + "\" not found");
            }
        }
    }

}