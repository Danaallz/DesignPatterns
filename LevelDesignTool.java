// Prototype interface representing game levels
interface GameLevel extends Cloneable {
    GameLevel clone();

    void showInfo();

    void setTerrain(String terrain);

    void setObstacles(String obstacles);

    void setEnemies(String enemies);
}

// Concrete Prototype 1: Forest Level
class ForestLevel implements GameLevel {
    private String terrain = "Dense Forest";
    private String obstacles = "Trees, Rocks";
    private String enemies = "Wolves, Goblins";

    @Override
    public GameLevel clone() {
        ForestLevel copy = new ForestLevel();
        copy.terrain = this.terrain;
        copy.obstacles = this.obstacles;
        copy.enemies = this.enemies;
        return copy;
    }

    @Override
    public void showInfo() {
        System.out.println(" Forest Level");
        System.out.println("Terrain: " + terrain);
        System.out.println("Obstacles: " + obstacles);
        System.out.println("Enemies: " + enemies);
        System.out.println();
    }

    @Override
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @Override
    public void setObstacles(String obstacles) {
        this.obstacles = obstacles;
    }

    @Override
    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }
}

// Concrete Prototype 2: Desert Level
class DesertLevel implements GameLevel {
    private String terrain = "Sandy Desert";
    private String obstacles = "Cactus, Sand Dunes";
    private String enemies = "Scorpions, Bandits";

    @Override
    public GameLevel clone() {
        DesertLevel copy = new DesertLevel();
        copy.terrain = this.terrain;
        copy.obstacles = this.obstacles;
        copy.enemies = this.enemies;
        return copy;
    }

    @Override
    public void showInfo() {
        System.out.println("Desert Level");
        System.out.println("Terrain: " + terrain);
        System.out.println("Obstacles: " + obstacles);
        System.out.println("Enemies: " + enemies);
        System.out.println();
    }

    @Override
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @Override
    public void setObstacles(String obstacles) {
        this.obstacles = obstacles;
    }

    @Override
    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }
}

// Client class simulating the Level Design Tool
public class LevelDesignTool {
    public static void main(String[] args) {
        // Step 1: Create prototype levels
        GameLevel forestPrototype = new ForestLevel();
        GameLevel desertPrototype = new DesertLevel();

        // Step 2: Designers clone and modify them
        GameLevel forestLevel1 = forestPrototype.clone();
        forestLevel1.setEnemies("Elves, Wolves");
        forestLevel1.setObstacles("Fallen Trees, Rivers");

        GameLevel desertLevel1 = desertPrototype.clone();
        desertLevel1.setTerrain("Rocky Desert");
        desertLevel1.setEnemies("Sand Worms, Thieves");

        // Step 3: Display results
        System.out.println("=== Original Level Templates ===");
        forestPrototype.showInfo();
        desertPrototype.showInfo();

        System.out.println("=== Customized Levels by Designers ===");
        forestLevel1.showInfo();
        desertLevel1.showInfo();
    }
}
