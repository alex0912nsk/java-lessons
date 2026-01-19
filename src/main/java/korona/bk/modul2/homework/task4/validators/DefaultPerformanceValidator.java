package korona.bk.modul2.homework.task4.validators;

import korona.bk.modul2.homework.task4.Performance;
import korona.bk.modul2.homework.task4.PerformancePart;
import korona.bk.modul2.homework.task4.interfaces.PerformanceValidator;

import java.util.HashSet;
import java.util.Set;

public class DefaultPerformanceValidator implements PerformanceValidator {
    @Override
    public void performancePartCount(Performance performance) {
        if (performance.getPerfomanceParts().isEmpty() || performance.getPerfomanceParts().size() < 10) {
            System.err.println("ERROR Следующий номер слишком короткий, должно быть не менее 10ти частей: '" + performance.toStringWithoutValidation() + "'");
        }
    }

    @Override
    public void isArtistPossible(Performance performance) {
        for (PerformancePart part : performance.getPerfomanceParts()) {
            if (!(part.getArtist().equals(performance.getArtistHuman()) || performance.getArtistHuman().getPets().contains(part.getArtist()))) {
                System.err.println("ERROR " + part.getArtist().getName() + " не является частью выступления '" + performance.toStringWithoutValidation() + "'");
            }
        }
    }

    @Override
    public void isPerformancePossible(Performance performance) {
        for (PerformancePart part : performance.getPerfomanceParts()) {
            if (!part.getArtist().getActions().contains(part.getAction())) {
                System.err.println("ERROR " + "Артист " + part.getArtist().getName() + " не может сделать действие '" + part.getAction().getAction() + "'");
            }
        }
    }

    @Override
    public void isInteresting(Performance performance) {
        Set<PerformancePart> performanceSet = new HashSet<>(performance.getPerfomanceParts());
        if (performanceSet.size() < performance.getPerfomanceParts().size()) {
            System.err.println("ERROR Следующий номер имеет повторы и может быть неинтересным: '" + performance.toStringWithoutValidation() + "'");
        }
    }

    @Override
    public void validateAll(Performance performance) {
        performancePartCount(performance);
        isArtistPossible(performance);
        isPerformancePossible(performance);
        isInteresting(performance);
    }
}
