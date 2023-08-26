

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Session s=SessionFactoryConfiguration.getInstance().getSession();
        StudentRepository studentRepo=new StudentRepository();
        StudentEntity entity=new StudentEntity();
        // entity.setNic("200046008959");
        // StudentName studentName=new StudentName("Stu 3", "Stu Last 3");
        // entity.setName(studentName);
        // List<String>mobiles=new ArrayList<>();
        // mobiles.add("0713329400");
        // mobiles.add("0777561289");
        // entity.setMobiles(mobiles);

        // studentRepo.saveStudent(entity);

        //get student

        StudentEntity studentEntity=studentRepo.getStudent(3);
        System.out.println(studentEntity.toString());

    }
}
