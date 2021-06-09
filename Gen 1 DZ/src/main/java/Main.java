import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[]args){
        GenAlgorithm genAlgorithm = new GenAlgorithm("shamil");
        genAlgorithm.generatePopulation();
        genAlgorithm.generateChancesToBeingParent();
        genAlgorithm.hybridization();

        //Шаг 2
        genAlgorithm.getProbabilityDistribution().clear();
        genAlgorithm.getChanceToBeingParent().clear();
        genAlgorithm.nextHybridization(2);

        //Шаг 3
        genAlgorithm.getProbabilityDistribution().clear();
        genAlgorithm.getChanceToBeingParent().clear();
        genAlgorithm.nextHybridization(3);

        //Шаг 4
        genAlgorithm.getProbabilityDistribution().clear();
        genAlgorithm.getChanceToBeingParent().clear();
        genAlgorithm.nextHybridization(4);

        //Шаг 5
        genAlgorithm.getProbabilityDistribution().clear();
        genAlgorithm.getChanceToBeingParent().clear();
        genAlgorithm.nextHybridization(5);

        //Шаг 6
        genAlgorithm.getProbabilityDistribution().clear();
        genAlgorithm.getChanceToBeingParent().clear();
        genAlgorithm.nextHybridization(6);

        //Шаг 7
        genAlgorithm.getProbabilityDistribution().clear();
        genAlgorithm.getChanceToBeingParent().clear();
        genAlgorithm.nextHybridization(7);

        //Шаг 8
        genAlgorithm.getProbabilityDistribution().clear();
        genAlgorithm.getChanceToBeingParent().clear();
        genAlgorithm.nextHybridization(8);
    }
}
