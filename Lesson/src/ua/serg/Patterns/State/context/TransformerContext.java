package ua.serg.Patterns.State.context;

import ua.serg.Patterns.State.state.TransformerState;

/**
 * Created by shpak on 18.07.2016.
 */
public class TransformerContext implements TransformerState {

    private TransformerState state;

    public TransformerState getState() {
        return state;
    }

    public void setState(TransformerState state) {
        this.state = state;
    }

    @Override
    public void action() {
        this.state.action();
    }
}
