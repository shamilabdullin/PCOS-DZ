import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GenAlgorithm {
    private String name = "shamil";

    private char[] charName = name.toCharArray();
    private int nameLength = charName.length;
    private int populationSize = 10;

    private RandomString randomString = new RandomString();
    private ArrayList firstPopulation = new ArrayList();  // массив первых слов
    private ArrayList chanceToBeingParent = new ArrayList();

    public ArrayList getChanceToBeingParent() {
        return chanceToBeingParent;
    }

    public void setChanceToBeingParent(ArrayList chanceToBeingParent) {
        this.chanceToBeingParent = chanceToBeingParent;
    }

    public ArrayList getProbabilityDistribution() {
        return probabilityDistribution;
    }

    public void setProbabilityDistribution(ArrayList probabilityDistribution) {
        this.probabilityDistribution = probabilityDistribution;
    }

    private ArrayList probabilityDistribution = new ArrayList(); //начальная популяция с учетом распределения вер-ти для каждого слова быть родителем
    private Integer standartChance = 1;
    public GenAlgorithm(String name) {
        this.name = name;
    }

    public void generatePopulation(){
        for (int i = 0; i < populationSize; i++){
            firstPopulation.add(randomString.nextString()); // заполняем рандомными словами
            probabilityDistribution.add(firstPopulation.get(i));
        }
        System.out.println("Проводим первый этап скрещивания: \nНачальная популяция: ");
        System.out.println(firstPopulation);
    }

    private int chanceBeingParent = populationSize; // число (знаменатель) для вычисления вероятности для каждого слова быть родителем

    public void generateChancesToBeingParent(){ //генерация распределения вероятности для слов стать родителем
        for (int i = 0; i < populationSize; i++){
            // первоначальная вероятность для каждого слова
            chanceToBeingParent.add(i, standartChance);
            int collision = 0;
            Object ob = firstPopulation.get(i);
            String word = (String) firstPopulation.get(i);
            char[] word1 = word.toCharArray();
            for (int j = 0; j < nameLength; j++){
                if (charName[j] == word1[j]){
                    collision++;
                    chanceBeingParent++;
                    Integer integer = (Integer) chanceToBeingParent.get(i) + 1;
                    //System.out.println(o);
                    chanceToBeingParent.set(i, integer);
                }
            }
            for(int k = 0; k < collision; k++){
                probabilityDistribution.add(firstPopulation.get(i));
            }
        }
        System.out.println("Популяция учитывая вероятности стать родителем:\n" + probabilityDistribution);
        System.out.println(chanceToBeingParent);
        chanceToBeingParent.clear();
    }

    private ArrayList nextPopulation = new ArrayList();
    public void hybridization(){
        for (int i = 0; i < firstPopulation.size(); i++){
            int len = probabilityDistribution.size();
            Random randomGenerator = new Random();
            int randomInt1 = randomGenerator.nextInt(len);
            int randomInt2 = randomGenerator.nextInt(len);
            while (randomInt1 == randomInt2){
                randomInt2 = randomGenerator.nextInt(len);
            }
            String firstParent = (String) probabilityDistribution.get(randomInt1);
            String secondParent = (String) probabilityDistribution.get(randomInt2);
            System.out.print(firstParent + " + ");
            System.out.println(secondParent);

            //скрещиваем
            char[] charFirstParent = firstParent.toCharArray();
            char[] charSecondParent = secondParent.toCharArray();
            //String[] child = new String[6];
            String[] child = new String[6];
            for (int j = 0; j < nameLength; j++){
                double random = Math.random();
                if(random < 0.5){
                    child[j] = String.valueOf(charFirstParent[j]);
                }
                else child[j] = String.valueOf(charSecondParent[j]);
            }
            String stringChild = Arrays.toString(child);
            System.out.println(stringChild);
            stringChild = String.join("", child);
            nextPopulation.add(i, stringChild);
        }

        System.out.println("Вторая популяция: \n" + nextPopulation);
        System.out.println("Проводим второй этап скрещивания");

        //nextPopulation.clear();
        //chanceToBeingParent.clear();
    }

    public void nextHybridization(int iteration){
        ArrayList thirdPopulation = new ArrayList();
        for (int i = 0; i < populationSize; i++) {
            probabilityDistribution.add(nextPopulation.get(i));
        }
        //присвоение вероятности быть родителем
        for (int i = 0; i < populationSize; i++){
            chanceToBeingParent.add(i, standartChance);
            int collision = 0;
            Object ob = nextPopulation.get(i);
            String word = (String) nextPopulation.get(i);
            char[] word1 = word.toCharArray();
            for (int j = 0; j < nameLength; j++){
                if (charName[j] == word1[j]){
                    collision++;
                    chanceBeingParent++;
                    Integer integer = (Integer) chanceToBeingParent.get(i) + 1;
                    chanceToBeingParent.set(i, integer);
                }
            }
            for(int k = 0; k < collision; k++){
                probabilityDistribution.add(nextPopulation.get(i));
            }
        }
        System.out.println(iteration + " популяция учитывая вероятности стать родителем:\n" + probabilityDistribution);
        System.out.println(chanceToBeingParent);

        //выбираем родителей и скрещиваем
        //ArrayList realSecondPopulation = new ArrayList();
        for (int i = 0; i < nextPopulation.size(); i++){
            int len = probabilityDistribution.size();
            Random randomGenerator = new Random();
            int randomInt1 = randomGenerator.nextInt(len);
            int randomInt2 = randomGenerator.nextInt(len);
            while (randomInt1 == randomInt2){
                randomInt2 = randomGenerator.nextInt(len);
            }
            String firstParent = (String) probabilityDistribution.get(randomInt1);
            String secondParent = (String) probabilityDistribution.get(randomInt2);
            System.out.print(firstParent + " + ");
            System.out.println(secondParent);

            //скрещиваем
            char[] charFirstParent = firstParent.toCharArray();
            char[] charSecondParent = secondParent.toCharArray();
            //String[] child = new String[6];
            String[] child = new String[nameLength];
            for (int j = 0; j < nameLength; j++){
                double random = Math.random();
                if(random < 0.5){
                    child[j] = String.valueOf(charFirstParent[j]);
                }
                else child[j] = String.valueOf(charSecondParent[j]);
            }
            String stringChild = Arrays.toString(child);
            System.out.println(stringChild);
            stringChild = String.join("", child);
            thirdPopulation.add(i, stringChild);
        }

        System.out.println((iteration + 1) +  " популяция: \n" + thirdPopulation);
        System.out.println("Проводим следующий этап скрещивания");
    }
}
