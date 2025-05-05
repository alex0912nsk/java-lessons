package korona.bk.homework.task5.models;

import korona.bk.homework.task5.CustomList;

import java.lang.invoke.WrongMethodTypeException;

public class Number {
    private final ArtistHumanImpl artistHuman;
    private final CustomList numberParts;

    public Number(ArtistHumanImpl artistHuman, CustomList numberParts) {
        if (numberParts == null || artistHuman == null || numberParts.isEmpty()) {
            throw new NullPointerException("артист и части номера не могут быть null");
        }
        if (numberParts.getInnerClass() != NumberPart.class) {
            throw new WrongMethodTypeException("Несоответствие классов");
        }
        if (numberParts.length() < 10) {
            throw new AssertionError("Слишком короткий номер");
        }
        this.artistHuman = artistHuman;
        this.numberParts = numberParts;
    }

    public Number(ArtistHumanImpl artistHuman, int partCount) {
        if (partCount < 10) {
            throw new AssertionError("Слишком короткий номер");
        }
        this.artistHuman = artistHuman;
        CustomList numbers = new CustomList();
        for (int i = 0; i < partCount; i++) {
            numbers.append(new NumberPart(artistHuman.getRandomArtist()));
        }
        this.numberParts = numbers;
    }

    @Override
    public String toString() {
        String result = "";
        for (Object part : numberParts.getArray()) {
            result = result + part.toString() + " -> ";
        }
        result = result.substring(0, result.lastIndexOf(" -> ") + 1);
        return result;
    }
}
