package com.bosscoder;

import java.util.Date;
import java.util.List;

public class Member extends Person{

    List<Member> connections;
    List<Member> followers;
    Date dateOfMembership;
    List<Message> messageList;
    List<Company> followedCompanyList;
    List<Group> followedGroups;
    List<JobPosting> followedJobPostings;
    Profile profile;

    public void sendMessage(String message){

    }

    public void sendConnectionRequest(Member receipient){

    }

    public void readMessage(){

    }

    public void acceptConnectionRequest(Member sender){

    }

    // followMember


}
