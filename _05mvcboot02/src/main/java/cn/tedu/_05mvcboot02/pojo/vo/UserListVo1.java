package cn.tedu._05mvcboot02.pojo.vo;

public class UserListVo1 {
    private String userName;
    private String passWord;

    @Override
    public String toString() {
        return "UserListVo1{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
