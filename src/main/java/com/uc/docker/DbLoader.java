package com.uc.docker;

import com.uc.docker.model.dto.CategoryDto;
import com.uc.docker.model.entity.*;
import com.uc.docker.repository.*;
import com.uc.docker.util.mongo.generator.SequenceGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Transactional
@Component
@RequiredArgsConstructor
public class DbLoader {} /*implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CourseRepository courseRepository;
    private final PurchasedRepository purchasedRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    private final UserRepository userRepository;
    private final SequenceGenerator sequenceGenerator;

    @Override
    public void run(String... args) throws Exception {

        List<Category> categoryList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        List<Purchased> purchasedList = new ArrayList<>();
        if (0L == categoryRepository.count()) {
            categoryList = Arrays.asList(
                    Category.builder().id(sequenceGenerator.generateSequence("CATEGORY_SEQUENCE")).title("Yazılım").build(),
                    Category.builder().id(sequenceGenerator.generateSequence("CATEGORY_SEQUENCE")).title("Donanım").build(),
                    Category.builder().id(sequenceGenerator.generateSequence("CATEGORY_SEQUENCE")).title("Bilgisayar").build(),
                    Category.builder().id(sequenceGenerator.generateSequence("CATEGORY_SEQUENCE")).title("Muhasebe").build(),
                    Category.builder().id(sequenceGenerator.generateSequence("CATEGORY_SEQUENCE")).title("Kişisel Gelişim").build(),
                    Category.builder().id(sequenceGenerator.generateSequence("CATEGORY_SEQUENCE")).title("Yds").build(),
                    Category.builder().id(sequenceGenerator.generateSequence("CATEGORY_SEQUENCE")).title("Ales").build()
            );
            categoryList = categoryRepository.saveAll(categoryList);
        }

        if (0L == userRepository.count()) {
            studentList = Arrays.asList(
                    Student.builder().id(sequenceGenerator.generateSequence("STUDENT_SEQUENCE")).firstname("Mustafa").lastname("Cavlak").email("mus.1234@gmail.com").phone("+905467845535").build(),
                    Student.builder().id(sequenceGenerator.generateSequence("STUDENT_SEQUENCE")).firstname("Harun").lastname("Koçak").email("harun3456@gmail.com").phone("+905474892565").build(),
                    Student.builder().id(sequenceGenerator.generateSequence("STUDENT_SEQUENCE")).firstname("Ersin").lastname("Esmez").email("ersin.567@gmail.com").phone("+905569631245").build(),
                    Student.builder().id(sequenceGenerator.generateSequence("STUDENT_SEQUENCE")).firstname("Beril").lastname("Beyenmez").email("beril54@gmail.com").phone("+905466698754").build(),
                    Student.builder().id(sequenceGenerator.generateSequence("STUDENT_SEQUENCE")).firstname("Halis").lastname("Alkum").email("halisok@gmail.com").phone("+905558975781").build(),
                    Student.builder().id(sequenceGenerator.generateSequence("STUDENT_SEQUENCE")).firstname("Ömer").lastname("Asık").email("omer2343@gmail.com").phone("+905458154152").build(),
                    Student.builder().id(sequenceGenerator.generateSequence("STUDENT_SEQUENCE")).firstname("Kasım").lastname("Kaymaz").email("kasim6557@gmail.com").phone("+905478851245").build()

            );

            studentList = studentRepository.saveAll(studentList);
            teacherList = Arrays.asList(
                    Teacher.builder().id(sequenceGenerator.generateSequence("TEACHER_SEQUENCE")).firstname("Ali").lastname("Korkmaz").email("ali.korkmaz@gmail.com").phone("+905467892535").build(),
                    Teacher.builder().id(sequenceGenerator.generateSequence("TEACHER_SEQUENCE")).firstname("Ahmet").lastname("Batmaz").email("ahmet.batmaz@gmail.com").phone("+905447892565").build(),
                    Teacher.builder().id(sequenceGenerator.generateSequence("TEACHER_SEQUENCE")).firstname("Aylin").lastname("Kalkmaz").email("aylin.korkmaz@gmail.com").phone("+905469631245").build(),
                    Teacher.builder().id(sequenceGenerator.generateSequence("TEACHER_SEQUENCE")).firstname("Eslem").lastname("Satmaz").email("eslem20@gmail.com").phone("+905466398754").build(),
                    Teacher.builder().id(sequenceGenerator.generateSequence("TEACHER_SEQUENCE")).firstname("Harun").lastname("Soylu").email("harun30@gmail.com").phone("+905558975241").build(),
                    Teacher.builder().id(sequenceGenerator.generateSequence("TEACHER_SEQUENCE")).firstname("Halit").lastname("Paslı").email("halit97@gmail.com").phone("+905458974152").build(),
                    Teacher.builder().id(sequenceGenerator.generateSequence("TEACHER_SEQUENCE")).firstname("Hasan").lastname("Sazlı").email("hasan123@gmail.com").phone("+905457851245").build()

            );
            teacherList = teacherRepository.saveAll(teacherList);
        }


        if (0L == courseRepository.count()) {
            courseList = Arrays.asList(
                    Course.builder().id(sequenceGenerator.generateSequence("COURSE_SEQUENCE")).title("C# kursu").lesson("C#").description("C# ile nesneye yönelik programalama temellerini öğreneceğiz").teacherId(teacherList.get(0).getId()).categoryId(categoryList.get(0).getId()).build(),
                    Course.builder().id(sequenceGenerator.generateSequence("COURSE_SEQUENCE")).title("Java kursu").lesson("Java").description("Java ile nesneye yönelik programalama temellerini öğreneceğiz").teacherId(teacherList.get(1).getId()).categoryId(categoryList.get(0).getId()).build(),
                    Course.builder().id(sequenceGenerator.generateSequence("COURSE_SEQUENCE")).title("Muhasebe kursu").lesson("Muhasebe").description("Muhasebe temellerini öğreneceğiz").teacherId(teacherList.get(2).getId()).categoryId(categoryList.get(3).getId()).build(),
                    Course.builder().id(sequenceGenerator.generateSequence("COURSE_SEQUENCE")).title("Kişisel Gelişim kursu").lesson("Kişisel Gelişim").description("Kişisel Gelişim öğreneceğiz").teacherId(teacherList.get(3).getId()).categoryId(categoryList.get(4).getId()).build(),
                    Course.builder().id(sequenceGenerator.generateSequence("COURSE_SEQUENCE")).title("Yds kursu").lesson("Yds").description("Yds öğreneceğiz").teacherId(teacherList.get(4).getId()).categoryId(categoryList.get(5).getId()).build(),
                    Course.builder().id(sequenceGenerator.generateSequence("COURSE_SEQUENCE")).title("Java Spring Boot kursu").lesson("Spring").description("Spring Boot temellerini öğreneceğiz").teacherId(teacherList.get(1).getId()).categoryId(categoryList.get(0).getId()).build()

            );

            courseList = courseRepository.saveAll(courseList);
        }


        if (0L == purchasedRepository.count()) {
            purchasedList = Arrays.asList(
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(0).getId()).courseId(courseList.get(1).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(0).getId()).courseId(courseList.get(2).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(0).getId()).courseId(courseList.get(3).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(1).getId()).courseId(courseList.get(4).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(1).getId()).courseId(courseList.get(2).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(1).getId()).courseId(courseList.get(3).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(2).getId()).courseId(courseList.get(4).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(2).getId()).courseId(courseList.get(2).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(2).getId()).courseId(courseList.get(1).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(3).getId()).courseId(courseList.get(5).getId()).build(),
                    Purchased.builder().id(sequenceGenerator.generateSequence("PURCHASED_SEQUENCE")).studentId(studentList.get(3).getId()).courseId(courseList.get(1).getId()).build()


            );
            purchasedList = purchasedRepository.saveAll(purchasedList);
        }
    }

}*/

