/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *     Michael Fiedler      - Bugzilla adpater implementations
 *     
 * Modifications performed by:    
 *     Axel Reichwein		- implementation for Simulink adapter
 *     (axel.reichwein@koneksys.com) 
 *******************************************************************************/
package org.eclipse.lyo.adapter.tdb.resources;


import org.eclipse.lyo.oslc4j.core.model.OslcConstants;

public interface Constants
{
		
//	public static String CHANGE_MANAGEMENT_DOMAIN                    = "http://open-services.net/ns/cm#";
//    public static String CHANGE_MANAGEMENT_NAMESPACE                 = "http://open-services.net/ns/cm#";
//    public static String CHANGE_MANAGEMENT_NAMESPACE_PREFIX          = "oslc_cm";
//    public static String FOAF_NAMESPACE                              = "http://xmlns.com/foaf/0.1/";
//    public static String FOAF_NAMESPACE_PREFIX                       = "foaf";
//    public static String QUALITY_MANAGEMENT_NAMESPACE                = "http://open-services.net/ns/qm#";
//    public static String QUALITY_MANAGEMENT_PREFIX                   = "oslc_qm";
//    public static String REQUIREMENTS_MANAGEMENT_NAMESPACE           = "http://open-services.net/ns/rm#";
//    public static String REQUIREMENTS_MANAGEMENT_PREFIX              = "oslc_rm";
//    public static String SOFTWARE_CONFIGURATION_MANAGEMENT_NAMESPACE = "http://open-services.net/ns/scm#";
//    public static String SOFTWARE_CONFIGURATION_MANAGEMENT_PREFIX    = "oslc_scm";   

	public static String MBSE_PREFIX							 = "mbse";
    public static String MBSE_NAMESPACE							 = "http://eclipse.org/MBSE/";
	
    public static String TDBRDF_PREFIX							 = "tdbrdf";
    public static String TDBRDF_NAMESPACE							 = "http://localhost:8585/oslc4jtdb/services/rdfvocabulary#";	
    

    public static String TDBRDF_RESOURCE_PREFIX                     	 = "tdbrdf_resource";

    

    public static String TDBRDF_RESOURCE_NAMESPACE                    = TDBRDF_NAMESPACE + "Resource/";

    
    

    public static String TYPE_TDBRDF_RESOURCE                    	= TDBRDF_NAMESPACE + "Resource";

    
    

    public static String TDBRDF_RESOURCE_DOMAIN                    	 = TDBRDF_NAMESPACE + "resources";

    


    public static String  PATH_TDBRDF_RESOURCE						= "resource";


    
//    public static String CHANGE_REQUEST             = "ChangeRequest";
//    public static String TYPE_CHANGE_REQUEST        = CHANGE_MANAGEMENT_NAMESPACE + "ChangeRequest";
//    public static String TYPE_CHANGE_SET            = SOFTWARE_CONFIGURATION_MANAGEMENT_NAMESPACE + "ChangeSet";
//    public static String TYPE_DISCUSSION            = OslcConstants.OSLC_CORE_NAMESPACE + "Discussion";
//    public static String TYPE_PERSON                = FOAF_NAMESPACE + "Person";
//    public static String TYPE_REQUIREMENT           = REQUIREMENTS_MANAGEMENT_NAMESPACE + "Requirement";
//    public static String TYPE_TEST_CASE             = QUALITY_MANAGEMENT_NAMESPACE + "TestCase";
//    public static String TYPE_TEST_EXECUTION_RECORD = QUALITY_MANAGEMENT_NAMESPACE + "TestExecutionRecord";
//    public static String TYPE_TEST_PLAN             = QUALITY_MANAGEMENT_NAMESPACE + "TestPlan";
//    public static String TYPE_TEST_RESULT           = QUALITY_MANAGEMENT_NAMESPACE + "TestResult";
//    public static String TYPE_TEST_SCRIPT           = QUALITY_MANAGEMENT_NAMESPACE + "TestScript";

    

    
    
    

   
    
    public static final String HDR_OSLC_VERSION = "OSLC-Core-Version";
    
    
}
