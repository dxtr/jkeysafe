package models;

import controllers.AbstractController;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public abstract class AbstractModel {
	protected PropertyChangeSupport propChangeSupport;
	
	public AbstractModel()
	{
		this.propChangeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl)
	{
		this.propChangeSupport.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl)
	{
		this.propChangeSupport.removePropertyChangeListener(pcl);
	}
	
	protected void firePropertyChange(String propName, Object oValue, Object nValue)
	{
		this.propChangeSupport.firePropertyChange(propName, oValue, nValue);
	}
}
