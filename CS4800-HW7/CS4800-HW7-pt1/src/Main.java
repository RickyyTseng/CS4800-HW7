import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CharacterProperties variation1 = Character.getCharacterProperties("Arial", "Red", 15);
        CharacterProperties variation2 = Character.getCharacterProperties("Calibri", "Blue", 5);
        CharacterProperties variation3 = Character.getCharacterProperties("Verdana", "Yellow", 30);
        CharacterProperties variation4 = Character.getCharacterProperties("Roboto", "Green", 20);

        // Create a document and add characters with different properties
        Document document = new Document();
        document.addCharacter('H', variation1);
        document.addCharacter('e', variation2);
        document.addCharacter('l', variation3);
        document.addCharacter('l', variation4);
        document.addCharacter('o', variation1);
        document.addCharacter(' ', variation2);
        document.addCharacter('W', variation3);
        document.addCharacter('o', variation4);
        document.addCharacter('r', variation1);
        document.addCharacter('l', variation2);
        document.addCharacter('d', variation3);

        // Save the document to a .txt file
        try {
            document.save("CS4800HW7.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load the document from the file and display its content
        try {
            BufferedReader reader = new BufferedReader(new FileReader("CS4800HW7.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}