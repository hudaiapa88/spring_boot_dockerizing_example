package com.uc.docker.mapper;

import com.uc.docker.model.dto.StudentDto;
import com.uc.docker.model.entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-07T07:48:42+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.3 (Amazon.com Inc.)"
)
@Component
public class StudentDtoMapperImpl implements StudentDtoMapper {

    @Override
    public StudentDto convert(Student entity) {
        if ( entity == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        return studentDto;
    }

    @Override
    public List<StudentDto> convertList(List<Student> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>( entityList.size() );
        for ( Student student : entityList ) {
            list.add( convert( student ) );
        }

        return list;
    }
}
