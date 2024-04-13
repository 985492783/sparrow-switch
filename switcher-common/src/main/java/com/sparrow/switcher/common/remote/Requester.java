/*
 * Copyright 1999-2020 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sparrow.switcher.common.remote;

import com.sparrow.switcher.common.remote.exception.SparrowException;
import com.sparrow.switcher.common.remote.request.Request;
import com.sparrow.switcher.common.remote.response.Response;

/**
 * connection interface,define basic operation.
 *
 * @author liuzunfei
 * @version $Id: Requester.java, v 0.1 2020年09月11日 4:05 PM liuzunfei Exp $
 */
public interface Requester {
    

    Response request(Request request, long timeoutMills) throws SparrowException;

    /**
     * close connection.
     */
    void close();
    
}