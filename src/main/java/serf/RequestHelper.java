package serf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservice.WebService;

public class RequestHelper 
{
	public static void process(HttpServletRequest request, HttpServletResponse response)
	{
		String uri = request.getRequestURI();
		switch(uri)
		{
			case "/Project2/register.do" : {WebService.register(request, response);break;}
			case "/Project2/login.do" : {WebService.login(request, response);break;}
		}
	}
}
