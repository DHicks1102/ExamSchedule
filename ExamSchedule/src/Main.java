import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Main {
    public static void dataSetup() {
        String schedulename = "ScheduleOfClasses.csv";
        String examname = "Exam_Schedule.csv";
        try {
            FileInputStream scheduleFile = new FileInputStream(schedulename);
            FileInputStream examFile = new FileInputStream(examname);

            Scanner classScanner = new Scanner(scheduleFile);
            Scanner examScanner = new Scanner(examFile);

            classScanner.useDelimiter(",");
            examScanner.useDelimiter(",");

            System.out.println("Testing Schedule of Classes Schedule File.\n");
            while (classScanner.hasNextLine()) {
                String line = classScanner.nextLine();
                System.out.println(line);
            }

            System.out.println("Testing Exam Schedule File.\n");
            while (examScanner.hasNextLine()) {
                String line2 = examScanner.nextLine();
                System.out.println(line2);
            }
        } catch (FileNotFoundException failedFile) {
            failedFile.printStackTrace();
        }
    }
    public static void main(String[] args) {
        dataSetup();

        }

    }

