package home_work_5.service.engine;
import home_work_5.service.engine.api.ISearchEngine;
public class EasySearch implements ISearchEngine{
    private static final char[] splitSymbols = " ,!:?&".toCharArray();

    /**
     * Поиск количества переданного слова в тексте
     * Слово это последовательный набор символов разделённый знаками
     *  1. -
     *  2. !
     *  3.  (пробелом)
     * @param text текс в котором мы ищем
     * @param word слово которое ищем
     * @return найденное количество
     */
    @Override
    public long search(String text, String word) {

        long count = 0;
        int foundIndex = 0;
        int wordLength = word.length();
        do {
            foundIndex = text.indexOf(word, foundIndex);

            if(foundIndex != -1){
                if(checkAroundChars(text, word, foundIndex)){
                    count++;
                }
                foundIndex += wordLength;
            }
        } while (foundIndex != -1);

        return count;
    }

    private boolean checkAroundChars(String text, String word, int foundIndex){
        int textLength = text.length();
        int wordLength = word.length();

        boolean splitCharBefore = foundIndex == 0;
        boolean splitCharAfter = foundIndex + wordLength == textLength;

        if(splitCharBefore && splitCharAfter){
            return true;
        }

        if(!splitCharBefore && isCharSpliterator(text.charAt(foundIndex - 1))){
            splitCharBefore = true;
        }

        if(!splitCharAfter && isCharSpliterator2(text.charAt(foundIndex + wordLength))){
            splitCharAfter = true;
        }

        return splitCharBefore && splitCharAfter;
    }

    private boolean isCharSpliterator(char foundChar){
        return foundChar == ' '
                || foundChar == ','
                || foundChar == '!'
                || foundChar == ':'
                || foundChar == '&'
                || foundChar == '?'
                ;
    }

    private boolean isCharSpliterator2(char foundChar){
        for (char splitSymbol : splitSymbols) {
            if(splitSymbol == foundChar){
                return true;
            }
        }
        return false;
    }
}
