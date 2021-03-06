/**
 * Copyright (c) 2013 SAP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the SAP nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SAP BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sopeco.webui.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;

/**
 * 
 * @author Marius Oehler
 * 
 */
public interface Resources extends ClientBundle {

	@Source("css/common.css")
	@CssResource.NotStrict
	CssResource cssCommon();

	@Source("css/experimentView.css")
	@CssResource.NotStrict
	CssResource cssExperiment();

	@Source("css/csvEditor.css")
	@CssResource.NotStrict
	CssResource cssCsvEditor();

	@Source("css/specificationView.css")
	@CssResource.NotStrict
	CssResource cssSpecification();

	@Source("css/topNavigation.css")
	@CssResource.NotStrict
	CssResource cssTopNavigation();

	@Source("css/scenarioAddView.css")
	@CssResource.NotStrict
	CssResource cssScenarioAdd();

	@Source("css/sopecoTabPanel.css")
	@CssResource.NotStrict
	CssResource cssSopecoTabPanel();

	@Source("css/controllerView.css")
	@CssResource.NotStrict
	CssResource cssControllerView();

	@Source("css/loginBox.css")
	@CssResource.NotStrict
	CssResource cssLoginBox();

	@Source("css/executeView.css")
	@CssResource.NotStrict
	CssResource cssExecuteView();

	@Source("visualizationView.css")
	@CssResource.NotStrict
	CssResource visualizationViewCss();

	@Source("visualizationWizard.css")
	@CssResource.NotStrict
	CssResource visualizationWizardCss();

	@Source("css/navigation.css")
	@CssResource.NotStrict
	CssResource cssNavigation();

	@Source("css/mecSettingsView.css")
	@CssResource.NotStrict
	CssResource cssMECSettingsView();

	/** IMAGES. */

	@Source("images/background_noise.png")
	DataResource imgBackgroundNoise();

	@Source("images/background_noise_2.png")
	DataResource imgBackgroundNoise2();

	@Source("images/database_add.png")
	ImageResource imgIconDatabaseAdd();

	@Source("images/database_remove.png")
	ImageResource imgIconDatabaseRemove();

	@Source("images/sap_research_gray_orange.png")
	ImageResource imgSapResearchGrayOrange();

	@Source("images/sap_research_gray.png")
	ImageResource imgSapResearchGray();

	@Source("images/loading_indicator.gif")
	ImageResource imgLoadingIndicatorCircle();

	@Source("images/flag_de.png")
	ImageResource imgFlagDe();

	@Source("images/flag_en.png")
	ImageResource imgFlagEn();

	@Source("images/sopeco-logo.png")
	DataResource imgSoPeCoLogo();

	@Source("images/sopeco-logo-gray.png")
	DataResource imgSopecoLogoGray();

	@Source("images/sopeco-icon-set.png")
	DataResource imgIconSet();

}
