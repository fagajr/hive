/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.metastore.model;

import java.io.Serializable;
import java.util.Map;

public class MRegionStorageDescriptor implements Serializable {

  private String regionName;
  private String location;

  public MRegionStorageDescriptor() {}

  /**
   * @param regionName
   * @param location
   */
  public MRegionStorageDescriptor(
    String regionName,
    String location) {
    this.regionName = regionName;
    this.location = location;
  }


  /**
   * @return region name
   */
  public String getRegionName() {
    return regionName;
  }

  /**
   * @param regionName
   */
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  /**
   * @return data location stored in this region descriptor
   */
  public String getLocation() {
    return location;
  }

  /**
   * @param location in this region descriptor
   */
  public void setLocation(String location) {
    this.location = location;
  }
}
