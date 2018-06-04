package study;

public class HelloWorldAction {
    private String name;
    public String execute() throws  Exception{
        System.out.println(name);
        if("test".equals(name)){
            return PublicAction.GOOD;
        }else {
            return PublicAction.BAD;
        }

    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}