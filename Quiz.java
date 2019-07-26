import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Quiz {
    Quiz(){}

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addLevel(1);
//        dictionary.addLevel(2);
//        dictionary.addLevel(3);

        ArrayList<String> answerDictionary = dictionary.getEnglishDictionary();
        ArrayList<String> questionDictionary = dictionary.getJapaneseDictionary();

        Scanner scanner = new Scanner(System.in);
        boolean correctFlag = true;
        int randomIndex = 0;
        int errorNumber = 0;
        ArrayList<String> errorList = new ArrayList<>();

        while (!answerDictionary.isEmpty()) {
            Random rand = new Random();
            if(answerDictionary.size() > 1 && correctFlag) {
                randomIndex = rand.nextInt(answerDictionary.size());
            } else if(answerDictionary.size() == 1 && correctFlag) {
                randomIndex = 0;
            }
            System.out.println(questionDictionary.get(randomIndex));
            String input = scanner.nextLine();
            if(answerDictionary.get(randomIndex).contains(input)) {
                answerDictionary.remove(randomIndex);
                questionDictionary.remove(randomIndex);
                correctFlag = true;
            } else {
                System.out.println("wrong");
                correctFlag = false;
                if(!errorList.contains(questionDictionary.get(randomIndex))) {
                    errorNumber++;
                    errorList.add(questionDictionary.get(randomIndex));
                }
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
