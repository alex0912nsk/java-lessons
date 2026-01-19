package korona.bk.modul2.homework.task4;

import korona.bk.modul2.homework.task4.enums.Action;
import korona.bk.modul2.homework.task4.interfaces.Artist;
import korona.bk.modul2.homework.task4.interfaces.PerformanceValidator;
import korona.bk.modul2.homework.task4.validators.DefaultPerformanceValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Performance {
    private final ArtistHumanImpl artistHuman;
    private PerformanceValidator validator = new DefaultPerformanceValidator();
    private List<PerformancePart> perfomanceParts = new ArrayList<>();

    public Performance(ArtistHumanImpl artistHuman) {
        this.artistHuman = artistHuman;
    }

    public Performance(ArtistHumanImpl artistHuman, PerformanceValidator validator) {
        this.artistHuman = artistHuman;
        this.validator = validator;
    }

    public ArtistHumanImpl getArtistHuman() {
        return artistHuman;
    }

    public List<PerformancePart> getPerfomanceParts() {
        return perfomanceParts;
    }

    public Performance setPerformanceParts(List<PerformancePart> perfomanceParts) {
        this.perfomanceParts = perfomanceParts;
        return this;
    }

    public Performance setPerformancePartsRandom(int performancePartsCount) {
        return setPerformanceParts(getPerformancePartsRandom(performancePartsCount));
    }

    public Performance addPerformanceParts(List<PerformancePart> perfomanceParts) {
        this.perfomanceParts.addAll(perfomanceParts);
        return this;
    }

    public Performance addPerformancePartsRandom(int performancePartsCount) {
        return addPerformanceParts(getPerformancePartsRandom(performancePartsCount));
    }

    public Performance addPerformancePart(PerformancePart perfomancePart) {
        this.perfomanceParts.add(perfomancePart);
        return this;
    }

    public Performance addPerformancePart(Artist artist, Action action) {
        this.perfomanceParts.add(new PerformancePart(artist, action));
        return this;
    }

    public Performance addPerformancePartRandom() {
        return addPerformancePart(getPerformancePartRandom());
    }

    public Performance addPerformancePartRandom(Artist artist) {
        return addPerformancePart(new PerformancePart(artist));
    }

    private PerformancePart getPerformancePartRandom() {
        Random random = new Random();
        int randomArtist = random.nextInt(artistHuman.getPets().size() + 1);
        if (randomArtist == artistHuman.getPets().size()) {
            return new PerformancePart(artistHuman);
        } else {
            return new PerformancePart(artistHuman.getPets().get(randomArtist));
        }
    }

    private List<PerformancePart> getPerformancePartsRandom(int performancePartsCount) {
        List<PerformancePart> performanceParts = new ArrayList<>();
        for (int i = 0; i < performancePartsCount; i++) {
            performanceParts.add(getPerformancePartRandom());
        }
        return performanceParts;
    }

    public String toStringWithoutValidation() {
        String result = "";
        for (PerformancePart part : perfomanceParts) {
            result = result + part.toString() + " -> ";
        }
        result = result.substring(0, result.lastIndexOf(" -> "));
        return result;
    }

    @Override
    public String toString() {
        validator.validateAll(this);
        return toStringWithoutValidation();
    }
}
