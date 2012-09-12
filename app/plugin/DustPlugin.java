package plugin;

import java.util.List;

import play.Configuration;
import play.Play;
import play.Plugin;

public abstract class DustPlugin extends Plugin {

	private static final String SETTING_KEY_PLAY_AUTHENTICATE = "play-authenticate";

	@Override
	public void onStart() {

		final List<String> settingsKey = getSettings();
		if (settingsKey != null) {
			final Configuration c = getConfiguration();
		}
	}

	protected Configuration getConfiguration() {
		return Play.application().configuration().getConfig(SETTING_KEY_PLAY_AUTHENTICATE);
	}

	protected List<String> getSettings() {
		return null;
	}
}
