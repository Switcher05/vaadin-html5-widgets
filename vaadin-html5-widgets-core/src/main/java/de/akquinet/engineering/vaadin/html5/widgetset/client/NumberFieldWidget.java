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
package de.akquinet.engineering.vaadin.html5.widgetset.client;

import com.vaadin.client.ui.VTextField;

public class NumberFieldWidget extends VTextField {

	public static final String CLASSNAME = "v-numberfield";

	public NumberFieldWidget() {
		addStyleName(CLASSNAME);
		getElement().setPropertyString("type", "number");
	}

	public void setMin(Integer min) {
		if (min == null) {
			getElement().setPropertyString("min", "");
		} else {
			getElement().setPropertyString("min", min.toString());
		}
	}

	public void setMax(Integer max) {
		if (max == null) {
			getElement().setPropertyString("max", "");
		} else {
			getElement().setPropertyString("max", max.toString());
		}
	}

	public void setStep(Integer step) {
		if (step == null) {
			getElement().setPropertyString("step", "");
		} else {
			getElement().setPropertyString("step", step.toString());
		}
	}

}