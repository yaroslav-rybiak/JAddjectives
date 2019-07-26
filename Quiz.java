import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addLevel(1);
        dictionary.addLevel(2);
        dictionary.addLevel(3);
        List<String> japanese = dictionary.getJapaneseDictionary();
        List<String> english = dictionary.getEnglishDictionary();

        Scanner scanner = new Scanner(System.in);
        boolean correctFlag = true;
        int randomIndex = 0;
        int errorNumber = 0;
        List<String> errorList = new ArrayList<>();

        while (!japanese.isEmpty()) {
            Random rand = new Random();
            if(japanese.size() > 1 && correctFlag) {
                randomIndex = rand.nextInt(japanese.size());
            } else if(japanese.size() == 1 && correctFlag) {
                randomIndex = 0;
            }
            System.out.println(english.get(randomIndex));
            String input = scanner.nextLine();
            if(input.equals(japanese.get(randomIndex))) {
                japanese.remove(randomIndex);
                english.remove(randomIndex);
                correctFlag = true;
            } else {
                System.out.println("wrong");
                correctFlag = false;
                if(!errorList.contains(english.get(randomIndex))) {
                    errorNumber++;
                    errorList.add(english.get(randomIndex));
                }

        }
        if (!errorList.isEmpty()) {
            System.out.println(errorNumber + " errors:");
            System.out.println(errorList.toString());
        } else {
            System.out.println("Perfect score!");
        }
    }
}
