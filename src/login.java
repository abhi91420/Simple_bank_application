public class login extends Draw implements loginDetails{
    private String userName;
    private String password;
    public login(){
       doubleLine("Login Page");
    }
    public login(boolean b){
        doubleLine("Signup page");
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }
}
