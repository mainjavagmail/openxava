package org.openxava.tab.impl;



import org.openxava.calculators.*;
import org.openxava.model.meta.*;
import org.openxava.util.*;
import org.openxava.util.meta.*;


/**
 *@author Javier Paniza
 */

public class TabCalculator implements java.io.Serializable {
	private int index;
	private String propertyName;
	private MetaCalculator metaCalculator;
	private ICalculator calculator;
	private PropertiesManager propertiesManager;
	

	public TabCalculator(MetaProperty metaProperty, int propertyIndex)
		throws XavaException {
		this.index = propertyIndex;
		this.propertyName = metaProperty.getQualifiedName();
		if (metaProperty.isNotFieldBackedAndNotCalculated()) {
			this.metaCalculator = createModelPropertyMetaCalculator(metaProperty); 
		}
		else this.metaCalculator = metaProperty.getMetaCalculator();
		this.calculator = metaCalculator.createCalculator();
		this.propertiesManager = new PropertiesManager(calculator);
	}
	
	private MetaCalculator createModelPropertyMetaCalculator(MetaProperty metaProperty) { 
		MetaCalculator metaCalculator = new MetaCalculator();
		metaCalculator.setClassName(ModelPropertyCalculator.class.getName());
		MetaSet metaSet = new MetaSet();
		metaSet.setPropertyName("property");
		metaSet.setValue(metaProperty.getName());
		metaCalculator.addMetaSet(metaSet);
		return metaCalculator;
	}

	public ICalculator getCalculator() {
		return calculator;
	}

	public int getIndex() {
		return index;
	}

	public PropertiesManager getPropertiesManager() {
		return propertiesManager;
	}

	public MetaCalculator getMetaCalculator() {
		return metaCalculator;
	}

	public String getPropertyName() {
		return propertyName;
	}

}

