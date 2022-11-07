package com.uc.docker.mapper;

import com.uc.docker.model.dto.CourseDto;
import com.uc.docker.model.entity.Course;
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
public class CourseDtoMapperImpl implements CourseDtoMapper {

    @Override
    public CourseDto convert(Course entity) {
        if ( entity == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        return courseDto;
    }

    @Override
    public List<CourseDto> convertList(List<Course> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CourseDto> list = new ArrayList<CourseDto>( entityList.size() );
        for ( Course course : entityList ) {
            list.add( convert( course ) );
        }

        return list;
    }
}
