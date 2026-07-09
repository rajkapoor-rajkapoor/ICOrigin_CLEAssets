

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class JavaService

{
	// ---( internal utility methods )---

	final static JavaService _instance = new JavaService();

	static JavaService _newInstance() { return new JavaService(); }

	static JavaService _cast(Object o) { return (JavaService)o; }

	// ---( server methods )---




	public static final void HelloWorld (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(HelloWorld)>> ---
		// @sigtype java 3.5
		// [i] field:0:required InputString
		// [o] field:0:required OutputString
		//System.out.println("I love my India...");
		// pipeline for reading Input
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	sInputMessage = "Hello " + IDataUtil.getString( pipelineCursor, "InputString" );
		pipelineCursor.destroy();
		
		// pipeline for creating output
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "OutputString", sInputMessage );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void TestJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(TestJavaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required Number1
		// [i] field:0:required Number2
		// [o] field:0:required Output
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	Number1 = IDataUtil.getString( pipelineCursor, "Number1" );
			String	Number2 = IDataUtil.getString( pipelineCursor, "Number2" );
			String	OutputValue = IDataUtil.getString( pipelineCursor, "Number1" )+IDataUtil.getString( pipelineCursor, "Number2" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "Output", OutputValue );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

