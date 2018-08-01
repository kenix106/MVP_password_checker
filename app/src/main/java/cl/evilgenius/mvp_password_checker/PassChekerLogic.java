package cl.evilgenius.mvp_password_checker;

public class PassChekerLogic {

    private PassChecker callback;

    public PassChekerLogic(PassChecker callback) {
        this.callback = callback;
    }

    public void PasswordEight (String pass){

        if (pass.trim().length() == 8){

            callback.correct();

        }else{
            callback.incorrect();
        }


    }
}
