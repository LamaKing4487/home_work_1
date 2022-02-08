package home_work_5.service.engine.api;

public interface  ISearchEngine {
    /**
     * Поиск количества переданного слова в тексте
     * @param text текс в котором мы ищем
     * @param word слово которое ищем
     * @return найденное количество
     */
    long search(String text, String word);
}
