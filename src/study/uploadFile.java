package study;

import java.io.File;

import com.opensymphony.xwork2.ActionContext;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;

public class uploadFile extends ActionSupport {
    private File myFile;
    private String myFileContentType;
    private String myFileFileName;
    private String destPath;
    private String test;
    public String execute() {
        /* 将文件复制到安全位置 */
        System.out.println("test:"+test);
        ActionContext ac = ActionContext.getContext();
        ServletContext sc = (ServletContext) ac.get(ServletActionContext.SERVLET_CONTEXT);
        String path = sc.getRealPath("/");
        destPath =path+"uploadFile";
        System.out.println(destPath);
        try {
//            System.out.println("Src File name: " + myFile);
//            System.out.println("Dst File name: " + myFileFileName);

            File destFile = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);

        } catch (IOException e) {
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    }

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }
}
