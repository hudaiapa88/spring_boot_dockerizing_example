package com.uc.docker.mapper;

import com.uc.docker.model.dto.TeacherDto;
import com.uc.docker.model.entity.Teacher;
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
public class TeacherDtoMapperImpl implements TeacherDtoMapper {

    @Override
    public TeacherDto convert(Teacher entity) {
        if ( entity == null ) {
            return null;
        }

        TeacherDto teacherDto = new TeacherDto();

        return teacherDto;
    }

    @Override
    public List<TeacherDto> convertList(List<Teacher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TeacherDto> list = new ArrayList<TeacherDto>( entityList.size() );
        for ( Teacher teacher : entityList ) {
            list.add( convert( teacher ) );
        }

        return list;
    }
}
