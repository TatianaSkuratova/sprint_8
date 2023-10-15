public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        String stringWithoutBlanks = name.trim();
        return name.equals(stringWithoutBlanks) & name.contains(" ") & (name.length() >=3) & (name.length() < 19);
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}