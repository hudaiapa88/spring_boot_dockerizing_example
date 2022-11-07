package com.uc.docker;

import com.uc.docker.model.entity.*;
import com.uc.docker.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
@Transactional
@Component
@RequiredArgsConstructor*/
public class DbLoader { /*implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CourseRepository courseRepository;
    private final PurchasedRepository purchasedRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;
    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        List<Category> categoryList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        List<Purchased> purchasedList = new ArrayList<>();
        if (0L == categoryRepository.count()) {
            categoryList = Arrays.asList(
                    Category.builder().title("Yazılım").build(),
                    Category.builder().title("Donanım").build(),
                    Category.builder().title("Bilgisayar").build(),
                    Category.builder().title("Muhasebe").build(),
                    Category.builder().title("Kişisel Gelişim").build(),
                    Category.builder().title("Yds").build(),
                    Category.builder().title("Ales").build()
            );
            categoryList = categoryRepository.saveAll(categoryList);
        }

        if (0L == studentRepository.count()) {
            studentList = Arrays.asList(
                    Student.builder().firstname("Mustafa").lastname("Cavlak").email("mus.1234@gmail.com").phone("+905467845535").build(),
                    Student.builder().firstname("Harun").lastname("Koçak").email("harun3456@gmail.com").phone("+905474892565").build(),
                    Student.builder().firstname("Ersin").lastname("Esmez").email("ersin.567@gmail.com").phone("+905569631245").build(),
                    Student.builder().firstname("Beril").lastname("Beyenmez").email("beril54@gmail.com").phone("+905466698754").build(),
                    Student.builder().firstname("Halis").lastname("Alkum").email("halisok@gmail.com").phone("+905558975781").build(),
                    Student.builder().firstname("Ömer").lastname("Asık").email("omer2343@gmail.com").phone("+905458154152").build(),
                    Student.builder().firstname("Kasım").lastname("Kaymaz").email("kasim6557@gmail.com").phone("+905478851245").build()

            );

            studentList = studentRepository.saveAll(studentList);
        }
        if (0L == teacherRepository.count()) {
            teacherList = Arrays.asList(
                    Teacher.builder().firstname("Ali").lastname("Korkmaz").email("ali.korkmaz@gmail.com").phone("+905467892535").build(),
                    Teacher.builder().firstname("Ahmet").lastname("Batmaz").email("ahmet.batmaz@gmail.com").phone("+905447892565").build(),
                    Teacher.builder().firstname("Aylin").lastname("Kalkmaz").email("aylin.korkmaz@gmail.com").phone("+905469631245").build(),
                    Teacher.builder().firstname("Eslem").lastname("Satmaz").email("eslem20@gmail.com").phone("+905466398754").build(),
                    Teacher.builder().firstname("Harun").lastname("Soylu").email("harun30@gmail.com").phone("+905558975241").build(),
                    Teacher.builder().firstname("Halit").lastname("Paslı").email("halit97@gmail.com").phone("+905458974152").build(),
                    Teacher.builder().firstname("Hasan").lastname("Sazlı").email("hasan123@gmail.com").phone("+905457851245").build()

            );
            teacherList = teacherRepository.saveAll(teacherList);
        }

        if (0L == courseRepository.count()) {
            courseList = Arrays.asList(
                    Course.builder().title("C# kursu").lesson("C#").description("C# ile nesneye yönelik programalama temellerini öğreneceğiz").teacher(teacherList.get(0)).category(categoryList.get(0)).build(),
                    Course.builder().title("Java kursu").lesson("Java").description("Java ile nesneye yönelik programalama temellerini öğreneceğiz").teacher(teacherList.get(1)).category(categoryList.get(0)).build(),
                    Course.builder().title("Muhasebe kursu").lesson("Muhasebe").description("Muhasebe temellerini öğreneceğiz").teacher(teacherList.get(2)).category(categoryList.get(3)).build(),
                    Course.builder().title("Kişisel Gelişim kursu").lesson("Kişisel Gelişim").description("Kişisel Gelişim öğreneceğiz").teacher(teacherList.get(3)).category(categoryList.get(4)).build(),
                    Course.builder().title("Yds kursu").lesson("Yds").description("Yds öğreneceğiz").teacher(teacherList.get(4)).category(categoryList.get(5)).build(),
                    Course.builder().title("Java Spring Boot kursu").lesson("Spring").description("Spring Boot temellerini öğreneceğiz").teacher(teacherList.get(1)).category(categoryList.get(0)).build()

            );

            courseList = courseRepository.saveAll(courseList);
        }


        if (0L == purchasedRepository.count()) {
            purchasedList = Arrays.asList(
                    Purchased.builder().student(studentList.get(0)).course(courseList.get(1)).build(),
                    Purchased.builder().student(studentList.get(0)).course(courseList.get(2)).build(),
                    Purchased.builder().student(studentList.get(0)).course(courseList.get(3)).build(),
                    Purchased.builder().student(studentList.get(1)).course(courseList.get(4)).build(),
                    Purchased.builder().student(studentList.get(1)).course(courseList.get(2)).build(),
                    Purchased.builder().student(studentList.get(1)).course(courseList.get(3)).build(),
                    Purchased.builder().student(studentList.get(2)).course(courseList.get(4)).build(),
                    Purchased.builder().student(studentList.get(2)).course(courseList.get(2)).build(),
                    Purchased.builder().student(studentList.get(2)).course(courseList.get(1)).build(),
                    Purchased.builder().student(studentList.get(3)).course(courseList.get(5)).build(),
                    Purchased.builder().student(studentList.get(3)).course(courseList.get(1)).build()


            );
            purchasedList = purchasedRepository.saveAll(purchasedList);
        }
    }

}
*/

}