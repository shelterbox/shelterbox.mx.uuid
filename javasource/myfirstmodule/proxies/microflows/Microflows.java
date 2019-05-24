// This file was generated by Mendix Modeler 7.11.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static java.util.List<myfirstmodule.proxies.Demo> demo(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "MyFirstModule.Demo", params);
			java.util.List<myfirstmodule.proxies.Demo> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<myfirstmodule.proxies.Demo>();
				for (IMendixObject obj : objs)
					result.add(myfirstmodule.proxies.Demo.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}