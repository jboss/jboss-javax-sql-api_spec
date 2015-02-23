/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2015 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.sql;

import java.sql.SQLException;
import java.util.EventObject;

/**
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public class ConnectionEvent extends EventObject {

    private static final long serialVersionUID = -4843217645290030002L;

    private final SQLException ex;

    public ConnectionEvent(final PooledConnection source, final SQLException ex) {
        super(source);
        this.ex = ex;
    }

    public ConnectionEvent(final PooledConnection source) {
        super(source);
        this.ex = null;
    }

    public SQLException getSQLException() {
        return ex;
    }
}
