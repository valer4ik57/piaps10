package ru.vsu.cs.rv;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainApp {

    public static void main(String[] args) throws ParseException {
        Faculty engineering = new Faculty("Engineering and Technology");
        Institute robotics = new Institute("robotics", "Tech avenue, 42");
        Institute ai = new Institute("artificial intelligence", "Innovation street, 10");
        engineering.setInstitutes(new Institute[]{robotics, ai});

        ResearchAssociate associate1 = new ResearchAssociate(11, "Alice Smith", "alice.smith@mail.com", "robotics");
        ResearchAssociate associate2 = new ResearchAssociate(12, "Bob Brown", "bob.brown@mail.com", "robotics");
        ResearchAssociate associate3 = new ResearchAssociate(13, "Charlie Green", "charlie.green@mail.com", "ai");
        ResearchAssociate associate4 = new ResearchAssociate(14, "Diana White", "diana.white@mail.com", "ai");
        robotics.setEmployees(new ResearchAssociate[]{associate1, associate2});
        ai.setEmployees(new ResearchAssociate[]{associate3, associate4});

        Project projectAlpha = new Project("Quantum Computing",
                new SimpleDateFormat("dd.MM.yyyy").parse("01.01.2024"),
                new SimpleDateFormat("dd.MM.yyyy").parse("31.12.2024"), new Participation(10));
        associate1.setProjects(new Project[]{projectAlpha});

        Course courseAI = new Course("Machine Learning Basics", 50, 100);
        Lecturer lecturerAI = new Lecturer(21, "Evan Grey", "evan.grey@mail.com", "ai");
        lecturerAI.setCourses(new Course[]{courseAI});

        AdministrativeEmployee adminEmployee = new AdministrativeEmployee(31,
                "Grace Black", "grace.black@mail.com", "admin");

        Institute[] facultyInstitutes = engineering.getInstitutes();
        System.out.println("Institutes in " + engineering.getName() + ": \n");
        for (Institute inst : facultyInstitutes) {
            System.out.println(inst.getName());
        }
        System.out.println();

        ResearchAssociate[] roboticsEmployees = robotics.getEmployees();
        System.out.println("Research Associates in " + robotics.getName() + ": \n");
        for (ResearchAssociate associate : roboticsEmployees) {
            System.out.println(associate.getName());
        }
        System.out.println();

        ResearchAssociate[] aiEmployees = ai.getEmployees();
        System.out.println("Research Associates in " + ai.getName() + ": \n");
        for (ResearchAssociate associate : aiEmployees) {
            System.out.println(associate.getName());
        }
        System.out.println();

        Project[] alphaProjects = associate1.getProjects();
        System.out.println("Projects assigned to " + associate1.getName() + ": \n");
        for (Project project : alphaProjects) {
            System.out.println(project.getName());
        }
        System.out.println();

        Course[] lecturerCourses = lecturerAI.getCourses();
        System.out.println("Courses taught by " + lecturerAI.getName() + ": \n");
        for (Course course : lecturerCourses) {
            System.out.println(course.getName());
        }
        System.out.println();
        System.out.println("Administrative Staff:");
        System.out.println();
        System.out.println(adminEmployee.getName());
    }
}
