/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeScalingActivitiesResult implements Serializable, Cloneable {

    /**
     * The scaling activities.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Activity> activities;

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The scaling activities.
     *
     * @return The scaling activities.
     */
    public java.util.List<Activity> getActivities() {
        if (activities == null) {
              activities = new com.amazonaws.internal.ListWithAutoConstructFlag<Activity>();
              activities.setAutoConstruct(true);
        }
        return activities;
    }
    
    /**
     * The scaling activities.
     *
     * @param activities The scaling activities.
     */
    public void setActivities(java.util.Collection<Activity> activities) {
        if (activities == null) {
            this.activities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Activity> activitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Activity>(activities.size());
        activitiesCopy.addAll(activities);
        this.activities = activitiesCopy;
    }
    
    /**
     * The scaling activities.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setActivities(java.util.Collection)} or {@link
     * #withActivities(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activities The scaling activities.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScalingActivitiesResult withActivities(Activity... activities) {
        if (getActivities() == null) setActivities(new java.util.ArrayList<Activity>(activities.length));
        for (Activity value : activities) {
            getActivities().add(value);
        }
        return this;
    }
    
    /**
     * The scaling activities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activities The scaling activities.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScalingActivitiesResult withActivities(java.util.Collection<Activity> activities) {
        if (activities == null) {
            this.activities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Activity> activitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Activity>(activities.size());
            activitiesCopy.addAll(activities);
            this.activities = activitiesCopy;
        }

        return this;
    }

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScalingActivitiesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActivities() != null) sb.append("Activities: " + getActivities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivities() == null) ? 0 : getActivities().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScalingActivitiesResult == false) return false;
        DescribeScalingActivitiesResult other = (DescribeScalingActivitiesResult)obj;
        
        if (other.getActivities() == null ^ this.getActivities() == null) return false;
        if (other.getActivities() != null && other.getActivities().equals(this.getActivities()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeScalingActivitiesResult clone() {
        try {
            return (DescribeScalingActivitiesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    