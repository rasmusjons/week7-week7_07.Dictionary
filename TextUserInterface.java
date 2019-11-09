
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        boolean runProgram = true;
        while (runProgram) {
            System.out.println("Statement:");
            System.out.println("quit - quit the text user interface");

            String statement = reader.nextLine();

            if (statement.equals("quit")) {

                System.out.println("Cheers!");
                runProgram = false;
            } else if (statement.equals("add")) {
                add();
            
            } else if (statement.equals("translate")){
                translate(); 
            }
            else {
                System.out.println("Unknown statment");
            }
        }

    }

    public void add() {
        System.out.println("In Finnish");
        String key = this.reader.nextLine();
        System.out.println("Translation");
        String translation = this.reader.nextLine();
               
        this.dictionary.add(key, translation);
    }
    
    public void translate (){
        System.out.println("Give a word");
        String word = reader.nextLine();
        System.out.println(this.dictionary.translate(word)); 
        
    }

}
