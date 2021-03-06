package no.runsafe.cheeves.achievements;

import no.runsafe.cheeves.Achievement;
import no.runsafe.cheeves.AchievementHandler;
import no.runsafe.cheeves.Achievements;
import no.runsafe.framework.api.event.player.IPlayerCustomEvent;
import no.runsafe.framework.minecraft.event.player.RunsafeCustomEvent;

public class OpenPockets extends Achievement implements IPlayerCustomEvent
{
	public OpenPockets(AchievementHandler achievementHandler)
	{
		super(achievementHandler);
	}

	@Override
	public String getAchievementName()
	{
		return "Open Pockets";
	}

	@Override
	public String getAchievementInfo()
	{
		return "Give 20 coins or more to another player.";
	}

	@Override
	public int getAchievementID()
	{
		return Achievements.OPEN_POCKETS.ordinal();
	}

	@Override
	public void OnPlayerCustomEvent(RunsafeCustomEvent event)
	{
		if (event.getEvent().equals("achievement.openPockets"))
			award(event.getPlayer());
	}
}
