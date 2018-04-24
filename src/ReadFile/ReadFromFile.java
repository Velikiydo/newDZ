package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFromFile {
    public static void main(String[] args) {

        File read = new File("ReadWords");
        Scanner scan = null;
        try {
            scan = new Scanner(read);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
        // подсчет слов и сортировка слов
        Map<String, Integer> allWords = new TreeMap<>();

        //Слова
        List<String> maxWords = new ArrayList<>();
        Integer maxNumber = 0;

              // Повторяющиеся слова
        while (scan.hasNext()) {
            String words = scan.useDelimiter("\\s+").next();
            Integer countWord = allWords.get(words);
            if (countWord == null) {
                countWord = 0;
            }
            allWords.put(words, ++countWord);

            // Макс повторений
            if (maxNumber < countWord) {
                maxNumber = countWord;
                maxWords.clear();
                maxWords.add(words);
            } else if (maxNumber.equals(countWord)) {
                maxWords.add(words);
            }
        }

        System.out.println("Слова по порядку с количеством:");
        System.out.println(allWords);
        System.out.printf("Чаще всего, встречается: " + maxWords);
        System.out.printf("Повторяется %d раз.", maxNumber);
        scan.close();
    }


}






