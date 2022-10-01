package com.glaikunt.framework.esc.component.common;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;
import com.glaikunt.framework.application.Rectangle;

public class ContactComponent implements Component {

    private final Rectangle interaction = new Rectangle();
    private final Vector2 normal = new Vector2();
    private Rectangle bodyA, bodyB;

    public Rectangle getInteraction() {
        return interaction;
    }

    public Rectangle getBodyA() {
        return bodyA;
    }

    public void setBodyA(Rectangle bodyA) {
        this.bodyA = bodyA;
    }

    public Rectangle getBodyB() {
        return bodyB;
    }

    public void setBodyB(Rectangle bodyB) {
        this.bodyB = bodyB;
    }
}
