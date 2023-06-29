package models;

import java.util.*;

import static utilities.CSVHandler.loadCSVWithCondition;
import static utilities.constants.GeneralConstants.USERS_CSV_PATH;

public class User {

    private final String userName;
    private final String password;
    private final String nickname;

    public User(List<List<String>> parameters) {
        Map<String, String> adminUser = loadCSVWithCondition(USERS_CSV_PATH, parameters.get(0).get(0)).get(0);
        this.userName = adminUser.get("userName");
        this.password = adminUser.get("password");
        this.nickname = adminUser.get("nickName");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }
}
