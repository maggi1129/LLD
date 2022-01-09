package com.bosscoder;

import java.security.cert.Certificate;
import java.util.List;

public class Profile {
    List<Experience> experienceList;
    List<Certificate> certificateList;
    List<Education> educationList;
    List<Recommendation> recommendationList;
    List<Post> postList;

    byte[] profilePic;
    byte[] coverPic;
    String tagLine;
    ProfileStatus profileStatus;

    public void addExperience(Experience e){

    }
    public void removeExperience(Experience e){

    }

    // add certificates
    // add recommendations
    //add education

    public void addPost(Post post){

    }

    public void removePost(Post post){

    }

}
