package fanghou.email.spring.xml;

public class UserXml {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void run(){
        System.out.println("UserXML Spring Create object");
    }

    @Override
    public String toString() {
        return "UserXml{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
