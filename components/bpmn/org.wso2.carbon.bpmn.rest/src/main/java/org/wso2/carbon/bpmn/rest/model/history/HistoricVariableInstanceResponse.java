/**
 *  Copyright (c) 2015 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */



package org.wso2.carbon.bpmn.rest.model.history;


import org.wso2.carbon.bpmn.rest.engine.variable.RestVariable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "HistoricVariableInstanceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class HistoricVariableInstanceResponse {
  
  protected String id;
  protected String processInstanceId;
  protected String processInstanceUrl;
  protected String taskId;
  @XmlElement(name = "RestVariable", type = RestVariable.class)
  protected RestVariable variable;
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getProcessInstanceId() {
    return processInstanceId;
  }
  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }
  public String getProcessInstanceUrl() {
    return processInstanceUrl;
  }
  public void setProcessInstanceUrl(String processInstanceUrl) {
    this.processInstanceUrl = processInstanceUrl;
  }
  public String getTaskId() {
    return taskId;
  }
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }
  public RestVariable getVariable() {
    return variable;
  }
  public void setVariable(RestVariable variable) {
    this.variable = variable;
  }
}
