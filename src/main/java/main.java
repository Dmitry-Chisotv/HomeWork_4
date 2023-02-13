import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        String text = "";
        //1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
        //try {
            //FileWriter text = new FileWriter("homework.txt");
            //text.append("We are the champions");
            //text.flush();

            //FileReader readText = new FileReader("homework.txt");
            //while (readText.ready()) {
            //    text +=(char)readText.read();
            //}
            //System.out.println(text);

        //} catch (IOException e) {
        //    throw new RuntimeException(e);
        //}

        //2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы.
        // Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
        try {
            //FileWriter base = new FileWriter("base.sql");

            FileReader readBase = new FileReader("base.sql");
            while (readBase.ready()) {
                text +=(char)readBase.read();
            }
            System.out.println(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки.
        // Фамилии, имена, отчества, возрас и пол в отдельных списках.
        ArrayList<String>  secondName  = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        String [] strings = text.split("\r\n");
        for (int i=0; i< strings.length; i++ ){
            String db [] = strings[i].split(" ");
            secondName.add(db[0] + " ");
            firstName.add(db[1] + " ");
            surname.add(db[2] + " ");
            age.add(Integer.valueOf(db[3]));
            gender.add(db[4].equals("Ж") ? true : false);
            index.add(i);
        }
        //4.Отсортировать по возрасту используя дополнительный список индексов.

        }
    }

