import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse; 
/*if the compiler is unable to identify the pacakge then we need to give the class path for that particular jar file.
	now, we need to identify  which jar will be having the javax.servlet package import the jar file.
   

	*/

public class MyServlet1 implements Servlet{

	ServletConfig config;

  public void init(javax.servlet.ServletConfig config)
  {
  	this.config = config;
  	System.out.println("inside init()");
  }
  public javax.servlet.ServletConfig getServletConfig()
  {
  	System.out.println("inside getServletInfo()");
  	return null;
  }
  public void service(ServletRequest request, ServletResponse response) 
  {
  		System.out.println("Inside service()");
  }
  public java.lang.String getServletInfo()
  {
  	  		System.out.println("Inside sgetServletInfo()");

  		//expecting return value as a string
  	return "Servlet Info";
  }
  public void destroy()
  {
  		  		System.out.println("Inside destry()");

  }

	
}