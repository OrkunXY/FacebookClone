package com.muhammet.mapper;

import com.muhammet.dto.request.UserProfileDto;
import com.muhammet.repository.entity.UserProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-01T22:31:13+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class IUserProfileMapperImpl implements IUserProfileMapper {

    @Override
    public UserProfile toUserProfile(UserProfileDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder userProfile = UserProfile.builder();

        userProfile.userid( dto.getId() );
        userProfile.id( dto.getId() );
        userProfile.authid( dto.getAuthid() );
        userProfile.username( dto.getUsername() );
        userProfile.email( dto.getEmail() );
        userProfile.name( dto.getName() );
        userProfile.surname( dto.getSurname() );
        userProfile.phone( dto.getPhone() );
        userProfile.address( dto.getAddress() );
        userProfile.avatar( dto.getAvatar() );
        userProfile.gender( dto.getGender() );

        return userProfile.build();
    }
}
