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

public class MCLMDLFace 
{
    private List<Vector3f> point = Lists.newArrayList();
    private List<Vector2f> coordFileTexture = Lists.newArrayList();
    //Must add Color variables but I don't know how to do (it's just a Vector3f variable with OpenGL)
}
