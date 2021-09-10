package com.emilyphan.awsimageupload.profile;

import com.emilyphan.awsimageupload.datastore.FakeUserProfileDataStore;
import org.springframework.stereotype.Repository;

import java.util.List;

// this class will use to interact with database
// this class
@Repository
public class UserProfileDataAccessService {
    //dependency injection
    //right now we use the fake data storage
    private final FakeUserProfileDataStore fakeUserProfileDataStore;

    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
        this.fakeUserProfileDataStore = fakeUserProfileDataStore;
    }

    List<UserProfile> getUserProfiles(){
        return fakeUserProfileDataStore.getUserProfiles();
    }
}
