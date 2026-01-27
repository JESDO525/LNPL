public class User {
    //Variables
    private String name;
    private String password;

    //Contructor
    public void User(String name, String password){
        this.name = name;
        this.password = password;
    }

    //Getters and setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
    //Metodos
}
