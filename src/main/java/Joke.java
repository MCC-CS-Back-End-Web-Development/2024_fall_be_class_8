import java.util.Map;

public class Joke {
    Boolean error;
    String category;
    String type;
    String joke;
    String setup;
    String delivery;
    Integer id;
    Boolean safe;
    String lang;
    Map<String, Boolean> flags;

    public Boolean getError() {
        return error;
    }

    public Joke setError(Boolean error) {
        this.error = error;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Joke setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getType() {
        return type;
    }

    public Joke setType(String type) {
        this.type = type;
        return this;
    }

    public String getJoke() {
        return joke;
    }

    public Joke setJoke(String joke) {
        this.joke = joke;
        return this;
    }

    public String getSetup() {
        return setup;
    }

    public Joke setSetup(String setup) {
        this.setup = setup;
        return this;
    }

    public String getDelivery() {
        return delivery;
    }

    public Joke setDelivery(String delivery) {
        this.delivery = delivery;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Joke setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getSafe() {
        return safe;
    }

    public Joke setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public Joke setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Map<String, Boolean> getFlags() {
        return flags;
    }

    public Joke setFlags(Map<String, Boolean> flags) {
        this.flags = flags;
        return this;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "error=" + error +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", joke='" + joke + '\'' +
                ", setup='" + setup + '\'' +
                ", delivery='" + delivery + '\'' +
                ", id=" + id +
                ", safe=" + safe +
                ", lang='" + lang + '\'' +
                ", flags=" + flags +
                '}';
    }
}
