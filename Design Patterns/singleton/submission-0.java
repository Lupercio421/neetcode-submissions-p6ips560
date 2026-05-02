static class Singleton {

    private static String value = null;
    private static Singleton uniqueInstance = null;

    private Singleton() {
        this.value = value;
        this.uniqueInstance = uniqueInstance;
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
