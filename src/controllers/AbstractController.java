package controllers;

import models.AbstractModel;
import views.AbstractView;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.lang.reflect.Method;

public abstract class AbstractController implements PropertyChangeListener {
	private ArrayList<AbstractView> registeredViews;
	private ArrayList<AbstractModel> registeredModels;
	
	public AbstractController() {
		this.registeredViews = new ArrayList<AbstractView>();
		this.registeredModels = new ArrayList<AbstractModel>();
	}
	
	public void addModel(AbstractModel model) {
		this.registeredModels.add(model);
		model.addPropertyChangeListener(this);
	}
	
	public void removeModel(AbstractModel model) {
		this.registeredModels.remove(model);
		model.removePropertyChangeListener(this);
	}
	
	public void addView(AbstractView view) {
		this.registeredViews.add(view);
	}
	
	public void removeView(AbstractView view) {
		this.registeredViews.remove(view);
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		for (AbstractView view: this.registeredViews) {
			view.modelPropertyChange(evt);
		}
	}
	
	public void setModelProperty(String propertyName, Object nValue) {
		for (AbstractModel model: this.registeredModels) {
			try {
				Method m = model.getClass().getMethod(
						"set"+propertyName,
						new Class[] { nValue.getClass() }
					);
				m.invoke(model, nValue);
			} catch (Exception exc) {
				// lol handle this shit
			}
		}
	}
}
