package com.emilyphan.awsimageupload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

//annotation
@RestController
@RequestMapping("api/v1/user-profile")
// API LAYER
// Business logic
//CORS to test - enable access for everything
@CrossOrigin("*")
public class UserProfileController {
    private final UserProfileService userProfileService;

    @Autowired
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping
    public List<UserProfile> getUserProfiles(){
        return  userProfileService.getUserProfiles();
    }

    // update the profile with correct profile link
    // take PathVariable :
    // actual file
    @PostMapping (
            path= "{userProfileId}/image/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void uploadUserProfileImage(@PathVariable("userProfileId")UUID userProfileId
                                    , @RequestParam("file") MultipartFile file ){

        userProfileService.uploadUserProfileImage(userProfileId, file);
    }
}
