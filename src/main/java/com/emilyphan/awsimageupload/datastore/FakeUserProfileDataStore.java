package com.emilyphan.awsimageupload.datastore;

import com.emilyphan.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//this class create in memory database
@Repository
public class FakeUserProfileDataStore {
     private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
     static {
         USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones",null ));
         USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "tonyjunior",null ));
     }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
