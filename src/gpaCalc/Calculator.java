package gpaCalc;

import java.io.IOException;
import gpaCalc.helper.*;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private double[] Marks = new double[10];
	private String[] TestNames = new String[10];
	
    public Calculator() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String SubjectName = request.getParameter("subName");
		 for( int i=0 ; i<10 ; i++)
		{
			 
			TestNames[i]= request.getParameter("TestName"+i);
			Double a = Helper.percentageMarks(Double.parseDouble(request.getParameter("MarksOutOf"+i)), Double.parseDouble(request.getParameter("MarksObtained" + i)));
			Marks[i] =Helper.percentCover(a,Double.parseDouble(request.getParameter("totalPercentage" + i)) );
			
			
			
			
		}
		 double GPA = Helper.GPA(Helper.addArray(Marks));
		 
		 for(int j = 0; j<10;j++) {
			 pw.println(TestNames[j]+" scored: "+Marks[j]+"<br>");
			 
		 }
		 pw.println("Your GPA is: "+GPA+" "+SubjectName);	
				
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
