package com.codepath.apps.mysimpletweets.models;


import org.json.JSONException;
import org.json.JSONObject;

public class User {
    // list the attributes
    private String name;
    private long uid;
    private String screenName;
    private String profileImageUrl;
    private String tagLine;
    private int followersCount;
    private int followingCount;

    public String getName() {
        return name;
    }

    public long getUid() {
        return uid;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    // deserialize the user json => user

    public String getTagLine() {
        return tagLine;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public int getFriendsCount() {
        return followingCount;
    }

    public static User fromJSON(JSONObject json){
       User u = new User();
       // extract and fill the values
       try {
           u.name = json.getString("name");
           u.uid = json.getLong("id");
           u.screenName = json.getString("screen_name");
           u.profileImageUrl = json.getString("profile_image_url");
           u.tagLine = json.getString("description");
           u.followersCount = json.getInt("followers_count");
           u.followingCount = json.getInt("friends_count");
       } catch (JSONException e){
           e.printStackTrace();

       }
       // Return a user
       return u;
   }

    }
