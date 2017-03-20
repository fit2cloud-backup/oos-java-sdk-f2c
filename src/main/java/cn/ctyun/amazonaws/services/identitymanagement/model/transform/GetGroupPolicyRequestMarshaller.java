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
package cn.ctyun.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.ctyun.amazonaws.AmazonClientException;
import cn.ctyun.amazonaws.DefaultRequest;
import cn.ctyun.amazonaws.Request;
import cn.ctyun.amazonaws.services.identitymanagement.model.*;
import cn.ctyun.amazonaws.transform.Marshaller;
import cn.ctyun.amazonaws.util.StringUtils;

/**
 * Get Group Policy Request Marshaller
 */
public class GetGroupPolicyRequestMarshaller implements Marshaller<Request<GetGroupPolicyRequest>, GetGroupPolicyRequest> {

    public Request<GetGroupPolicyRequest> marshall(GetGroupPolicyRequest getGroupPolicyRequest) {

        if (getGroupPolicyRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<GetGroupPolicyRequest> request = new DefaultRequest<GetGroupPolicyRequest>(getGroupPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "GetGroupPolicy");
        request.addParameter("Version", "2010-05-08");

        if (getGroupPolicyRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(getGroupPolicyRequest.getGroupName()));
        }
        if (getGroupPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(getGroupPolicyRequest.getPolicyName()));
        }


        return request;
    }
}
