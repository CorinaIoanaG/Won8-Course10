public class Animal {
    private String name;
    private String group;
    private String sound;

    public Animal(String name, String group, String sound) {
        this.name = name;
        this.group = group;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getSound() {
        return sound;
    }

    public String animalFromGroup(String group) {
        if (this.group == group) {
            return this.getName();
        }
        return null;
    }
}

