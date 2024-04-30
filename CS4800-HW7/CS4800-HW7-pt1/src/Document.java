import java.io.*;
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    private StringBuilder text = new StringBuilder();

    public void addCharacter(char character, CharacterProperties properties) {
        text.append(character);
        System.out.println("Added character:" + character + ", with properties " + properties.getFont() + ", "
                + properties.getColor() + ", " + properties.getSize());;
    }
    public String getText(){
        return text.toString();
    }

    public void save(String filename) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(text.toString());
        }
    }

    public static Document load(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Document) in.readObject();
        }
    }
}
