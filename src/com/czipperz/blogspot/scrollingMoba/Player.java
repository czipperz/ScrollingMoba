package com.czipperz.blogspot.scrollingMoba;

import com.czipperz.cLibrary.game.CGameFrame;
import com.czipperz.cLibrary.game.CObject;
import com.czipperz.cLibrary.game.IDrawAble;
import com.czipperz.cLibrary.location.CRect;

import java.awt.*;

/**
 * Created by Chris on 12/12/2014.
 */
public class Player extends CObject {
    public Player(CGameFrame displayOn) {
        super(displayOn);
        loc = new CRect();
    }

    private CRect loc;

    public Rectangle getLocScreen() {
        return loc;
    }

    public IDrawAble draw(Graphics graphics) {
        return null;
    }

    public int getDepth() {
        return 0;
    }
}
