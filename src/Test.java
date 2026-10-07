import models.Plain;
import services.FileService;
import services.PlainService;

import java.util.Scanner;

public class Test {

    public static final String URL = "plain.txt";
    public static void main(String[] args) throws Exception {
        String[] url = FileService.readFile(URL);
        Plain[] convert = PlainService.convert(url);
        //FileService.writeFile("Plain1" + ".txt", convert[0].toString());


        while(true) {
            Scanner input =  new Scanner(System.in);
            int num = input.nextInt();
            switch (num) {
                case 1:
                    PlainService.Task1(convert[0]);
                    break;
                case 2:
                    PlainService.Task2(convert[2]);
                    break;
                case 3:
                    FileService.writeFile("task3.txt", PlainService.Task3(convert[1], convert[0]).toString());
                    break;
                case 4:
                    FileService.writeFile("Task4.txt", PlainService.Task4(convert[2],convert[1]));
                    break;
                case 5:
                    FileService.writeFile("Task5.txt", PlainService.Task5(convert[0],convert[1], convert[2]));
                    break;
                case 6:
                    PlainService.Task6(convert);
                    break;
                case 7:
                    PlainService.Task7(convert);
                    break;
                case 8:
                    FileService.writeFile("Task8.txt",PlainService.Task8(convert).toString());
                    break;
                case 9:
                    FileService.writeFile("Task9.txt",PlainService.Task9(convert).toString());
                    break;

                case 10:
                    PlainService.Task10(convert);
                    break;


            }
        }

    }
}
