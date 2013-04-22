package org.terasology.rendering.assets.skeletalmesh;

import com.bulletphysics.linearmath.QuaternionUtil;
import com.google.common.collect.Lists;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;
import java.util.Collection;
import java.util.List;

/**
 * @author Thomas
 */

public class MCLMDLCube 
{
	private Vector3f objectSpacePos = new Vector3f();
    private Quat4f rotation = new Quat4f(0,0,0,1);

    private List<Face> face;
}
