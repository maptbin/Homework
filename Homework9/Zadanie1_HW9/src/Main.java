import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
"L:\\Intellij_IDEA\\Projects\\Homework\\Homework9\\Zadanie1_HW9\\some_file1"
У вас есть каталог, в котором находится произвольное количество текстовых файлов. Нужно написать программу,
которая имея путь к этому каталогу по очереди проходится и считывает информацию из каждого файла, при этом
дозаписывая её в новый файл (result.txt). Таким образом в файле result.txt в результате работы программы
должен быть собран текст из всех файлов в каталоге. Например, в файле «some file 1.txt» записано «hello », а в
файле «some file 2.txt» записано «world!», таким образом в файле result.txt будет записано «hello world!» */
public class Main {
    private static final String dirPath = "L:\\Intellij_IDEA\\Projects\\Homework\\Homework9\\Zadanie1_HW9";
    private static final String result = "result.txt";


    public static void main(String[] args) {

        textFiles(dirPath);

        
        recordFiles(dirPath, result);
    }

    private static void textFiles(String dirPath) {
        System.out.println("Создаем первый файл some_file1.txt");
        try (FileWriter writer1 = new FileWriter(dirPath + "\\some_file1.txt", false)) {
            String text1 = "Hello ";
            writer1.write(text1);
            System.out.println("Файл some_file1.txt создан с текстом " + text1);
        } catch (IOException ex) {
            ex.printStackTrace();

        }
        System.out.println("Создаем второй файл some_file2.txt");
        try (FileWriter writer2 = new FileWriter(dirPath + "\\some_file2.txt", false)) {
            String text2 = "World!";
            writer2.write(text2);
            System.out.println("Файл some_file2.txt создан с текстом " + text2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void recordFiles(String dirPath, String result) {
        System.out.println("Запись текста в файл result.txt");
        File sourceDir = new File(dirPath);
        File resultFile = new File(sourceDir, result);

        try (FileWriter writer = new FileWriter(resultFile, false)) {
            if (!sourceDir.exists() || !sourceDir.isDirectory()) {
                System.out.println("Каталог не найден");
            }
            File[] files = sourceDir.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println("Чтение и запись файла: " + file);
                    StringBuilder inside = new StringBuilder();
                    try (Scanner sc = new Scanner(file)) {
                        while (sc.hasNextLine()) {
                            inside.append(sc.nextLine());
                        }
                    } catch (IOException ignored) {

                    }
                    writer.write(inside.toString());
                    writer.write(" ");
                }
            }
        } catch (IOException ignored) {

        }
    }
}