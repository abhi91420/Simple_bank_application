public class loginDetails{
    private static String userName;
    private static String passWord;
    loginDetails(){
        System.out.println("Login Details");
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setpassWord(String passWord){
        this.passWord = passWord;
    }
    public String getPassWord(){
        return this.passWord;
    }
}
