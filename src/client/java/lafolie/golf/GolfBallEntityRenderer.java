package lafolie.golf;

import lafolie.golf.entities.GolfBallEntity;
import lafolie.golf.util.GolfIdentifier;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.util.Identifier;

public class GolfBallEntityRenderer extends EntityRenderer<GolfBallEntity>
{

	protected GolfBallEntityRenderer(Context ctx)
	{
		super(ctx);
	}

	@Override
	public Identifier getTexture(GolfBallEntity var1)
	{
		// TODO Auto-generated method stub
		return GolfIdentifier.content("textures/entity/golf_ball/golf_ball.png");
	}
	
}
