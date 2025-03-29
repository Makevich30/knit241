package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab1.Container;
import org.knit.solutions.lab1.Cube;
import org.knit.solutions.lab1.Shape;
import org.knit.solutions.lab1.Sphere;


@TaskDescription(taskNumber = 4, taskDescription = "", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task4 implements Solution {
    @Override
    public void execute() {
        Container container = new Container(1000);

        Shape sphere = new Sphere(5);
        Shape cube = new Cube(3);

        container.add(sphere);
        container.add(cube);
    }
}


