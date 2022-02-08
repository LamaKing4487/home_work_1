package work_x.service.generators.api;

public interface IStringGenerator {

    /**
     * Метод генерации строки размером в заданном диапазоне
     * @param minCount минимальное количество символов
     * @param maxCount максимальное количество символов (включая)
     * @return готовая строка
     */
    String generate(int minCount, int maxCount);
}
