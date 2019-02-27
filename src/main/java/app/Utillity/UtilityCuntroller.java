package app.Utillity;

import app.exceptions.ValidationException;

public class UtilityCuntroller {

    private static UtilityCuntroller  instance = new UtilityCuntroller();

    public static UtilityCuntroller getInstance() {
        return instance;
    }

    public boolean checkValidData(String data, String regex) throws ValidationException {
        if (data.matches(regex)){
            return true;
        }
        throw new ValidationException(data);
    }

}
