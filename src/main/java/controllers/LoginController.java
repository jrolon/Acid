package controllers;

import models.User;
import pages.tasks.LoginTask;

public class LoginController {
    LoginTask loginTask;

    /**
     * Initiates the browser and the WebDriver to start with automation process.
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     * ChangeLog:
     */
    public void launchBrowser() {
        loginTask.launchBrowser();
    }

    /**
     * Manage the task to log into the web app
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     */
    public void signIn(User user) {
        loginTask.signIn(user);
    }

    public void signInBlank(){
        loginTask.signInBlank();
    }

    /**
     * Manage the tasks to validate if the user's Log in was successful, and he's on welcome page
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     */
    public void validateWelcomePage() {

        loginTask.validateWelcomePage();
    }

    /**
     * Manage the tasks to validate if the nickname is the indicated
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     */
    public void validateNickname(User user) {
        loginTask.validateNickname(user);
    }

    public void validateMessage(){
        loginTask.validateMessageError();

    }
}
