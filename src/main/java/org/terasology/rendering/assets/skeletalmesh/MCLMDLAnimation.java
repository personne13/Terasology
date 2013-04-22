package org.terasology.rendering.assets.skeletalmesh;

import com.bulletphysics.linearmath.QuaternionUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.terasology.asset.Asset;
import org.terasology.asset.AssetUri;
import org.terasology.logic.manager.VertexBufferObjectManager;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector2f;
import javax.vecmath.Vector3f;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.lwjgl.opengl.GL11.GL_FLOAT;
import static org.lwjgl.opengl.GL11.GL_NORMAL_ARRAY;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_COORD_ARRAY;
import static org.lwjgl.opengl.GL11.GL_UNSIGNED_INT;
import static org.lwjgl.opengl.GL11.GL_VERTEX_ARRAY;
import static org.lwjgl.opengl.GL11.glDisableClientState;
import static org.lwjgl.opengl.GL11.glEnableClientState;
import static org.lwjgl.opengl.GL11.glNormalPointer;
import static org.lwjgl.opengl.GL11.glTexCoordPointer;
import static org.lwjgl.opengl.GL11.glVertexPointer;

/**
 * @author Thomas
 */

public class MCLMDLAnimation 
{
	public String animationName[128];
    public int isReversing;
    public int nbMovements;
    public List<int> indexMemberAffected = Lists.newArrayList();
    public List<int> typeAnimation = Lists.newArrayList();
    public List<int> axisAnimated = Lists.newArrayList();
    public List<float> minimalValue = Lists.newArrayList();
    public List<float> maximalValue = Lists.newArrayList();
    public List<float> basicValue = Lists.newArrayList();
    public List<int> initialPhase = Lists.newArrayList();
    public List<int> currentPhase = Lists.newArrayList();
    public List<int> phaseChanged = Lists.newArrayList();
    public List<int> period = Lists.newArrayList();//ms
    public int lastUpdate;
}
