package com.czipperz.blogspot.scrollingMoba;

import com.czipperz.cLibrary.game.CGameFrame;
import com.czipperz.cLibrary.game.CView;

/**
 * Created by Chris on 12/7/2014.
 */
public class Start {
    public static void main(String[] args) {
        new Start();
    }
    public CGameFrame frame;
    public Player player;

    public Start() {
        frame = new CGameFrame();
        frame.setSize(500, 500);
        CView view = new CView(frame);
        player = new Player(frame);
        view.addToDraw(player);
    }
}
