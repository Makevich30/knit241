package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab1.File;
import org.knit.solutions.lab1.FileSystemComponent;
import org.knit.solutions.lab1.Folder;

@TaskDescription(taskNumber = 5, taskDescription = "Краткое описание задачи 5", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task5 implements Solution {
    @Override
    public void execute() {
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);

        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");

        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);
        folder2.add(folder1);

        folder2.display("");

        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
    }
}
