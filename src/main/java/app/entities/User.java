package app.entities;



public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
if(login != null?login.equals(user.login):user.login != null)return false;
return password != null?password.equals(user.password):user.password== null;

    }

    @Override
    public int hashCode() {
        int result = login != null? hashCode():0;
        result = 31*result+(password !=null ? password.hashCode():0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
