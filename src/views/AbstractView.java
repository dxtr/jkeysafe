package views;

@SuppressWarnings("serial")
public abstract class AbstractView extends javax.swing.JFrame {
    protected controllers.AbstractController controller;
    public abstract void modelPropertyChange(java.beans.PropertyChangeEvent event);
    
    public AbstractView(controllers.AbstractController c) { this.controller = c; }
}
