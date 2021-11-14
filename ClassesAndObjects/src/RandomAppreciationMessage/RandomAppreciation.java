package RandomAppreciationMessage;

import java.util.Random;

public class RandomAppreciation {
    private static final String[] fraze = {"Продуктът е отличен.", "Това е страхотен продукт.",
            "Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория."};
    private static final String[] events = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
            "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
    private static final String[] authorFirstName = {"Диана", "Петя", "Стела", "Елена", "Катя"};
    private static final String[] authorLastName = {"Иванова", "Петрова", "Кирова"};
    private static final String[] city = {"София", "Пловдив", "Варна", "Русе", "Бургас"};
    private final StringBuilder builder;

    public RandomAppreciation() {
        this.builder = new StringBuilder();
    }
    static Random random = new Random();

    public void getAppreciation() {
        builder.append(fraze[randomInt(fraze.length - 1)]);
        builder.append(" ");
        builder.append(events[randomInt(events.length - 1)]);
        builder.append(" -- ");
        builder.append(authorFirstName[randomInt(authorFirstName.length - 1)]);
        builder.append(" ");
        builder.append(authorLastName[randomInt(authorLastName.length - 1)]);
        builder.append(", ");
        builder.append(city[randomInt(city.length - 1)]);
        builder.append(".");
        printAppreciation();

    }

    private int randomInt(int max) {
        return random.nextInt((max) + 1);
    }

    private void printAppreciation() {
        System.out.println(builder);
    }
}
