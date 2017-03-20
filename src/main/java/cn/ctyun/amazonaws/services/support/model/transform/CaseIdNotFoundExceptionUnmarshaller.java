/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package cn.ctyun.amazonaws.services.support.model.transform;

import cn.ctyun.amazonaws.AmazonServiceException;
import cn.ctyun.amazonaws.services.support.model.CaseIdNotFoundException;
import cn.ctyun.amazonaws.transform.JsonErrorUnmarshaller;
import cn.ctyun.amazonaws.util.json.JSONObject;

public class CaseIdNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public CaseIdNotFoundExceptionUnmarshaller() {
        super(CaseIdNotFoundException.class);
    }

    public AmazonServiceException unmarshall(JSONObject json) throws Exception {
        // Bail out if this isn't the right error code that this
        // marshaller understands.
        String errorCode = parseErrorCode(json);
        if (errorCode == null || !errorCode.equals("CaseIdNotFound"))
            return null;

        CaseIdNotFoundException e = (CaseIdNotFoundException)super.unmarshall(json);
        
        
        return e;
    }
}
    