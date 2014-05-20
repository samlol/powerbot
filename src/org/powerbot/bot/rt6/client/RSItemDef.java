package org.powerbot.bot.rt6.client;

import org.powerbot.bot.ContextAccessor;
import org.powerbot.bot.Reflector;

public class RSItemDef extends ContextAccessor {
	public RSItemDef(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public String[] getActions() {
		return engine.access(this, String[].class);
	}

	public RSItemDefLoader getLoader() {
		return new RSItemDefLoader(engine, engine.access(this));
	}

	public int getID() {
		return engine.accessInt(this);
	}

	public String getName() {
		return engine.accessString(this);
	}

	public boolean isMembersObject() {
		return engine.accessBool(this);
	}

	public String[] getGroundActions() {
		return engine.access(this, String[].class);
	}
}
