package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserListInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request,
        HttpServletResponse response) 
        throws ServletException, IOException {
    String url = "/index.html";

    // get current action
    String action = request.getParameter("action");
    if (action == null) {
    action = "join";  // default action
    }
    // perform action and set URL to appropriate page
    if (action.equals("join")) {
    url = "/index.html";    // the "join" page
    }
    else if (action.equals("add")) {                
    // get parameters from the request
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    String dateOfBirth = request.getParameter("dateBirth");
    String hearAboutUs = request.getParameter("hearAboutUs");
    String subscription = request.getParameter("subscription");
    String contactMethod = request.getParameter("contactMethod");

    // store data in User object and save User object in db
    User user = new User(firstName, lastName, email, dateOfBirth);
    user.setHearAboutUs(hearAboutUs);
    user.setSubscription(subscription);
    user.setContactMethod(contactMethod);

    // set User object in request object and set URL
    request.setAttribute("user", user);
    url = "/thanks.jsp";   // the "thanks" page
    }

    // forward request and response objects to specified URL
    getServletContext()
    .getRequestDispatcher(url)
    .forward(request, response);
    }    

    protected void doGet(HttpServletRequest request, 
    HttpServletResponse response) 
    throws ServletException, IOException {
    doPost(request, response);
    }
}


