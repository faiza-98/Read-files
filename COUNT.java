import java.io.File;
import java.util.Scanner;
public class COUNT {
        public void counting()
                throws Exception {
            File file = new File("casestudy.txt");
            Scanner scanner = new Scanner(file);
            int words = 0;
            int characterCount = 0;
            int lines = 0;
            int paragraphCount = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                words += line.split(" ").length;
                characterCount += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");
                String[] sentenceList = line.split("[!?.:]+");
                lines += sentenceList.length;
                if (line.equals("")) {
                    paragraphCount++;
                }

            }
            System.out.println("words in file :" + words + "words");
            System.out.println("paragraph in file :" + paragraphCount + "paragraph");
            System.out.println("characters in file :" + characterCount + "characters");
            System.out.println("lines in file :" + lines + "lines");

        }


}