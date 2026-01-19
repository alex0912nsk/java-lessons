package korona.bk.modul2.homework.task4.interfaces;

import korona.bk.modul2.homework.task4.Performance;

public interface PerformanceValidator {
    void performancePartCount(Performance performance);
    void isArtistPossible(Performance performance);
    void isPerformancePossible(Performance performance);
    void isInteresting(Performance performance);
    void validateAll(Performance performance);
}
