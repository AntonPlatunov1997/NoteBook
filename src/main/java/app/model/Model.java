package app.model;

import app.entities.User;
import app.exceptions.UniqueException;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
private List<User> listUsers;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        listUsers = new ArrayList<>();
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    public void addUser(User user){
    listUsers.add(user);
}


public void deleteUser(String user ){
    for (int i=0;i<listUsers.size();i++){
        if (listUsers.get(i).getLogin().equals(user)){
            listUsers.remove(i);
        }
    }
}

public  boolean checkUnique(String login)throws UniqueException{
    for (int i=0;i<listUsers.size();i++){
        if (listUsers.get(i).getLogin().equals(login)){
            throw new  UniqueException(login);
        }
}
     return true;
    }

    public boolean checkAccessData(String login,String password){
        for (User user:listUsers){
            if ((user.getLogin().equals(login))&&(user.getPassword().equals(password))){
                return true;
            }
        }
return false;
    }

    public List<String> list() {
        return listUsers.stream()
                .map(User::getLogin)
                .collect(Collectors.toList());
    }

}
