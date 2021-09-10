package com.emilyphan.awsimageupload.profile;

//define a service class


//business logic for app

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserProfileService {
    private final UserProfileDataAccessService userProfileDataAccessService;
    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }
    List<UserProfile> getUserProfiles(){
        return userProfileDataAccessService.getUserProfiles();
    }
    // Multu data class contains the standard information for the file in the system
    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
       //check list ot upload image :
        // 1. Check if image is not empty
        //2. if file is an image
        //3. the user exists in our database
        //3. grab some metadata from file if any
        //4. store the image in s3 and update database (userProfile Image Link ) with s3 image link
           if(!file.isEmpty() && file.getContentType()== "image/jpeg"){
             Optional<UserProfile> result = userProfileDataAccessService.getUserProfiles().stream().filter(user-> userProfileId.equals(user.getUserProfileId())).findAny();
             if(result.isPresent()){

             }
           }
    }
}
