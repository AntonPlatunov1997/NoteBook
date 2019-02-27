package app.exceptions;

public class UniqueException extends Exception {
    private String sameName;




    public   UniqueException(String name){
        super(name);
        sameName = name;

    }

    public String toString(){
        String s = "Name " + sameName + " is existed";
        return s;
    }

}

