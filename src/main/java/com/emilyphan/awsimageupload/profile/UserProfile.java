package com.emilyphan.awsimageupload.profile;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private UUID userProfileId;
    private String username;
    private String userProfileImageLink; //S3 key

    public UserProfile(UUID userProfileId,
                       String username,
                       String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //this can be null so it should return optional
    // someone call this method can use optionals and stream to code against it
    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProfile)) return false;
        UserProfile that = (UserProfile) o;
        // we will have nulls check for this instead of check null in every object
        return Objects.equals(getUserProfileId(), that.getUserProfileId()) &&
                Objects.equals(getUsername(), that.getUsername()) &&
                Objects.equals(getUserProfileImageLink(), that.getUserProfileImageLink());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserProfileId(), getUsername(), getUserProfileImageLink());
    }
}
