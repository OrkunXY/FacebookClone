package com.muhammet.mapper;

import com.muhammet.dto.request.UserProfileSaveRequestDto;
import com.muhammet.dto.request.UserProfileUpdateRequestDto;
import com.muhammet.rabbitmq.model.CreateUserModel;
import com.muhammet.repository.entity.UserProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-01T22:31:36+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class IUserProfileMapperImpl implements IUserProfileMapper {

    @Override
    public UserProfile toUserProfile(UserProfileSaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder userProfile = UserProfile.builder();

        userProfile.authid( dto.getAuthid() );
        userProfile.username( dto.getUsername() );
        userProfile.email( dto.getEmail() );

        return userProfile.build();
    }

    @Override
    public UserProfile toUserProfile(UserProfileUpdateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder userProfile = UserProfile.builder();

        userProfile.name( dto.getName() );
        userProfile.surname( dto.getSurname() );
        userProfile.phone( dto.getPhone() );
        userProfile.address( dto.getAddress() );
        userProfile.avatar( dto.getAvatar() );
        userProfile.gender( dto.getGender() );

        return userProfile.build();
    }

    @Override
    public UserProfile toUserProfile(CreateUserModel model) {
        if ( model == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder userProfile = UserProfile.builder();

        userProfile.authid( model.getAuthid() );
        userProfile.username( model.getUsername() );
        userProfile.email( model.getEmail() );

        return userProfile.build();
    }
}
