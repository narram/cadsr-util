/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Handy class for wrapping Exceptions so to allow a method to throw
 * just the wrapper and not have to throw a whole bunch of Exceptions.
 * (a la RemoteException)
 * printStackTrace() etc. are forwarded to the wrapped Exception.
 * Abstact to force the programmer to extend the class
 * (Class adopted from the book Expert one-one J2EE Development by Rod Johnson)
 */
public abstract class NestedCheckedException extends Exception 
                      implements HasRootCause {

 /**
  * Nested Exception to hold wrapped exception.
  */
  private Throwable rootCause;
  private String errorCode;
    
    
 /**
  * Constructs a <code>ExceptionWrapperException</code> with the specified
  * detail message.
  * @param s the detail message
  */
  public NestedCheckedException(String s) {
      super(s);
  }		
    
    
 /**
  * Constructs a <code>RemoteException</code> with the specified
  * detail message and nested exception.
  *
  * @param s the detail message
  * @param ex the nested exception
  */
  public NestedCheckedException(String s, Throwable ex) {
    super(s);
    rootCause = ex;
  }
	
	/** May be null */
	public Throwable getRootCause() {
		return rootCause;
	}
   
/**
 * Returns the detail message, including the message from the nested
 * exception if there is one.
 */
  public String getMessage() {
    if (rootCause == null)
      return super.getMessage();
    else
      return super.getMessage() + "; nested exception is: \n\t" + rootCause.toString();
  }
    
 /**
  * Prints the composite message and the embedded stack trace to
  * the specified stream <code>ps</code>.
  * @param ps the print stream
  */
  public void printStackTrace(PrintStream ps) {

    if (rootCause == null) {
        super.printStackTrace(ps);
    }
    else {
        ps.println(this);
        rootCause.printStackTrace(ps);
    } // else

  }
	
 /**
  * Prints the composite message and the embedded stack trace to
  * the specified print writer <code>pw</code>
  * @param pw the print writer
  */
  public void printStackTrace(PrintWriter pw) {

    if (rootCause == null) {
      super.printStackTrace(pw);
    }
    else {     
      pw.println(this);
      rootCause.printStackTrace(pw);
    }

  }
    
 /**
  * Prints the composite message to <code>System.err</code>.
  */
  public void printStackTrace() {
    printStackTrace(System.err);
    
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setErrorCode(String newErrorCode)
  {
    errorCode = newErrorCode;
  }
  
}	// ExceptionWrapperException
