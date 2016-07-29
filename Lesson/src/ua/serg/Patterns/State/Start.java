package ua.serg.Patterns.State;

import ua.serg.Patterns.State.context.TransformerContext;
import ua.serg.Patterns.State.state.FireState;
import ua.serg.Patterns.State.state.MoveState;
import ua.serg.Patterns.State.state.TransformerState;

/**
 * Created by shpak on 18.07.2016.
 */
public class Start {
    public static void main(String[] args) {
        TransformerContext transformerContext = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        transformerContext.setState(stateMove);
        transformerContext.action();

        transformerContext.setState(stateFire);
        transformerContext.action();
    }
}
