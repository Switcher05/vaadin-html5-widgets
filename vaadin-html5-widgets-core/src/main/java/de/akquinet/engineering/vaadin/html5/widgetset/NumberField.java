/*
 * Copyright 2014 akquinet engineering GmbH
 *  
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.akquinet.engineering.vaadin.html5.widgetset;

import com.vaadin.data.Property;
import com.vaadin.ui.TextField;

import de.akquinet.engineering.vaadin.html5.widgetset.client.NumberFieldState;

public class NumberField extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberField() {
		super();
	}

	public NumberField(Property<?> dataSource) {
		super(dataSource);
	}

	public NumberField(String caption, Property<?> dataSource) {
		super(caption, dataSource);
	}

	public NumberField(String caption, String value) {
		super(caption, value);
	}

	public NumberField(String caption) {
		super(caption);
	}

	@Override
	protected NumberFieldState getState() {
		return (NumberFieldState) super.getState();
	}

	/**
	 * @return the minimum number to be entered (or null for any number)
	 */
	public Integer getMin() {
		return getState().min;
	}

	/**
	 * @param min
	 *            the minimum number to be entered (or null for any number)
	 */
	public void setMin(Integer min) {
		getState().min = min;
	}

	/**
	 * @return the maximum number to be entered (or null for any number)
	 */
	public Integer getMax() {
		return getState().max;
	}

	/**
	 * @param max
	 *            the maximum number to be entered (or null for any number)
	 */
	public void setMax(Integer max) {
		getState().max = max;
	}

	/**
	 * @return the step for the number to be entered (or null for any number)
	 */
	public Integer getStep() {
		return getState().step;
	}

	/**
	 * @param step
	 *            the step for the number to be entered (or null for any number)
	 */
	public void setStep(Integer step) {
		getState().step = step;
	}

}
